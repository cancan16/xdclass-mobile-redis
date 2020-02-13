package com.xdclass.mobile.xdclassmobileredis.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestCluster {
    public void testRedisCluster() throws IOException {
        JedisPoolConfig pool = new JedisPoolConfig();
        // 设置最大的空闲数
        pool.setMaxIdle(2);
        // 设置最大连接数
        pool.setMaxTotal(30);
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.25.11", 7003));
        nodes.add(new HostAndPort("192.168.25.11", 7000));
        nodes.add(new HostAndPort("192.168.25.11", 7004));
        nodes.add(new HostAndPort("192.168.25.11", 7001));
        nodes.add(new HostAndPort("192.168.25.11", 7005));
        nodes.add(new HostAndPort("192.168.25.11", 7002));
        JedisCluster jedis = new JedisCluster(nodes, pool);
        String name = jedis.set("name", "lisi");
        System.out.println(name);
        jedis.close();
        pool.clone();
    }

    public static void main(String[] args) throws IOException {
        new TestCluster().testRedisCluster();
    }
}

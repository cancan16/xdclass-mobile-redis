package cglib;

import net.sf.cglib.proxy.Enhancer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class CglibTest {

    public static void main(String... args) {
        System.out.println("***************");
        CglibTest test = new CglibTest();
        Target proxyTarget = (Target) test.createProxy(Target.class);
        String res = proxyTarget.execute();
        System.out.println(res);
    }

    public Object createProxy(Class targetClass) {
        ConcurrentLinkedQueue<Object> objects = new ConcurrentLinkedQueue<>();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }

}
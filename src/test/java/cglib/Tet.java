package cglib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Tet {
    public static void main(String[] args) {

        new HashMap<>().put();
        new ReentrantLock();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(System.identityHashCode(arrayList.get(0)));
        System.out.println(System.identityHashCode(arrayList.get(1)));
        System.out.println(arrayList);
        System.out.println(arrayList.get(1).hashCode());
    }

}

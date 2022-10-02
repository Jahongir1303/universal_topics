package com.company.threads;

public class ThreadTestSynchronizedExchanger {
    private static Object object = null;

    public static synchronized void setObject(Object o) {
        object = o;
    }

    public static synchronized Object getObject() {
        return object;
    }

    public static void setObj(Object o) {
        synchronized (ThreadTestSynchronizedExchanger.class) {
            object = o;
        }

    }

    public static Object getObj() {
        synchronized (ThreadTestSynchronizedExchanger.class) {
            return object;
        }

    }


}

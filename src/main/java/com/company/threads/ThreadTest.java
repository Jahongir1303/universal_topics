package com.company.threads;

import java.util.Arrays;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        Main main1 = new Main();
//        System.out.println(main1.hashCode());

//        System.out.println("Thread.currentThread() = " + Thread.currentThread());
//        System.out.println("Thread.activeCount() = " + Thread.activeCount());
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        System.out.println("Thread.currentThread().getContextClassLoader() = " + Thread.currentThread().getContextClassLoader());
//        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
//        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
//        System.out.println("Thread.currentThread().getThreadGroup() = " + Thread.currentThread().getThreadGroup());
//        System.out.println("Thread.currentThread().getState() = " + Thread.currentThread().getState());
//        System.out.println("Thread.currentThread().isDaemon() = " + Thread.currentThread().isDaemon());
//        System.out.println("Thread.currentThread().getStackTrace() = " + Arrays.toString(Thread.currentThread().getStackTrace()));
//        System.out.println("Thread.currentThread().getUncaughtExceptionHandler() = " + Thread.currentThread().getUncaughtExceptionHandler());
//        System.out.println("Thread.currentThread().isInterrupted() = " + Thread.currentThread().isInterrupted());


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("\"Runnable running\" = " + "Runnable running");
//            }
//        };
//        Thread runnableThread = new Thread(runnable);
//        runnableThread.start();
//        System.out.println("runnableThread.getName() = " + runnableThread.getName());
//        System.out.println("runnableThread.getPriority() = " + runnableThread.getPriority());
//
//        Thread runnableThread2 = new Thread(runnable);
//        runnableThread2.start();
//        System.out.println("runnableThread2.getName() = " + runnableThread2.getName());
//        System.out.println("runnableThread2.getPriority() = " + runnableThread2.getPriority());

        byte b = 127;
        System.out.println((byte)(b + 10));

//        SynchronizedExchanger exchanger = new SynchronizedExchanger();
//        Thread thread1 = new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        for (int i = 0; i < 1000; i++) {
//                            exchanger.setObject("" + i);
//                        }
//                    }
//                }
//        );
//
        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
//                        for (int i = 0; i < 1000; i++) {
//                            System.out.println(exchanger.getObject());
//                        }
                        Integer integer = 5;
                        System.out.println("Hello Jakhongir");
                        try {
                            Thread.sleep(6000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("I am pretty well!");
                    }
                }
        );
//
//        thread1.start();
        thread2.start();

        thread2.wait(10000);





    }

}

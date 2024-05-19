package com.coding.java.corejava;

 import java.util.concurrent.*;

 // Thread Pool is known as ExecutorService
public class ExecutorServiceDemo {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        CallableThreadDemo callableThreadDemo = new CallableThreadDemo();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++){
            Future  future = executor.submit(callableThreadDemo);

            System.out.println(future.get());
        }
        executor.shutdown();
    }


    public static class CallableThreadDemo implements Callable {

        @Override
        public Object call() throws Exception {
            System.out.println(Thread.currentThread().getName());
            int sum=0;
            for(int i =0 ; i <=10; i++){
                sum=sum+i;

            }
            return sum;
        }
    }
}

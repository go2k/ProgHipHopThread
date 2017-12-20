package com.sabel.hiphop;

public class Testklasse {


    public static void main(String[] args) {

        HipRunnable hop = new HipRunnable("Hop", 1000);
        new Thread(hop).start();
//        HipRunnable hip = new HipRunnable("Hip", 750);
//        new Thread(hip).start();

        HipThread hipThread1 = new HipThread(500, "Hip");
        hipThread1.start();
//        HipThread hipThread2 = new HipThread(800, "Hop");
//        hipThread2.start();

        System.out.println(hipThread1.getName());
        System.out.println(hipThread1.getPriority());
//        System.out.println(hipThread2.getName());
//        System.out.println(hipThread2.getPriority());

    }
}

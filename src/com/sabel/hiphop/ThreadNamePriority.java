package com.sabel.hiphop;

public class ThreadNamePriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }

}

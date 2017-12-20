package com.sabel.hiphop;

import javafx.beans.binding.When;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class Threadverwalter implements Runnable {

    private String name;
    private int counter;
    private Thread thread;


    public Threadverwalter(String name) {
        //this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException geworfen");
                break;
            }
        }
        System.out.println("thread beendet");
    }
    public static void main(String[] args) throws IOException {

        Threadverwalter threadverwalter = new Threadverwalter("");


        Scanner scanner = new Scanner(System.in);
        String eingabe = "";
        int i = 0;

        Ausgabe();

        while (true) {
            eingabe = scanner.nextLine();
            switch (eingabe) {
                case "s":
                    threadverwalter.start();
                    break;
                case "b":
                    threadverwalter.stop();
                    break;
                case "q":
                    threadverwalter.stop();
                    System.exit(0);
                    break;
            }
            Ausgabe();
        }
    }


    private static void Ausgabe() {
        System.out.println("s - Start");
        System.out.println("b - Stop");
        System.out.println("q - Exit");
    }

    public void stop() {
        if (this.thread != null) {
            this.thread.interrupt();
        }
        this.thread = null;
    }

    public void start() {
        if (this.thread == null) {
            this.thread = new Thread(this,"Thread Nummer" + ++counter);
            this.thread.start();
        }
    }
}

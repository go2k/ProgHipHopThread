package com.sabel.hiphop;

public class HipRunnable implements Runnable {

    private String text;
    private int delay;

    public HipRunnable(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(text);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

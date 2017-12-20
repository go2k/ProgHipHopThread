package com.sabel.hiphop;

public class HipThread extends Thread {

    private int delay;
    private String text;

    public HipThread(int delay, String text) {
        super("HipThread");
        this.delay = delay;
        this.text = text;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println(text);
            try {
                this.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}

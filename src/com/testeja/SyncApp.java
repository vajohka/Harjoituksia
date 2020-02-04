package com.testeja;

public class SyncApp {
    public static void main(String[] args) {

        System.out.println("==Application Started==");

        Tulostin tulostin = new Tulostin();
        //tulostin.tulostaDokumentteja(10,"YkkösenProfiili.pdf");

        MinunThread mRef = new MinunThread(tulostin);
        SinunThread yRef = new SinunThread(tulostin);

        mRef.start();
        try {
            mRef.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        yRef.start();

        System.out.println("==Application Finished==");
    }
}

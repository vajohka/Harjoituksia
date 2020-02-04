package com.testeja;

public class MinunThread extends Thread{

    Tulostin pRef;

    MinunThread(Tulostin p){
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.tulostaDokumentteja(10, "KakkosenProfiili.pdf");
        }
    }

}

package com.testeja;

public class SinunThread extends Thread{

    Tulostin pRef;

    SinunThread(Tulostin p){
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.tulostaDokumentteja(10, "KolmosenProfiili.pdf");
        }
    }

}

package com.testeja;

public class Tulostin {

    void tulostaDokumentteja(int numOfCopies, String docName){
        for (int i=1; i<=numOfCopies; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}

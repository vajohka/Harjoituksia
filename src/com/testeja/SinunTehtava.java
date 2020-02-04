package com.testeja;

public class SinunTehtava implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("** Tulostetaan dokumentti #" +doc+ " Tulostin3");
        }
    }
}

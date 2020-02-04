package com.testeja;

/*public class MinunTehtava {
    void excecuteTask(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Tulostetaan dokumentti #" +doc+ " Tulostin2");
        }
    }
}*/

public class MinunTehtava implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Tulostetaan dokumentti #" +doc+ " Tulostin2");
        }
    }
}
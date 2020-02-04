package com.testeja;

public class Main {

    public static void main(String[] args) {

        //Työ1
        System.out.println("==Sovellus käynnistyi==");

        //Työ2
        MinunTehtava task = new MinunTehtava();
        task.excecuteTask();

        //Ennenkuin Työ2 on tehty, alla oleva koodi on waiting-tilassa eikä sitä suoriteta

        //Työ3
        //Printtaa dokumentteja
        for(int doc=1; doc<=10; doc++){
            System.out.println(("^^ Tulostetaan dokumentti #"+doc+" - Tulostin 1"));
        }

        //Työ4
        System.out.println("==Sovellus suoritti tehtävänsä");
    }
}

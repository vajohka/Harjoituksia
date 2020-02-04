package com.testeja;

public class Main {

    public static void main(String[] args) {

        //Työ1
        System.out.println("==Sovellus käynnistyi==");

        //Työ2
        //MinunTehtava task = new MinunTehtava(); // Child Thread / Worker Thread
        //task.excecuteTask();
        //task.start(); // --> Käynnistää sisäisesti run-metodin


        new Thread(new MinunTehtava()).start();

        //Thread sinunTehtava = new Thread(new SinunTehtava());
        //sinunTehtava.start();

        new Thread(new SinunTehtava()).start();

        //Ennenkuin Työ2 on tehty, alla oleva koodi on waiting-tilassa eikä sitä suoriteta
        //Jos sovellus tekee kauan kestävää tehtävää, esim. useita dokumentteja tulsotetaan
        //Tälläin OS/JVM tulee antaa viesti, että ohjelma ei vastaa
        //Sovelluksessa havaitaan jotain hidasta toimintaa --> Sovellus näyttää jumittavan



        //Työ3
        //Printtaa dokumentteja
        for(int doc=1; doc<=10; doc++){
            System.out.println(("^^ Tulostetaan dokumentti #"+doc+" - Tulostin 1"));
        }

        //Työ4
        System.out.println("==Sovellus suoritti tehtävänsä");
    }
}

package com.company;

import java.util.concurrent.Semaphore;

public class Cuadrilatero {

    private static final int participantes = 2;
    public static final Semaphore available = new Semaphore(participantes,true);



    public static void addparticipante() throws InterruptedException{
        available.acquire();
    }

    public static void acabarCombate(Luchador luchador) throws InterruptedException{

        available.release();
    }

}

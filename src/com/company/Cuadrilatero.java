package com.company;

import java.util.concurrent.Semaphore;

public class Cuadrilatero {

    private static final int participantes = 2;
    private final Semaphore available = new Semaphore(participantes,true);

    public static void addparticipante()  throws InterruptedException{
        available.notify();
    }

    public void acabarCombate(Luchador luchador){ available.release();}

}

package com.company;

import java.util.Random;

public class Luchador extends Thread {

    Cuadrilatero cuadrilatero;

    public Luchador (Cuadrilatero cuadrilatero) {this.cuadrilatero = cuadrilatero;}

    @Override
    public void run() {
        try {
            Cuadrilatero.addparticipante();
            System.out.println("El "+getName()+" empieza a luchar");
            System.out.println("Acaba de luchar");
            sleep(1000);
            Cuadrilatero.acabarCombate(this);
            boolean ganador = new Random().nextBoolean();
            if (ganador==true){
                System.out.println(getName()+" ha ganado");
            }
            else
                System.out.println(getName()+" ha perdido");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



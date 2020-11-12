package com.company;

public class Luchador extends Thread {

    Cuadrilatero cuadrilatero;

    public Luchador (Cuadrilatero cuadrilatero) {this.cuadrilatero = cuadrilatero;}

    @Override
    public void run() {
        try {
            Cuadrilatero.addparticipante();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Alex Ordonez
 */
public abstract class Pieza {
    private int n;
    private boolean c;

    public Pieza() {
    }

    public Pieza(int n, boolean c) {
        this.n = n;
        this.c = c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public boolean isC() {
        return c;
    }

    

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Pieza{" + "n=" + n + '}';
    }
    public abstract boolean movimiento_condicion(int ux,int uy,int[][] mat,int px,int py);
}

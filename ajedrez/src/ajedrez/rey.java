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
public class rey extends Pieza {

    private int mov = 0;

    public rey(boolean c) {
        super(7, c);
    }

    @Override
    public boolean movimiento_condicion(int ux, int uy, int[][] mat, int px, int py) {
        boolean l = false, k = false;
        if ((mat[ux][uy] > 0 && mat[px][py] < 1) || (mat[ux][uy] < 0 && mat[px][py] > -1)) {
            k = true;
        }
        if (k && ((px == ux + 1 && py == uy) || (px == ux + 1 && py == uy + 1) || (px == ux && py == uy + 1) || (px == ux - 1 && py == uy - 1)
                || (px == ux - 1 && py == uy + 1) || (px == ux && py == uy - 1) || (px == ux - 1 && py == uy) || (px == ux + 1 && py == uy - 1))) {
            l = true;
            mov++;
        }
        return l;
    }

    public int getMov() {
        return mov;
    }
}

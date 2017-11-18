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
public class peon extends Pieza {
    int mov=0;
    public peon(boolean c) {
        super(2, c);
    }

    @Override
    public boolean movimiento_condicion(int ux, int uy, int[][] mat, int px, int py) {
        boolean j = false;

        if (mat[ux][uy]==2&&((py == uy - 1 && mat[px][py] == 0 && px == ux)
                || ((mat[px][py] < 0) && (py == uy - 1 && (px == ux - 1 || px == ux + 1))) || (uy == 6 && py == uy - 2 && px == ux))) {
            mov++;
            j = true;
        }
        if (mat[ux][uy] == -2 && ((py == uy + 1 && mat[px][py] == 0 && px == ux)
                || ((mat[px][py] > 0) && (py == uy + 1 && (px == ux - 1 || px == ux + 1))) || (uy == 1 && py == uy + 2 && px == ux))) {
            mov++;
            j = true;
        }
        return j;
    }

    public int getMov() {
        return mov;
    }
    
}

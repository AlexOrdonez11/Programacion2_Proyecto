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
public class torre extends Pieza {
    private int mov=0;
    public torre(boolean c) {
        super(5,c);
    }

    @Override
    public boolean movimiento_condicion(int ux, int uy, int[][] mat, int px, int py) {
        boolean k=false,o=false;
        if(mat[ux][uy]>0&&mat[px][py]<1||mat[ux][uy]<0&&mat[px][py]>-1){
            k=true;
        }
        if ((px == ux || py == uy)&&k) {
            o = true;
            mov++;
        }
        return o;
    }

    public int getMov() {
        return mov;
    }
    

    
}

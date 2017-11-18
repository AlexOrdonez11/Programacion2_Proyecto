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
public class caballo extends Pieza {

    public caballo(boolean c) {
        super(3,c);
    }
    
    @Override
    public boolean movimiento_condicion(int ux,int uy,int[][] mat,int px,int py) {
        boolean j=false,k=false;
        if(mat[ux][uy]>0&&mat[px][py]<1||mat[ux][uy]<0&&mat[px][py]>-1){
            k=true;
        }
        if ((((px == ux - 2 || px == ux + 2) && (py == uy - 1 || py == uy + 1))
                                    || ((py == uy - 2 || py == uy + 2) && (px == ux - 1 || px == ux + 1)))&&k){
            j=true;
        }
        return j;
    
    }
}

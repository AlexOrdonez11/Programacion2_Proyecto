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
public class alfil extends Pieza{

    public alfil(boolean c) {
        super(4,c);
    }

    
    @Override
    public boolean movimiento_condicion(int ux, int uy, int[][] mat, int px, int py) {
        boolean k=false;
        int a = px - ux;
        int b = py - uy;
        boolean o = false;
        if(mat[ux][uy]>0&&mat[px][py]<1||mat[ux][uy]<0&&mat[px][py]>-1){
            k=true;
        }
        if (Math.abs(a) == Math.abs(b)&&k) {
            o = true;
        }
        return o;
        
    }    

    
    
}

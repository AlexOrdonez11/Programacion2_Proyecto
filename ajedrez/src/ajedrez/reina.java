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
public class reina extends Pieza{

    public reina(boolean c) {
        super(9,c);
    }
    
    @Override
    public boolean movimiento_condicion(int ux, int uy, int[][] mat, int px, int py) {
        boolean h = false,k=false;
        if(mat[ux][uy]>0&&mat[px][py]<1||mat[ux][uy]<0&&mat[px][py]>-1){
            k=true;
        }
        int a = px - ux;
        int b = py - uy;
        if (((px == ux || py == uy)||(Math.abs(a) == Math.abs(b)))&&k) {
            h = true;
        }
        return h;
    }

    
}

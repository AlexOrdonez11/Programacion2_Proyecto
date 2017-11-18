/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex Ordonez
 */
public class chess {

    static JFrame doblar;
    static JPanel peon;
    static JLabel[][] matri = new JLabel[8][8];
    static Pieza[][] math = new Pieza[8][8];
    static int[][] mat = new int[8][8];

    public static void main(String[] args) {
        doblar = new JFrame();
        doblar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doblar.setSize(602, 631);
        doblar.setLocationRelativeTo(null);
        panel();
        doblar.setVisible(true);
        JOptionPane.showMessageDialog(doblar, "Cosas Implementadas\n"
                + "1.Recursividad\n"
                + "2.Matrices\n"
                + "3.Clases\n"
                + "4.Herencia\n"
                + "5.Polimorfismo\n"
                + "6.GUI\n"
                + "7.Movimiento validado de todas las piezas\n"
                + "8.Enroque\n"
                + "9.Comer al Paso\n"
                + "10.Jaque\n"
                + "11.Jaque Mate");
    }

    public static void panel() {
        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat.length; y++) {
                matri[x][y] = new JLabel();
            }
        }
        peon = new JPanel();
        peon.setBounds(doblar.getBounds());
        peon.setLayout(null);
        peon.setVisible(true);
        mat = tablero();
        rellPiezas(0,0,tablero());
        cambio(0, 0, mat);
        fondo(0, 0, mat);
        cambio(0, 0, mat);
        movi();
        doblar.add(peon);
    }

    public static void RellPiezas(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 2) {
                    math[i][j] = new peon(true);
                }
                if (mat[i][j] == -2) {
                    math[i][j] = new peon(false);
                }
                if (mat[i][j] == 3) {
                    math[i][j] = new caballo(true);
                }
                if (mat[i][j] == -3) {
                    math[i][j] = new caballo(false);
                }
                if (mat[i][j] == 4) {
                    math[i][j] = new alfil(true);
                }
                if (mat[i][j] == -4) {
                    math[i][j] = new alfil(false);
                }
                if (mat[i][j] == 5) {
                    math[i][j] = new torre(true);
                }
                if (mat[i][j] == -5) {
                    math[i][j] = new torre(false);
                }
                if (mat[i][j] == 7) {
                    math[i][j] = new rey(true);
                }
                if (mat[i][j] == -7) {
                    math[i][j] = new rey(false);
                }
                if (mat[i][j] == 9) {
                    math[i][j] = new reina(true);
                }
                if (mat[i][j] == -9) {
                    math[i][j] = new reina(false);
                }
            }
        }
    }

    public static void rellPiezas(int i,int j,int[][] mat) {
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            if (mat[i][j] == 2) {
                math[i][j] = new peon(true);
            }
            if (mat[i][j] == -2) {
                math[i][j] = new peon(false);
            }
            if (mat[i][j] == 3) {
                math[i][j] = new caballo(true);
            }
            if (mat[i][j] == -3) {
                math[i][j] = new caballo(false);
            }
            if (mat[i][j] == 4) {
                math[i][j] = new alfil(true);
            }
            if (mat[i][j] == -4) {
                math[i][j] = new alfil(false);
            }
            if (mat[i][j] == 5) {
                math[i][j] = new torre(true);
            }
            if (mat[i][j] == -5) {
                math[i][j] = new torre(false);
            }
            if (mat[i][j] == 7) {
                math[i][j] = new rey(true);
            }
            if (mat[i][j] == -7) {
                math[i][j] = new rey(false);
            }
            if (mat[i][j] == 9) {
                math[i][j] = new reina(true);
            }
            if (mat[i][j] == -9) {
                math[i][j] = new reina(false);
            }
        } else {
            if (j == mat[0].length - 1) {
                if (mat[i][j] == 2) {
                    math[i][j] = new peon(true);
                }
                if (mat[i][j] == -2) {
                    math[i][j] = new peon(false);
                }
                if (mat[i][j] == 3) {
                    math[i][j] = new caballo(true);
                }
                if (mat[i][j] == -3) {
                    math[i][j] = new caballo(false);
                }
                if (mat[i][j] == 4) {
                    math[i][j] = new alfil(true);
                }
                if (mat[i][j] == -4) {
                    math[i][j] = new alfil(false);
                }
                if (mat[i][j] == 5) {
                    math[i][j] = new torre(true);
                }
                if (mat[i][j] == -5) {
                    math[i][j] = new torre(false);
                }
                if (mat[i][j] == 7) {
                    math[i][j] = new rey(true);
                }
                if (mat[i][j] == -7) {
                    math[i][j] = new rey(false);
                }
                if (mat[i][j] == 9) {
                    math[i][j] = new reina(true);
                }
                if (mat[i][j] == -9) {
                    math[i][j] = new reina(false);
                }
                rellPiezas(i + 1, 0, mat);
            } else {
                if (mat[i][j] == 2) {
                    math[i][j] = new peon(true);
                }
                if (mat[i][j] == -2) {
                    math[i][j] = new peon(false);
                }
                if (mat[i][j] == 3) {
                    math[i][j] = new caballo(true);
                }
                if (mat[i][j] == -3) {
                    math[i][j] = new caballo(false);
                }
                if (mat[i][j] == 4) {
                    math[i][j] = new alfil(true);
                }
                if (mat[i][j] == -4) {
                    math[i][j] = new alfil(false);
                }
                if (mat[i][j] == 5) {
                    math[i][j] = new torre(true);
                }
                if (mat[i][j] == -5) {
                    math[i][j] = new torre(false);
                }
                if (mat[i][j] == 7) {
                    math[i][j] = new rey(true);
                }
                if (mat[i][j] == -7) {
                    math[i][j] = new rey(false);
                }
                if (mat[i][j] == 9) {
                    math[i][j] = new reina(true);
                }
                if (mat[i][j] == -9) {
                    math[i][j] = new reina(false);
                }
                rellPiezas(i, j + 1, mat);
            }
        }

    }

    public static void fondo(int i, int j, int[][] mat) {
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            if (i % 2 == 0) {
                if (j % 2 == 0) {
                    JPanel n = new JPanel();
                    n.setBounds(matri[i][j].getBounds());
                    n.setBackground(Color.GRAY);
                    n.setVisible(true);
                    peon.add(n, 0);
                } else {
                    JPanel n = new JPanel();
                    n.setBounds(matri[i][j].getBounds());
                    n.setBackground(Color.DARK_GRAY);
                    n.setVisible(true);
                    peon.add(n, 0);
                }
            } else {
                if (j % 2 == 0) {
                    JPanel n = new JPanel();
                    n.setBounds(matri[i][j].getBounds());
                    n.setBackground(Color.DARK_GRAY);
                    n.setVisible(true);
                    peon.add(n, 0);
                } else {
                    JPanel n = new JPanel();
                    n.setBounds(matri[i][j].getBounds());
                    n.setBackground(Color.GRAY);
                    n.setVisible(true);
                    peon.add(n, 0);
                }
            }
        } else {
            if (j == mat[0].length - 1) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    } else {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.DARK_GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    }
                } else {
                    if (j % 2 == 0) {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.DARK_GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    } else {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    }
                }
                fondo(i + 1, 0, mat);
            } else {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    } else {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.DARK_GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    }
                } else {
                    if (j % 2 == 0) {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.DARK_GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    } else {
                        JPanel n = new JPanel();
                        n.setBounds(matri[i][j].getBounds());
                        n.setBackground(Color.GRAY);
                        n.setVisible(true);
                        peon.add(n, 0);
                    }
                }
                fondo(i, j + 1, mat);
            }
        }

    }

    public static void cambio(int x, int y, int mat[][]) {
        if (x == mat.length - 1 && y == mat[0].length - 1) {
            if (math[x][y] == null) {
                matri[x][y].setIcon(new ImageIcon("pic_aje/" + "0" + ".png"));
                matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                matri[x][y].setVisible(true);
                peon.add(matri[x][y], 0);
            } else {
                if (math[x][y].isC()) {
                    matri[x][y].setIcon(new ImageIcon("pic_aje/" + math[x][y].getN() + ".png"));
                    matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                    matri[x][y].setVisible(true);
                    peon.add(matri[x][y], 0);
                } else {
                    matri[x][y].setIcon(new ImageIcon("pic_aje/" + "-" + math[x][y].getN() + ".png"));
                    matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                    matri[x][y].setVisible(true);
                    peon.add(matri[x][y], 0);
                }
            }
        } else {
            if (y == mat[0].length - 1) {
                if (math[x][y] == null) {
                    matri[x][y].setIcon(new ImageIcon("pic_aje/" + "0" + ".png"));
                    matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                    matri[x][y].setVisible(true);
                    peon.add(matri[x][y], 0);
                } else {
                    if (math[x][y].isC()) {
                        matri[x][y].setIcon(new ImageIcon("pic_aje/" + math[x][y].getN() + ".png"));
                        matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                        matri[x][y].setVisible(true);
                        peon.add(matri[x][y], 0);
                    } else {
                        matri[x][y].setIcon(new ImageIcon("pic_aje/" + "-" + math[x][y].getN() + ".png"));
                        matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                        matri[x][y].setVisible(true);
                        peon.add(matri[x][y], 0);
                    }
                }
                cambio(x + 1, 0, mat);
            } else {
                if (math[x][y] == null) {
                    matri[x][y].setIcon(new ImageIcon("pic_aje/" + "0" + ".png"));
                    matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                    matri[x][y].setVisible(true);
                    peon.add(matri[x][y], 0);
                } else {
                    if (math[x][y].isC()) {
                        matri[x][y].setIcon(new ImageIcon("pic_aje/" + math[x][y].getN() + ".png"));
                        matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                        matri[x][y].setVisible(true);
                        peon.add(matri[x][y], 0);
                    } else {
                        matri[x][y].setIcon(new ImageIcon("pic_aje/" + "-" + math[x][y].getN() + ".png"));
                        matri[x][y].setBounds(x * 73, y * 73, 73, 73);
                        matri[x][y].setVisible(true);
                        peon.add(matri[x][y], 0);
                    }
                }
                cambio(x, y + 1, mat);
            }
        }
    }

    public static int[][] tablero() {
        int[][] m = {
            {-5, -2, 0, 0, 0, 0, 2, 5},
            {-3, -2, 0, 0, 0, 0, 2, 3},
            {-4, -2, 0, 0, 0, 0, 2, 4},
            {-9, -2, 0, 0, 0, 0, 2, 9},
            {-7, -2, 0, 0, 0, 0, 2, 7},
            {-4, -2, 0, 0, 0, 0, 2, 4},
            {-3, -2, 0, 0, 0, 0, 2, 3},
            {-5, -2, 0, 0, 0, 0, 2, 5},};
        return m;
    }
    static boolean boo = false;
    static boolean va = false;
    static int ux, uy, turno = 0, turno1 = 0, turnoac;

    public static void movi() {
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri.length; j++) {
                JLabel k = matri[i][j];
                int px = i;
                int py = j;
                matri[i][j].addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (boo == false) {
                            if ((va == false && mat[px][py] > 0) || (va == true && mat[px][py] < 0)) {
                                JPanel n = new JPanel();
                                n.setBounds(k.getBounds());
                                n.setBackground(Color.GREEN);
                                n.setVisible(true);
                                fondo(0, 0, mat);
                                peon.add(n, 0);
                                cambio(0, 0, mat);
                                ux = px;
                                uy = py;
                                boo = true;
                                if (va == false) {
                                    va = true;
                                    turno++;
                                } else {
                                    va = false;
                                    turno1++;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna de sus piezas");
                            }
                        } else {
                            System.out.println(ux + " " + uy + " " + math[ux][uy]);
                            boo = false;
                            if (val_movimiento(ux, uy, px, py) && math[ux][uy] instanceof caballo && jake(px, py, math, mat) && Check(px, py)) {
                                System.out.println("m");
                                mat[px][py] = mat[ux][uy];
                                mat[ux][uy] = 0;
                                math[px][py] = math[ux][uy];
                                math[ux][uy] = null;
                                fondo(0, 0, mat);
                                cambio(0, 0, mat);
                            } else {
                                if (val_movimiento(ux, uy, px, py) && piezas_intermedias(px, py, ux, uy, mat) && jake(px, py, math, mat) && Check(px, py)) {
                                    if (mat[ux][uy] == 2 && py == 0) {
                                        coronacion(px, py);
                                    } else {
                                        if (mat[ux][uy] == -2 && py == 7) {
                                            coronacion(px, py);
                                        } else {
                                            if (mat[ux][uy] == 2 && py == uy - 2) {
                                                turnoac = turno;
                                                System.out.println(((peon) math[ux][uy]).getMov());
                                            } else {
                                                if (mat[ux][uy] == -2 && py == uy + 2) {
                                                    turnoac = turno1;
                                                }
                                            }

                                            mat[px][py] = mat[ux][uy];
                                            mat[ux][uy] = 0;
                                            math[px][py] = math[ux][uy];
                                            math[ux][uy] = null;
                                            fondo(0, 0, mat);
                                            cambio(0, 0, mat);
                                        }
                                    }

                                } else {
                                    if (enroque(px, py) && jake(px, py, math, mat)) {
                                    } else {
                                        if (comer_paso(px, py)) {
                                        } else {
                                            if (Check_Mate(px, py)) {
                                                if (turno - turno1 == 1) {
                                                    JOptionPane.showMessageDialog(peon, "Han ganado las Negras");
                                                } else {
                                                    if (turno - turno1 == 0) {
                                                        JOptionPane.showMessageDialog(peon, "Han ganado las Blancas");
                                                    }
                                                }
                                                doblar.dispose();
                                            }
                                            if (va == false) {
                                                va = true;
                                                turno++;
                                            } else {
                                                va = false;
                                                turno1++;
                                            }
                                        }
                                    }
                                }
                            }
                            fondo(0, 0, mat);
                            cambio(0, 0, mat);

                        }
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mousePressed(MouseEvent e
                    ) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseReleased(MouseEvent e
                    ) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseEntered(MouseEvent e
                    ) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseExited(MouseEvent e
                    ) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
        }
    }

    public static boolean enroque(int px, int py) {
        if (math[ux][uy] instanceof rey) {
            boolean d = false, c = false;
            if (px + 1 < 8) {
                d = true;
            }
            if (px - 2 > -1) {
                c = true;
            }

            if (d && math[px + 1][py] instanceof torre && ((rey) math[ux][uy]).getMov() == 0 && mat[px][py] == 0 && piezas_intermedias(px, py, ux, uy, mat)) {
                System.out.println("j");
                if (((torre) math[px + 1][py]).getMov() == 0) {
                    System.out.println("en");
                    mat[px][py] = mat[ux][uy];
                    mat[ux][uy] = 0;
                    mat[px - 1][py] = mat[px + 1][py];
                    mat[px + 1][py] = 0;
                    math[px][py] = math[ux][uy];
                    math[px - 1][py] = math[px + 1][py];
                    math[ux][uy] = null;
                    math[px + 1][py] = null;
                    return true;
                }
            } else {
                if (c && math[px - 2][py] instanceof torre && ((rey) math[ux][uy]).getMov() == 0 && mat[px - 1][py] == 0 && mat[px][py] == 0 && piezas_intermedias(px, py, ux, uy, mat)) {
                    System.out.println("k");
                    if (((torre) math[px - 2][py]).getMov() == 0) {
                        System.out.println("k");
                        mat[px][py] = mat[ux][uy];
                        mat[ux][uy] = 0;
                        mat[px + 1][py] = mat[px - 2][py];
                        mat[px - 2][py] = 0;
                        math[px][py] = math[ux][uy];
                        math[px + 1][py] = math[px - 2][py];
                        math[ux][uy] = null;
                        math[px - 2][py] = null;
                        return true;
                    }
                }

            }
        }

        return false;
    }

    public static boolean piezas_intermedias(int px, int py, int ux, int uy, int[][] mat) {
        boolean p = true;
        int a = px - ux;
        int b = py - uy, z = a;
        int cx = 0, cy = 0;
        if (a < 0) {
            cx = -1;
        } else {
            if (a == 0) {
                z = b;
            } else {
                cx = 1;
            }
        }
        if (b < 0) {
            cy = -1;
        } else {
            if (b == 0) {
            } else {
                cy = 1;
            }
        }
        for (int i = 0; i < Math.abs(z) - 1; i++) {
            if (mat[ux + cx][uy + cy] != 0) {
                System.out.println("n");
                p = false;
            } else {
                if (cx < 0) {
                    cx--;
                } else {
                    if (cx == 0) {

                    } else {
                        cx++;
                    }
                }
                if (cy < 0) {
                    cy--;
                } else {
                    if (cy == 0) {

                    } else {
                        cy++;
                    }
                }
            }
        }
        return p;
    }

    public static boolean comer_paso(int px, int py) {
        if (math[ux][uy] instanceof peon) {
            System.out.println("q");
            if (mat[px][py + 1] == -2) {
                System.out.println("y");
                if (((peon) math[px][py + 1]).getMov() == 2 && turno - turnoac == 1) {
                    System.out.println("j");
                    mat[px][py] = mat[ux][uy];
                    mat[ux][uy] = 0;
                    mat[px][py + 1] = 0;
                    math[px][py] = math[ux][uy];
                    math[ux][uy] = null;
                    math[px][py + 1] = null;
                    return true;
                }
            } else {
                if (mat[px][py - 1] == 2) {
                    System.out.println("x");
                    if (((peon) math[px][py - 1]).getMov() == 2 && turno1 - turnoac == 0) {
                        System.out.println("h");
                        mat[px][py] = mat[ux][uy];
                        mat[ux][uy] = 0;
                        mat[px][py - 1] = 0;
                        math[px][py] = math[ux][uy];
                        math[ux][uy] = null;
                        math[px][py - 1] = null;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void copias(Pieza[][] math, int[][] mat, Pieza[][] matri, int[][] ma) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matri[i][j] = math[i][j];
                ma[i][j] = mat[i][j];
            }
        }
    }

    public static boolean jake(int px, int py, Pieza[][] math, int[][] mat) {
        boolean l = true;
        if (math[ux][uy] instanceof rey) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (math[i][j] instanceof caballo && math[ux][uy].isC() != math[i][j].isC()) {
                        if (math[i][j].movimiento_condicion(i, j, mat, px, py)) {
                            System.out.println("");
                            l = false;
                        }
                    }
                    if (math[i][j] != null && math[ux][uy].isC() != math[i][j].isC()) {
                        if (math[i][j].movimiento_condicion(i, j, mat, px, py) && piezas_intermedias(px, py, i, j, mat)) {
                            System.out.println("n");
                            l = false;
                        }
                    }
                }
            }
        }
        return l;
    }

    public static boolean Check(int px, int py) {
        boolean l = true;
        int x = 0, y = 0;
        int p = 0, q = 0;
        Pieza[][] matri = new Pieza[8][8];
        int[][] ma = new int[8][8];
        copias(math, mat, matri, ma);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 7) {
                    x = i;
                    y = j;
                }
                if (mat[i][j] == -7) {
                    p = i;
                    q = j;
                }
            }
        }
        matri[px][py] = math[ux][uy];
        ma[px][py] = mat[ux][uy];
        System.out.println("t");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (math[i][j] instanceof caballo && math[x][y].isC() != math[i][j].isC()) {
                    if (math[i][j].movimiento_condicion(i, j, mat, x, y)) {
                        if (cheker(px, py) == false) {
                            l = false;
                        }
                    }
                }
                if (math[i][j] != null && math[x][y].isC() != math[i][j].isC()) {
                    if (math[i][j].movimiento_condicion(i, j, mat, x, y) && piezas_intermedias(x, y, i, j, mat)) {
                        System.out.println("d");
                        if (cheker(px, py) == false) {
                            l = false;
                        }
                    }
                }
                if (math[i][j] instanceof caballo && math[p][q].isC() != math[i][j].isC()) {
                    if (math[i][j].movimiento_condicion(i, j, mat, p, q)) {
                        System.out.println("j");
                        if (cheker(px, py) == false) {
                            l = false;
                        }
                    }
                }
                if (math[i][j] != null && math[p][q].isC() != math[i][j].isC()) {
                    if (math[i][j].movimiento_condicion(i, j, mat, p, q) && piezas_intermedias(p, q, i, j, mat)) {
                        if (cheker(px, py) == false) {
                            l = false;
                        }
                    }
                }
            }
        }
        return l;
    }

    public static boolean cheker(int px, int py) {
        boolean l = true;
        int x = 0, y = 0;
        int p = 0, q = 0;
        Pieza[][] matri = new Pieza[8][8];
        int[][] ma = new int[8][8];
        copias(math, mat, matri, ma);
        matri[px][py] = math[ux][uy];
        matri[ux][uy] = null;
        ma[px][py] = mat[ux][uy];
        ma[ux][uy] = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (ma[i][j] == 7) {
                    x = i;
                    y = j;
                }
                if (ma[i][j] == -7) {
                    p = i;
                    q = j;
                }
            }
        }
        System.out.println("t");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (matri[i][j] instanceof caballo && matri[x][y].isC() != matri[i][j].isC()) {
                    if (matri[i][j].movimiento_condicion(i, j, ma, x, y)) {
                        l = false;
                    }
                }
                if (matri[i][j] != null && matri[x][y].isC() != matri[i][j].isC()) {
                    if (matri[i][j].movimiento_condicion(i, j, ma, x, y)) {
                        System.out.println("z");
                        if (piezas_intermedias(x, y, i, j, ma)) {
                            System.out.println("d");
                            l = false;
                        }
                    }
                }
                if (matri[i][j] instanceof caballo && matri[p][q].isC() != matri[i][j].isC()) {
                    if (matri[i][j].movimiento_condicion(i, j, ma, p, q)) {
                        System.out.println("j");
                        l = false;
                    }
                }
                if (matri[i][j] != null && matri[p][q].isC() != matri[i][j].isC()) {
                    if (matri[i][j].movimiento_condicion(i, j, ma, p, q)) {
                        if (piezas_intermedias(p, q, i, j, ma)) {
                            System.out.println("d");
                            l = false;
                        }
                    }
                }
            }
        }
        return l;
    }

    public static void coronacion(int px, int py) {
        if (math[ux][uy] instanceof peon) {
            if ((mat[ux][uy] == 2 && py == 0) || (mat[ux][uy] == -2 && py == 7)) {
                int pieza = Integer.parseInt(JOptionPane.showInputDialog("1.Caballo\n"
                        + "2.Alfil\n"
                        + "3.Torre\n"
                        + "4.Reina"));
                switch (pieza) {
                    case 1:
                        if (mat[ux][uy] == 2) {
                            mat[px][py] = 3;
                            mat[ux][uy] = 0;
                            math[px][py] = new caballo(true);
                            math[ux][uy] = null;
                        } else {
                            mat[px][py] = -3;
                            mat[ux][uy] = 0;
                            math[px][py] = new caballo(false);
                            math[ux][uy] = null;
                        }
                        break;
                    case 2:
                        if (mat[ux][uy] == 2) {
                            mat[px][py] = 4;
                            mat[ux][uy] = 0;
                            math[px][py] = new alfil(true);
                            math[ux][uy] = null;
                        } else {
                            mat[px][py] = -4;
                            mat[ux][uy] = 0;
                            math[px][py] = new alfil(false);
                            math[ux][uy] = null;
                        }
                        break;
                    case 3:
                        if (mat[ux][uy] == 2) {
                            mat[px][py] = 5;
                            mat[ux][uy] = 0;
                            math[px][py] = new torre(true);
                            math[ux][uy] = null;
                        } else {
                            mat[px][py] = -5;
                            mat[ux][uy] = 0;
                            math[px][py] = new torre(false);
                            math[ux][uy] = null;
                        }
                        break;
                    case 4:
                        if (mat[ux][uy] == 2) {
                            mat[px][py] = 9;
                            mat[ux][uy] = 0;
                            math[px][py] = new reina(true);
                            math[ux][uy] = null;
                        } else {
                            mat[px][py] = -9;
                            mat[ux][uy] = 0;
                            math[px][py] = new reina(false);
                            math[ux][uy] = null;
                        }
                }
                fondo(0, 0, mat);
                cambio(0, 0, mat);

            }
        }
    }

    public static boolean Check_Mate(int px, int py) {
        boolean k = true;
        if (ux == px && uy == py) {
            k = false;
        }
        if (turno - turno1 == 1) {
            System.out.println("blanca");
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (math[i][j] != null) {
                        if (math[i][j].isC() == true) {
                            if (math[i][j] instanceof caballo && math[i][j].movimiento_condicion(i, j, mat, px, py) && Check(px, py) && jake(px, py, math, mat)) {
                                k = false;
                            } else {
                                if (math[i][j].movimiento_condicion(i, j, mat, px, py) && Check(px, py) && jake(px, py, math, mat) && piezas_intermedias(px, py, i, j, mat)) {
                                    k = false;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (turno - turno1 == 0) {
                System.out.println("negra");
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        if (math[i][j] != null) {
                            if (math[i][j].isC() == false) {
                                if (math[i][j] instanceof caballo && math[i][j].movimiento_condicion(i, j, mat, px, py) && Check(px, py) && jake(px, py, math, mat)) {
                                    k = false;
                                } else {
                                    if (math[i][j].movimiento_condicion(i, j, mat, px, py) && Check(px, py) && jake(px, py, math, mat) && piezas_intermedias(px, py, i, j, mat)) {
                                        k = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return k;
    }

    public static boolean val_movimiento(int ux, int uy, int px, int py) {
        boolean h = false;
        if (math[ux][uy].movimiento_condicion(ux, uy, mat, px, py)) {
            h = true;
        }
        return h;
    }
}

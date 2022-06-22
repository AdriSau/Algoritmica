package M2_BCK;

import Utilidades.Booleano;
import Utilidades.Entero;
import Utilidades.Imprenta;

public class M2_4 {
    private boolean[][] xCaballos(int N, int X){
        Booleano exito = new Booleano();
        Entero colocados = new Entero(0);
        int[][] tablero = new int[N][N];
        aux(tablero,N,X,exito,colocados,0,0);
        System.out.println("caballos colocados = " + colocados.getValor());
        return copiar(tablero);
    }

    private void aux(int[][] tablero, int n, int x, Booleano exito, Entero colocados, int posX, int posY) {
        if (colocados.getValor() == x && comprobador(tablero)) {
            exito.setValor(true);
        } else if (posX < n && posY < n) {
            int c = 0;
            while (c < 2 && !exito.isValor()) {
                if (c == 0) {
                    acechador(1, posX, posY, tablero, n);
                    colocados.setValor(colocados.getValor()+1);
                }
                if (posX + 1 >= n) {
                    posX = 0;
                    posY++;
                } else {
                    posX++;
                }
                aux(tablero, n, x, exito, colocados, posX, posY);


                if (!exito.isValor()) {
                    if (posX - 1 < 0) {
                        posX = n-1;
                        posY--;
                    } else {
                        posX--;
                    }

                    if (c == 0) {
                        acechador(0, posX, posY, tablero, n);
                        colocados.setValor(colocados.getValor()-1);

                    }
                }
            }
        }
    }
    // modo 1 pone modo 0 quita
    public void acechador(int modo, int x, int y, int[][] tablero,int N){
        if (modo == 1){
            tablero[x][y]++;
        }else if(modo ==0){
            tablero[x][y]--;
        }
        for (int i = x-2; i < x+3 ; i++) {
            for (int j = y-2; j < x+3 ; j++) {
                if(i < N && i > 0 && j < N && j > 0 && i!=x && j!=y){
                    if(x-y != i-j && x+y!=i+j){
                        if(modo == 1 && tablero[i][j]!=-1){
                            tablero[i][j]++;
                        }else if(modo == 0 && tablero[i][j]!=-1){
                            tablero[i][j]--;
                        }
                    }

                }
            }

        }
    }
    public boolean[][] copiar(int[][]m){
        boolean[][] res = new boolean[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] <= 0){
                    res[i][j] = false;
                }else
                    res[i][j] = true;
            }
        }
        return res;
    }
    private boolean comprobador(int[][] tablero){
        boolean res = true;
        for (int i = 0; i < tablero.length && res; i++) {
            for (int j = 0; j < tablero.length && res; j++) {
                if(tablero[i][j] <= 0) {
                    res = false;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        M2_4 exe = new M2_4();
        Imprenta imp = new Imprenta();
        int N = 4;
        int X = 4;
        imp.matrizCuadradaBooleanos(exe.xCaballos(N,X));
    }
}

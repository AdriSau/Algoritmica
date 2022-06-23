package M2_BCK;

import Utilidades.Booleano;
import Utilidades.Imprenta;

public class X1 {
    public int[][] cuadradoMagico(int N, int suma){
        Booleano exito = new Booleano();
        int[][] tabla = new int[N][N];
        boolean[] usados = new boolean[suma+1];
        aux(tabla,N,suma,usados,exito,0,0);
        if(exito.isValor()){
            return tabla;
        }else return null;
    }
    public void aux(int[][] tabla,int N, int suma, boolean[] usados, Booleano exito, int x,int y){
        if (esSolucion(tabla,N,suma)){
            exito.setValor(true);
        }else if(!todosUsados(usados) && x+y<Math.sqrt(N-1)){
            int c = 1;
            while (c < usados.length  && !exito.isValor()){
                if(!usados[c]){
                    usados[c] = true;
                    tabla[x][y] = c;
                    if(x+1 == N){
                        x =0;
                        y++;
                    }else {x++;}

                    aux(tabla, N, suma, usados, exito, x, y);

                    if(!exito.isValor()){
                        if (x-1<0){
                            x = N;
                            y--;
                        }else x--;
                        usados[c] = false;
                        tabla[x][y] = 0;
                    }
                }


            }
        }
    }



    private boolean esSolucion(int[][] tabla, int N, int obj){
        //filas
        boolean res = true;
        int sumafilas, sumaColumnas,sumaDP=0,sumaDS=0;
        for (int i = 0; i <N && res; i++) {
            sumafilas=0;
            sumaColumnas =0;
            for (int j = 0; j <N && res; j++) {
               sumafilas+=tabla[i][j];
               sumaColumnas+=tabla[j][i];
            }
            if(sumaColumnas != obj || sumafilas!=obj){
                res = false;
            }
        }
        for (int i = 0; i < N && res; i++) {
            sumaDP+=tabla[i][i];
            sumaDS+=tabla[i][N-i];

        }
        if(sumaDP != obj || sumaDS!=obj){
            res = false;
        }
        return res;
    }
    private boolean todosUsados(boolean[]usados){
        boolean res = true;
        for (int i = 0; i < usados.length && res; i++) {
            if (usados[i] == false){
                res= false;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Imprenta imp = new Imprenta();
        X1 exe = new X1();
        imp.matrizCuadradaInt(exe.cuadradoMagico(4,33),4 );
    }
}

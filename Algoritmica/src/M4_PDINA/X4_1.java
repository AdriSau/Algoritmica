package M4_PDINA;

import Utilidades.Imprenta;

public class X4_1 {
    ////FATAAAAAAALLLL
    int[] mejorSeleccion(int[] pesos, int[] valores, int maxPeso){
        int[][] tablaSol = new int[maxPeso+1][valores.length+1];
        int [] res = new int[valores.length];
        int pesoActual ;
        int valorActual;
        int valorMAX = 0;
        int copiar = 0;
        int valorSelec =0;
        boolean algunaMon = false;

        for (int i = 1; i < (maxPeso+1); i++) {
            valorMAX = 0;
            copiar = 0;
            valorSelec =0;
            algunaMon = false;
            for (int j = 0; j < valores.length; j++) {
                pesoActual = i - pesos[j];
                if (pesoActual == 0){
                    valorSelec = j;
                    algunaMon = true;
                }else if (pesoActual > 0){
                    valorActual = valores[j] + tablaSol[pesoActual][0];

                    if (valorActual > valorMAX){
                        algunaMon = true;
                        copiar = pesoActual;
                        valorSelec = j;
                    }

                }
            }
            for (int k = 1; k < valores.length+1 ; k++) {
                tablaSol[i][k] = tablaSol[copiar][k];
                if(k == valorSelec){
                    tablaSol[i][k] = tablaSol[i][k]+1;
                }
            }
             if (algunaMon){
                 tablaSol[i][0] = tablaSol[copiar][0] + valores[valorSelec];
             }
        }

        for (int i = 0; i < valores.length; i++) {
            res[i] = tablaSol[maxPeso][i+1];
        }
        return res;


    }

    public static void main(String[] args) {
        X4_1 exe = new X4_1();
        Imprenta imp = new Imprenta();
        int [] pesos = {2 ,3 ,4 ,8 ,15};
        int [] valores = {1 ,2 ,3 ,4 ,11};
        imp.deEnteros(exe.mejorSeleccion(pesos,valores,26));
    }
}

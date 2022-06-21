package M3_Voraces;

import M3_Voraces.M3_Subutilidades.Conjunto;

import java.util.ArrayList;

public class M3_3 {
    public ArrayList<Conjunto> conjuntoMinimo(int[]	U, ArrayList<Conjunto> S){
        boolean[] seleccionados = new boolean[U.length];
        Conjunto aux;
        ArrayList<Conjunto> Solucion = new ArrayList<>();
        while(!todosSeleccionados(seleccionados)){
            aux = selecionarConjunto(U,S,seleccionados);
            Solucion.add(aux);
            rellenarseleccionados(seleccionados,U,aux);
        }
        return Solucion;
    }
    private boolean todosSeleccionados(boolean[]seleccionados){
        boolean res = true;
        for (int i = 0; i < seleccionados.length && res ; i++) {
            if (seleccionados[i] == false){
                res = false;
            }
        }
        return res;
    }
    private Conjunto selecionarConjunto(int[] U, ArrayList<Conjunto> S,boolean[] seleccionados){
        int maxDiferentes = 0,tamAct =0;
        Conjunto solucion = null;
        for (int i = 0; i < S.size(); i++) {
            tamAct =0;
            Conjunto aux = S.get(i);
            for (int j = 0; j < aux.longitud(); j++) {
                for (int k = 0; k < U.length; k++) {
                    if(U[k] == aux.get(j) && !seleccionados[k]){
                        tamAct++;
                    }
                }

            }
            if(tamAct > maxDiferentes){
                solucion = aux;
                maxDiferentes = tamAct;
            }
        }
        if (solucion!=null){
            return solucion;
        }else return null;
    }
    private boolean[] rellenarseleccionados(boolean[]seleccionados, int[] U, Conjunto C){
        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < C.longitud(); j++) {
                if(C.get(j) == U[i]){
                    seleccionados[i] = true;
                }
            }
        }
        return seleccionados;
    }
    public static void main(String[] args) {
        M3_3 exe = new M3_3();

    }
}

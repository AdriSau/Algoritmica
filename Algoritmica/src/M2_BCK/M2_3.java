package M2_BCK;

import Utilidades.Booleano;
import Utilidades.Entero;
import Utilidades.Imprenta;

import java.util.ArrayList;

public class M2_3 {
    public boolean[] maxUsoRecurso(int[] comienzo, int[] fin){
        boolean[]  bigSol = new boolean[10];
        boolean[]  maxSol = new boolean[10];
        Entero max = new Entero(0);
        aux(comienzo,fin,max,bigSol,0,0,maxSol);
        System.out.println("Rellenadas de: " + max.getValor()+" horas de un total de: " + 10);
        return maxSol;
    }
    private void aux (int[] comienzo, int[] fin, Entero max, boolean[] bigSol , int act, int pos, boolean[]  maxSol){
        if (act > max.getValor()){
            max.setValor(act);
            for (int i = 0; i < bigSol.length; i++) {
                maxSol[i] = bigSol[i];
            }
        }
        if(pos < comienzo.length){
            int hasta,desde,c = 0;
            boolean valido;
            while(c < 2){
                desde = comienzo[pos];
                hasta = fin[pos];
                valido = comprobador(bigSol,desde,hasta);
                if (c==0 && valido){
                    act+=(hasta - desde);
                    rellenador(bigSol,desde,hasta);
                    pos++;
                    aux(comienzo, fin, max, bigSol, act, pos,maxSol);
                }else if (c==1){
                    pos++;
                    aux(comienzo, fin, max, bigSol, act, pos,maxSol);

                }
                if(valido || c==1){
                    if (c==0){
                        pos--;
                        act-=(hasta - desde);
                        desrellenador(bigSol,desde,hasta);
                    }else{
                        pos--;
                    }

                }
                c++;
            }
        }


    }
    private boolean[] fotocopiadora(ArrayList<Booleano> bigSol){
        boolean[] sol = new boolean[bigSol.size()];
        for (int i = 0; i < bigSol.size(); i++) {
            System.out.println("valor fotocopiado: " + i +" es: "+ bigSol.get(i).isValor());
            sol[i] = bigSol.get(i).isValor();
        }
        return sol;
    }
    private void rellenador(boolean[] bigSol, int desde, int hasta){
        for (int i = desde; i < hasta; i++) {
            bigSol[i]= true;
        }
    }
    private void desrellenador(boolean[] bigSol, int desde, int hasta){
        for (int i = desde; i < hasta; i++) {
            bigSol[i]= false;
        }
    }

    private boolean comprobador(boolean[] bigSol, int desde, int hasta){
        boolean res = true;
        for (int i = desde; i < hasta && res; i++) {
           if(bigSol[i]){
               res = false;
           }
        }
        return res;
    }
    public static void main(String[] args) {
        M2_3 exe = new M2_3();
        Imprenta imp = new Imprenta();
        int[] comienzo = {5 ,2 ,4 ,2 ,6 ,0 ,6 ,2};
        int[] fin = {9, 4 ,5 ,5 ,7 ,3 ,8 ,5};
        imp.deBooleanos(exe.maxUsoRecurso(comienzo,fin));
    }
}

package M2_BCK;

import Utilidades.Booleano;

public class M2_1 {
    //bien hecho
   public boolean hayRepartoEquitativo(int[] bienes){
       Booleano exito = new Booleano();
       int suma = 0;
       for (int i = 0; i < bienes.length; i++) {
           suma+=bienes[i];
       }
       System.out.println("suma: "+suma+" | cada uno: "+suma/3);
       int[] objetivo = {suma/3, suma/3, suma/3};
       aux(bienes,objetivo,exito,0);
       return exito.isValor();
   }
   private void aux(int[]bienes, int[] objetivo, Booleano exito, int act ){
       if (act == bienes.length && (objetivo[0] == objetivo[1] && objetivo[2] == objetivo[1])){
           exito.setValor(true);
       }else if(act < bienes.length && !exito.isValor()){
           int c = 0;
           while(c < 3){
               objetivo[c]-=bienes[act];
               act++;
               aux(bienes, objetivo, exito, act);
               if (!exito.isValor()){
                   act--;
                   objetivo[c]+=bienes[act];
               }
               c++;
           }
       }

   }


    public static void main(String[] args) {
        M2_1 exe = new M2_1();
        int [] v1 = {2,2,3,5,8,10,10,5,5,10};
        int [] v2 = {2,3,5,8,10,10,5,10};
        System.out.println(exe.hayRepartoEquitativo(v1));
        System.out.println(exe.hayRepartoEquitativo(v2));


    }
}

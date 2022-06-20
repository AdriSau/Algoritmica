package M2_BCK;

import Utilidades.Booleano;

public class M2_2 {
     public boolean dosSubconjuntos(int[] v, int vObjetivo){
         int sum1 =0, sum2=0;
         Booleano exito = new Booleano();
         aux(v,vObjetivo,sum1,sum2,0,exito);

         return exito.isValor();
     }
     public void aux (int[]v, int obj, int sum1, int sum2,int act, Booleano exito){
         if(sum1 == obj && sum2 == obj){
             exito.setValor(true);
         }else if(act < v.length){
             int c = 0;
             while(c < 3 && !exito.isValor()){
                 if (c == 0 && sum1 < obj ){
                     sum1+=v[act];
                     act++;
                     aux(v, obj, sum1, sum2, act, exito);
                 }else if(c == 1 && sum2 < obj ){
                     sum2+=v[act];
                     act++;
                     aux(v, obj, sum1, sum2, act, exito);
                 }else{
                     act++;
                     aux(v, obj, sum1, sum2, act, exito);
                 }
                 if(!exito.isValor()){
                     act--;
                     if(c==0){
                         sum1-=v[act];
                     }else if(c==1){
                         sum2-=v[act];
                     }
                 }
                 c++;
             }

         }
     }

    public static void main(String[] args) {
        M2_2 exe = new M2_2();
        int[] v = {4,2 ,5 ,5 ,1 ,8};
        int a = 10;
        int b = 11;
        System.out.println(exe.dosSubconjuntos(v,a));
        System.out.println(exe.dosSubconjuntos(v,b));


    }
}

public class X_2_2019 {
    public int elementoEspecial(int v[]){
        return aux(v,0,v.length-1);
    }
    private int aux(int[]v,int ini, int fin){
        int res =0;
        int k = (ini+fin)/2;
        int diferencia = (fin-ini)/2;
        if (v[ini] == v[fin]){
            res = aux(v, ini+1, fin-1);
        }else if(diferencia == 2 ){
           if(v[ini] == v[ini+1]){
               res = v[fin];
           }else
               res = v[ini];
        }else if((k % 2 == 0 && v[k] == v[k-1])||(k % 2 != 0 && v[k] == v[k+1])){
            res = aux(v,k+1,fin);
        }else
            res = aux(v,ini,k-1);
        return res;
    }
    public static void main(String[] args) {
        X_2_2019 exe = new X_2_2019();
        int[] v = {1,2,2,3,3,4,0,0,1};
        int[] v2 = {0,12,13,14,15,16,17,18,20};
        int[] v3 ={-1,0,2};
        System.out.println(exe.elementoEspecial(v));
    }
}

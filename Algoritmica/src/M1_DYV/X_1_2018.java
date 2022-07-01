package M1_DYV;

public class X_1_2018 {
    public int minElementoRotado(int[]v){
        return aux(v,0,v.length-1);
    }
    private int aux(int[]v, int io, int n){
        if (io == n){
            return io;
        }else if(io+1==n){
            if (v[io] > v[n] ){
                return n;
            }else  return io;
        }else{
            int k = (io + n) /2;
            if (v[io] > v[n]){
                return aux(v,k,n);
            }else return aux(v,io,k);
        }
    }


    public static void main(String[] args) {
        X_1_2018 exe = new X_1_2018();
        int[] v = {10,15,23,32,1,2,3,4,7};
        int[] v3 = {1,2,3,4,7,8,9,10,11,12,13};
        int[] v4 = {1,2,3,4,7,8,9,10,11,12};
        int[] v5 = {2,3,4,7,8,9,10,11,12,13,1};
        int[] v6 = {3,4,7,8,9,10,11,12,13,1,2};
        int[] v7 = {12,1,2,3,4,7,8,9,10,11};

        System.out.println(exe.minElementoRotado(v));
        System.out.println(exe.minElementoRotado(v3));
        System.out.println(exe.minElementoRotado(v4));
        System.out.println(exe.minElementoRotado(v5));
        System.out.println(exe.minElementoRotado(v6));
        System.out.println(exe.minElementoRotado(v7));










    }
}

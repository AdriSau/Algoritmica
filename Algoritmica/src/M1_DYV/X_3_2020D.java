package M1_DYV;

public class X_3_2020D {
    public int maxArrayColina(int[] vector){
        return aux(vector,0,vector.length-1);
    }
    private int aux(int[]v, int io, int n){

        if(io == n){
            return v[n];
        }else if(n == io+1){
            return Math.max(v[io],v[n]);
        }else{
            int k = (io+n)/2;
            if (v[k] >v[k+1]){
                return aux(v,io,k);
            }else
                return aux(v,k+1,n);
        }
    }

    public static void main(String[] args) {
        X_3_2020D exe = new X_3_2020D();
        int[] v = {5, 7 ,8 ,9 ,3 ,2 ,1 ,0 ,-7};
        int[] v1 = {8,9,3,2,1,0,-7};
        int[] v2 = {5,7,9,3,2,1,0,-7};
        int[] v3 = {2,1,0,-7,5,7,8,9,3};
        int[] v4 = {2,1,0,-7,5,7,8,9,3};



        System.out.println(exe.maxArrayColina(v));
        System.out.println(exe.maxArrayColina(v1));
        System.out.println(exe.maxArrayColina(v2));
        System.out.println(exe.maxArrayColina(v3));
        System.out.println(exe.maxArrayColina(v4));
        System.out.println(exe.maxArrayColina(v));


    }
}

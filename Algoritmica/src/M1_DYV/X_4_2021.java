package M1_DYV;

public class X_4_2021 {

    public int ejDyVsep(int[] vector1, int[] vector2){
        return aux(vector1,vector2,0,vector1.length-1);
    }
    private int aux(int[]v1, int[]v2, int io, int n){
        if (io == n){
            return io;
        }else if(io +1 == n){
            if(v1[io] == v2[io]){
                return n;
            }else return io;
        }
        else{
            int k = (io +n) / 2;
            if (v1[k] == v2[k]){
                return aux(v1,v2,k+1,n);
            }else{
                return aux(v1,v2,io,k);
            }
        }
    }
    public static void main(String[] args) {
        X_4_2021 exe = new X_4_2021();
        int[] v1 = {-2,0,1,1,2,2,2,3};
        int[] v2 = {-2,0,1,1,5,5,5,5};
        int[] v3 = {-4,-2,0,1,1,2,3,4,-9};
        int[] v4 = {-4,-2,0,1,1,5,7,10,-6};

        System.out.println(exe.ejDyVsep(v1,v2));
        System.out.println(exe.ejDyVsep(v3,v4));
    }
}

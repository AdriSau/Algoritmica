package M1_DYV;

public class X_3_2020D {
    public int maxArrayColina(int[] vector){
      return aux(vector,0,vector.length-1);
    }
    private int aux(int[]v, int ini, int fin){
        int res = 0;
        int k = (ini+fin)/2;
        if(ini == fin){
            return v[ini];
        }else if(v[k] < v[ini]){
            res = aux(v,ini,k-1);
        }else
            res = aux(v,k,fin);
        return res;
    }
    public static void main(String[] args) {
        X_3_2020D exe = new X_3_2020D();
        int[] v = {5,7,8,9,3,2,1,0,-7};
        int[] v1 = {8,9,3,2,1,0,-7};
        int[] v2 = {5,7,9,3,2,1,0,-7};
        int[] v3 = {2,1,0,-7,5,7,8,9,3};
        int[] v4 = {2,1,0,-7,5,7,8,9,3};



        System.out.println(exe.maxArrayColina(v));
        System.out.println(exe.maxArrayColina(v1));
        System.out.println(exe.maxArrayColina(v2));
        System.out.println(exe.maxArrayColina(v3));
        System.out.println(exe.maxArrayColina(v4));


    }
}

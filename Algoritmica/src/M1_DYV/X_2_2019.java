package M1_DYV;

public class X_2_2019 {
    public int elementoEspecial(int[] vector){


        return aux(vector,0, vector.length-1);

    }
    private int aux(int[] v, int o, int n){
        int res;
        if (o==n){
           res = v[o];
        }
        else if (v[o] == v[n]){
            res = aux(v,o+1,n-1);
        }else{
            int k = (n+o)/2;
            if (v[k]%2==0){
                if(v[k+1] == v[k]){
                    res = aux(v,k+2,n);
                }else if(v[k-1] == v[k]){
                    res = aux(v,o,k-2);

                }else res = v[k];
            }else{
                if(v[k-1] == v[k]){
                    res = aux(v,k+1,n);
                }else if(v[k+1] == v[k]){
                    res = aux(v,o,k-1);
                }else res =v[k];
            }

        }
        return res;
    }

    public static void main(String[] args) {
        X_2_2019 exe = new X_2_2019();
        int[] v = {1,2,2,3,3,4,0,0,1};
        int[] v2 = {1,2,2,3,3,4,4,5,1};
        int[] v3 ={1,1,2,2,3};
        System.out.println(exe.elementoEspecial(v));
        System.out.println(exe.elementoEspecial(v2));
        System.out.println(exe.elementoEspecial(v3));

    }
}

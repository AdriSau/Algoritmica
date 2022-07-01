package M1_DYV;

public class M1_1 {
    // mal

    public int sumaPositivos(int[] vector){
    return auxDYV(vector,0, vector.length-1);

    }
    public int auxDYV(int v[], int io, int n){
        if(io==n){
            if (v[io] > 0){
                return v[io];
            }else return 0;
        } else{
            int k = (io+n)/2;
            return auxDYV(v,io,k) + auxDYV(v,k+1,n);
        }
    }

    public static void main(String[] args) {
        int [] vector = {-1,0,2,3,10,12,-23,-14,-7};
        int [] v2 = {0,0,0,0,0,0,0,0,0};
        M1_1 exe = new M1_1();
        System.out.println(exe.sumaPositivos(vector));

    }
}

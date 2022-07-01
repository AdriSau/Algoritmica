package M1_DYV;

public class examen {
    public int formula(int [] v){
        return aux(v,0,v.length-1);
    }
    private int aux(int[]v,int io, int n){
        if (io == n){
            return io;
        }else if (io+1 == n){
            if ((n%2==0 && v[n]%2 ==0) || (n%2!=0 && v[n]%2!=0)){
                return io;
            }else return n;
        }else{
            int k = (io + n)/2;
            if ((k%2==0 && v[k]%2 ==0) || (k%2!=0 && v[k]%2!=0)){
                return aux(v,k+1,n);
            }else return aux(v,io,k);
        }
    }
    public static void main(String[] args) {

        examen exe = new examen();
        int v [] =  {2,5,8,9,22,34,45,98,101};
        int v2 [] = {4,7,23,34,45,56,67,78,89};
        System.out.println(exe.formula(v));
        System.out.println(exe.formula(v2));
    }
}

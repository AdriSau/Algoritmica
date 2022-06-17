public class M1_1 {


    public int sumaPositivos(int[] vector){
    return auxDYV(vector,0, vector.length-1, vector.length/2);

    }
    private int auxDYV(int[] vector,int desde,int hasta, int mitad){
        int res = 0;
        int a = vector[desde];
        int b = vector[hasta];
        int c = vector[mitad];
        if(a>0 && b>0 && c>0 && a<b && b<c){
            res = sumar(vector);
            //todos negativos
        }else if( a<0 && b<0 && c<0 && a<b && b<c){
          res = 0;
        }else{
             res = auxDYV(vector,desde,mitad,(desde+mitad)/2) + auxDYV(vector,mitad+1,hasta,((mitad+1)+hasta)/2);
        }
        return res;
    }
    private int sumar(int[] vector){
        int suma =0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        return suma;
    }


    public static void main(String[] args) {
        int [] vector = {-1,0,2,3,16,12,-23,-14,-7};
        int [] v2 = {0,0,0,0,0,0,0,0,0};
        M1_1 exe = new M1_1();
        System.out.println(exe.sumaPositivos(vector));
        System.out.println(exe.sumar(v2));
    }
}

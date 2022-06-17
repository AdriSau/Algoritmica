public class M1_2 {
    /*
    Trabajaremos con una longitud minima de 3, asi los casos base deben resolver cualquier vector de esa longitud
     */
    public int valorUnico(int[] v){
        return aux(v,0,v.length-1,v.length/2);
    }
    private int aux (int[]v,int o,int n,int k){
        int res=-1;
        if(v[k]!= v[k+1]  && v[k]!= v[k-1]){
            res = v[k];
        }
        else if((n-o)==2 && v[o]!=v[o+1] && v[o+1]==v[o+2]){
            res = v[o];
        }else if((n-o)==2 && v[n]!=v[n-1] && v[n-1]==v[n-2]){
            res = v[n];
        } else if ((n-o)==2) {
            System.out.println("error en el algoritmo");
        }else{
            if(k % 2==0){
                if (v[k]==v[k+1]){
                    res = aux(v,k,n,(k+n)/2);
                }else{
                    res = aux(v,o,k,(o+k)/2);
                }
            }else{
                if(v[k]==v[k-1]){
                    res = aux(v,k+1,n,(k+1+n)/2);
                }else
                    res = aux(v,o,k-1,(k-1+o)/2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        M1_2 exe2 = new M1_2();
        //objetivo en mitad izq =
        int[] v = {1 ,1 ,4 ,5 ,5 ,7 ,7 ,8 ,8 ,9 ,9};
        //objetivo en mitad der
        int[] v2 = {1 ,1 ,2 ,2 ,3 ,3 ,4 ,4 ,5 ,9 ,9};
        //objetivo en mitad
        int[] v3 = {1 ,1 ,4,5 ,5};
        //objtivo el primero
        int[] v4 = {1 ,2 ,2 ,3 ,3 ,4 ,4 ,5 ,5 ,9 ,9};
        //objtivo el ultimo
        int[] v5 = {1 ,1 ,2 ,2 ,3 ,3 ,4 ,4 ,5 ,5 ,9};
        System.out.printf(exe2.valorUnico (v) + " ");
        System.out.printf(exe2.valorUnico(v2) + " ");
        System.out.printf(exe2.valorUnico(v3) + " ");
        System.out.printf(exe2.valorUnico(v4) + " ");
        System.out.println(exe2.valorUnico(v5) + " ");
        System.out.printf("4 5 4 1 9");


    }

}

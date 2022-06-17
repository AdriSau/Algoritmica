public class M1_3 {
    public int igualIndice(int[] v){
        return aux(v,0,v.length/2,v.length-1);
    }
    private int aux(int[] v, int ini, int med, int fin){
        int res;
        if (v[med] == med){
            res =  med;
        }else{
            if(v[med] > med){
               res = aux(v,ini,(ini+med)/2,med);
            }else{
                res = aux(v,med+1,(fin+med+1)/2,fin);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        M1_3 exe = new M1_3();
        int[] v = {-10 ,-2 ,0 ,3 ,7 ,9 ,19 ,28 ,30 ,42 ,55};
        int[] v2 = {0,12,13,14,15,16,17,18,20};
        int[] v3 ={-1,0,2};

        System.out.printf(exe.igualIndice(v) + " ");
        System.out.printf(exe.igualIndice(v2) + " ");
        System.out.println(exe.igualIndice(v3) + " ");
        System.out.printf("3 0 2");



    }
}

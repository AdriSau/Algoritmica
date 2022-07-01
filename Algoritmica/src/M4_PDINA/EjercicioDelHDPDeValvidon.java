package M4_PDINA;

public class EjercicioDelHDPDeValvidon {
    public int maxSuma(int v[]){
        int[] res = new int[v.length];
        int max = Integer.MIN_VALUE;
        res[0] = v[0];
        max = res[0];
        int act = max;
        for (int i = 0; i < v.length; i++) {
            if (act + v[i] > v[i]){
                act = act + v[i];
            }else{
                act = v[i];
            }
            if (act > max){
                max = act;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        EjercicioDelHDPDeValvidon exe = new EjercicioDelHDPDeValvidon();
        int[]v = {-2,12,3,4,-21,8,12,5,-6,1};
        System.out.println(exe.maxSuma(v));
        int [] cardPoints = new int[5];
        int a = cardPoints.length;
    }
}

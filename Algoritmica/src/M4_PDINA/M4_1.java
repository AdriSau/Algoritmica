package M4_PDINA;

public class M4_1 {
    public boolean haySuma(int[] valores, int v){
        boolean[][] soluciones = new boolean[v+1][valores.length+2];
        soluciones[0][0] = true;
        for (int i = 1; i < soluciones.length; i++) {
            aux(valores,i,soluciones);
        }
        return soluciones[v][0];
    }

    private boolean aux(int[] valores, int v, boolean[][] soluciones){
        int resto;
        boolean res = false;
        if(v<0){
            res = false;
        }else if(v==0){
            res = true;
        }else{
            for (int i = 0; i < valores.length && !res; i++) {
                resto =  v - valores[i];
                if(resto == 0){
                    res = true;
                    soluciones[v][0] = true;
                    soluciones[v][i] = true;
                }else if( resto < soluciones.length && resto > 0 && soluciones[resto][0] && !soluciones[resto][i] ){
                    res = true;
                    rellenar(soluciones,resto,i, valores.length+2,v);
                }
            }
        }
        return res;
    }
    private void rellenar( boolean[][] soluciones,int resto, int usada, int tam, int act){
        for (int i = 0; i < tam ; i++) {
            if(i == usada || i == 0){
                soluciones[act][i] = true;
            }else{
                soluciones[act][i] = soluciones[resto][i];
            }
        }
    }


    public static void main(String[] args) {
        M4_1 exe = new M4_1();
        int[] v1 = {5, 8, 7, 1, 3, 1 };
        int[] v2 =  {5, 8, 7, 2, 3};
        int valor1 = 10;
        int valor2 = 21;
        System.out.println(exe.haySuma(v1,valor1));
        System.out.println(exe.haySuma(v2,valor2));
    }
}

package M3_Voraces;

public class M3_4 {
    public boolean hayDivision(int[] valores){
        int c = 0;

        if(valores.length % 2 != 0){
            return false;
        }else{
            int[] sol1 = new int[valores.length/2];
            int[] sol2 = new int[valores.length/2];
            boolean[] selecionados = new boolean[valores.length];
            int sum1=0,sum2=0,can1=0,can2=0, candidato;
            while (c < valores.length){
                candidato = selectorCandidato(valores,selecionados);
                if(sum1 <= sum2){
                    sum1+=candidato;
                    can1++;
                    System.out.println("cantidad de 1 = " + sum1 + "  añadido: "+candidato);
                }else{
                    sum2+=candidato;
                    can2++;
                    System.out.println("cantidad de 2 = " + sum2 + "  añadido: "+candidato);

                }
                c++;
            }
            if(can1==can2 && sum1==sum2){
                System.out.println(sum1);
                return true;
            }else return false;

        }

    }

    private int selectorCandidato(int[]v,boolean[] selecionados){
        int max = -1;
        int selec = -1;
        for (int i = 0; i < v.length; i++) {
            if(v[i] > max && !selecionados[i]){
                max = v[i];
                selec = i;
            }
        }
        selecionados[selec] = true;
        return max;
    }

    public static void main(String[] args) {
        M3_4 exe = new M3_4();
        int[] v = {5,8,7,1,3,2};
        System.out.println(exe.hayDivision(v));
    }
}

package M4_PDINA;

public class M4_3 {
    // suponemos que el tablero viene dado en forma de array


    public int numeroDardos(int[] diana, int valor) {
        int[] numDardos = new int[valor + 1];
        int resto;
        int minimo;
        numDardos[0] = 0;

        for (int i = 1; i < valor + 1; i++) {
            minimo = Integer.MAX_VALUE;
            for (int j = 0; j < diana.length; j++) {
                resto = valor - diana[j];
                if (resto == 0) {
                    minimo = 1;
                } else if (resto > 0 && numDardos[resto] + 1 < minimo) {
                    minimo = numDardos[resto] + 1;
                }
            }
            numDardos[i] = minimo;


        }
        return numDardos[valor];
    }

    public static void main(String[] args) {
        M4_3 exe = new M4_3();
        int[] tablero = {1, 2, 3, 4, 8, 9, 13, 18, 20};
        int a =33 ;
        System.out.println(exe.numeroDardos(tablero,a));
    }
}

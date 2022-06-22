package Utilidades;

public class Imprenta {
    public void deEnteros(int[] selec){
        for (int i = 0; i < selec.length; i++) {
            System.out.print(selec[i]+" ");
        }
    }
    public void deBooleanos(boolean[] selec){
        char a;
        for (int i = 0; i < selec.length; i++) {
            if(selec[i] == true){
                a = 'T';
            }else{
                a = 'F';
            }
            System.out.print(a+" ");
        }
    }
    public void matrizCuadradaBooleanos(boolean[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j]){
                    System.out.printf(" V");
                }else
                    System.out.printf(" F");
            }
            System.out.println();
        }
    }
}

package M3_Voraces;

import M3_Voraces.M3_Subutilidades.Producto;

import java.util.ArrayList;

public class M3_1 {
    public void distribuyeCarga(ArrayList<Producto> productos, ArrayList<Producto> n1, ArrayList<Producto> n2, ArrayList<Producto> n3){
        int cont1 =0,cont2=0,cont3=0;
        while(!productos.isEmpty()){
            Producto aux = seleccionarCandidato(productos);
            if (cont1 <= cont2 && cont1<= cont3){
                n1.add(aux);
                cont1+=aux.getPeso();
            }else if(cont1 > cont2 && cont2 <= cont3){
                n2.add(aux);
                cont2+=aux.getPeso();
            }else{
                n3.add(aux);
                cont3+=aux.getPeso();
            }
            productos.remove(0);
        }
        System.out.println("Las naves contienen:    ");
        System.out.println("n1: "+cont1);
        System.out.println("n2: "+cont2);
        System.out.println("n3: "+cont3);

    }
    private Producto seleccionarCandidato(ArrayList<Producto> productos){
        if(!productos.isEmpty()){
            Producto selecionado = productos.get(0);
            for (int i = 0; i < productos.size(); i++) {
               if(productos.get(i).getPeso() > selecionado.getPeso()) {
                   selecionado = productos.get(i);

               }
            }
            return selecionado;
        }else return null;

    }


    public static void main(String[] args) {
        M3_1 exe = new M3_1();
    }
}

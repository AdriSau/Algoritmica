package M4_PDINA;

public class M4_4 {
     public int coste(int[] adn1, int[] adn2, int a, int b, int[][] m){
         // a partir de la 1 hago la 2
         int coste =0;
         int i1 =0;
         int i2 =0;
         int borrados =0, añadidos =0;
         if (adn1.length > adn2.length){
             coste+=(adn1.length - adn2.length)*b;
             borrados = adn1.length - adn2.length;
         }else if (adn1.length < adn2.length){
             coste+=(adn2.length - adn1.length)*a;
             añadidos = adn2.length - adn1.length;
         }
         while (i1 < adn1.length && i2< adn2.length){
             if (i1>0 && i1 < adn1.length-1 && i2>0 && i2 < adn2.length-1 && adn1[i1] != adn2[i2] && adn1[i1-1]==adn2[i2-1] && adn1[i1+1]==adn2[i2+1]){
                 coste+=m[adn1[i1]][adn2[i2]];
                 i1++;
                 i2++;
             }else if(borrados > 0 && i1>0 && i1 < adn1.length-1 && adn1[i1-1] == adn2[i2-1] && adn1[i1+1]==adn2[i2]){
                 i1++;
                 borrados--;
             }else if(añadidos > 0&& i2>0 && i2 < adn2.length-1 && adn1[i1-1] == adn2[i2-1] && adn2[i2+1]==adn1[i1]){
                 i2++;
                 añadidos--;
             }else{
                 i1++;
                 i2++;
             }
         }


        return coste;
     }
    public static void main(String[] args) {
        M4_4 exe = new M4_4();
        int a =1;
        int b =2;
        int[][] m = {{0,1,2,2},{2,0,1,2},{2,1,0,3},{3,1,2,0}};
        int [] adn1 = {0, 1, 2, 1,3 ,1 ,2, 1, 0};
        int [] adn2 = {0, 1, 1, 1,3 ,1 ,2, 0};
        System.out.println(exe.coste(adn1,adn2,a,b,m));
    }
}

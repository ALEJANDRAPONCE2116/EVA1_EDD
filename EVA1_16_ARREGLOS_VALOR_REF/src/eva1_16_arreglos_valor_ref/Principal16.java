
package eva1_16_arreglos_valor_ref;

public class Principal16 {

    public static void main(String[] args) {
        int arreglo [] = new int [10];
        System.out.println(arreglo);
        llenarArreglo(arreglo);  
        imprimirArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
    }
    
     public static void llenarArreglo (int [] arre){
        for (int i = 0; i < arre.length; i++) {
            arre[i]= (int)(Math.random()*100);
            System.out.println("["+arre[i]+"]");
        }
         System.out.println("");
         System.out.println(arre);
    }
     
    public static void imprimirArreglo (int[] arre){
        for (int i = 0; i < arre.length; i++) {
            System.out.println("["+arre[i]+"]");
        }
        System.out.println("");
    }
     
     public static void madrearArreglo (int[]  arre){
    arre= new int [100];
         System.out.println(arre);
}
     
}

//cada corchete representa una dimensión
//Crear un arreglo de dos dimensiones  --> MATRIZ
public class Principal11 {

    public static void main(String[] args) {
        int aDatos [][] = new int [3][4];  //ocupa 36 bites
        System.out.println("Direccion del arreglo " + aDatos);
        System.out.println("Tamaño del arreglo " + aDatos.length );//length imprime 
        
        System.out.println("Direccion del arreglo aDatos [0] " + aDatos[0]);
        System.out.println("Tamaño del arreglo " + aDatos[0].length);
        
        System.out.println("VAlor de la posición aDatos [0] [0] " + aDatos[0][0]);
    }
    
}

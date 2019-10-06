//Isela Alejandra Ponce de León Carrasco  ||  18550720
/*Un arreglo --> 10 elementos --> imprimir esos 10 elementos aleatoriamente*/
public class Principal5 {

    public static void main(String[] args) {
        
        int aiDatos [] = new int [10]; //declaración de 10 arreglos
        System.out.println(aiDatos);
        
        //N --> número de elementos
        for (int i = 0; i < aiDatos.length; i++){ //.length regresa la cantidad de elementos que existen en el arreglo
            aiDatos[i]=(int)(Math.random()*100)+1;
        }
        
        System.out.println("FOR NORMAL");
        for (int i =0; i< aiDatos.length; i++){
            System.out.println(aiDatos [i]); 
        }
        
        System.out.println("FOR EACH");
        for (int x : aiDatos) { //va a leer cada elemento del arreglo y lo va a poner en esa variable 
            System.out.println(x);
            
        }
    }
    
}
//un arreglo en java es un objeto
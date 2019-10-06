//Isela Alejandra Ponce de León Carrasco  ||  18550720
/*Crear un duplicado del arreglo
  Generar una copia de los datos en el arreglo 10 veces*/
package eva1_8_copia_arreglos_2;

public class Principal8 {

    public static void main(String[] args) {
        int aiDatos[]= new int [10];
        int aiCopia[]= new int [10];
        
        for (int i=0; i < aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random()*100)+1;
        }
        
        //aiCopia = aiDatos; ---> Aquí transferimos la dirección de datos al arreglo copia
       for (int i=0; i < aiCopia.length; i++){
            aiCopia[i] = aiDatos[i];
        }
       
       //Dos objetos independientes
       ImprimirArreglo (aiDatos);  //llamamos al método
       ImprimirArreglo (aiCopia);
       
       //Verificamos dirección de memoria y si son independientes
        System.out.println(aiDatos);
        System.out.println(aiCopia);
    }
    
    //el métodoImprimirArreglo ayuda a no volver a escribir el código muchas veces
    public static void ImprimirArreglo(int [] args){
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.print("["+args[i]+"]");
        }
        System.out.println("");
    }
}

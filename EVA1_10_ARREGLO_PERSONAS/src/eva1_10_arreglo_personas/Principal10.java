//Isela Alejandra Ponce de León Carrasco  ||  18550720

//CREAR CLASE PERSONA, Y CREAR UN ARREGLOS
//QUE ALMACENE LAS 10 PERSONAS
/*Crear un arreglo de objetos de tipo persona que capture 2 datos (Nombre y Apellido) de 10 personas
  las personas deben ser objetos y los debo guardar en un arreglo*/

package eva1_10_arreglo_personas;

import java.util.Scanner;

public class Principal10{
    public static void main(String[] args) {
        Persona [] aPersonas = new Persona [5];
        Scanner sCaptu = new Scanner (System.in);
        
        for (int i = 0; i< aPersonas.length; i++){
            aPersonas [i] = new Persona();
            System.out.println("Introduce tu nombre");
            aPersonas [i].nombre = sCaptu.nextLine(); //el punto toma la dirección y accede a la propiedad nombre
        }
        
        //COPIA
        Persona [] aCopias = new Persona [aPersonas.length];
        
        for (int i = 0; i<aCopias.length; i++){
            aCopias [i] = new Persona();
            aCopias [i].nombre = aPersonas [i].nombre;
            
        }
        
        
        ImprimirArreglo(aPersonas);
        ImprimirArreglo(aCopias);
    }
    public static void ImprimirArreglo(Persona [] args){ 
        for (int i = 0; i < args.length; i++) {
            System.out.println("Original" + args[i].nombre);
            System.out.println("Copia" + args [i].nombre);
            
        }
}
}

class Persona{
String nombre, apellido;
}


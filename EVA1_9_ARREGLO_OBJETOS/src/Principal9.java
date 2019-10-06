//Isela Alejandra Ponce de León Carrasco  ||  18550720

//Crear un duplicado de los valores de los objetos almacenados en el arreglo
public class Principal9 {

    public static void main(String[] args) {
        Prueba [] apArreglo = new Prueba [5]; //Le estoy dando el arreglo para 5 espacios. NO LO ESTOY CREANDO
        Prueba [] apArregloCopia = new Prueba [5];
        System.out.println(apArreglo);
        System.out.println(apArregloCopia);
        
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo [i] = new Prueba (); // Estoy creando objetos de tipo prueba
            apArreglo[i].x = (int)(Math.random()*100);
            System.out.println(apArreglo [i] );
        }
        
        for (int i = 0; i < apArregloCopia.length; i++) {
            apArregloCopia [i] = new Prueba (); 
            apArregloCopia [i].x = apArreglo [i].x; //leyendo la dirección de la memoria en un mismo objeto  //NO FUNCIONA
            
            System.out.println("Arreglo" + i + "=" + apArreglo [i]);
            System.out.println("Copia" + i + "=" + apArregloCopia [i]);
        }
    }
    
}

class Prueba{
int x;
}
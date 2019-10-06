/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dos tipos de declaraciones en arreglos
        int aDatos[],a,b;//1 arreglo 
        int[] aDatos2,x,y;//3 arreglos al poner INT[] CADA NOMBRE QUE PONEMOS ES UN NOMBRE DE ARREGLO
        //
        aDatos= new int[100];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i]=(int)(Math.random()*100)+1;
            /*los arreglos : son objetos
            la memoria es consecutiva
            son de acceso aleatorio, podemos acceder a cualquier posicion en el arreglo
            ventajas son rapidos de trabajar, no son flexibles
            son muy rapidos, son inmutables=una vez que asignamos el tamaño al arreglo no se cambia*/
            System.out.println(aDatos);
            
        }
        int tama=200;
        aDatos= new int[tama];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i]=(int)(Math.random()*100)+1;
            System.out.println(aDatos);
        }
    }
    
}

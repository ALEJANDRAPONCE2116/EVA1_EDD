//Isela Alejandra Ponce de León Carrasco  ||  18550720

public class Principal4 {

    public static void main(String[] args) {
        Principal4 pObj = new Principal4();
        System.out.println(pObj); //imprime la direccion donde esta el objeto de tipo principal
        foo(pObj);
        
    }
    public static void foo(Principal4 param){//va a recibir objetos de tipo principal
        System.out.println(param); //imprimo a pObj y a param porque es el mismo objeto
    }
}
//las variables almacenan direcciones al crear un objeto
//es el mismo objeto almacenado en dos variables distintas
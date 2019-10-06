//Isela Alejandra Ponce de León Carrasco  ||  18550720

public class Principal3 {

    public static void main(String[] args) {
        int i = 10;  // Variable i se va al STACK
        Principal3 pObj = new Principal3 ();  // La instancia se va al HEAP
        System.out.println(i);  // Llamada a función se va al STACK
        System.out.println(pObj);
        pObj = null; //Nos deshacemos de la memoria usada
    }
    
}
//todo lo que el programa utilice lo va a jalar del stack
//variables locales e van al stack
//Heap ---> 
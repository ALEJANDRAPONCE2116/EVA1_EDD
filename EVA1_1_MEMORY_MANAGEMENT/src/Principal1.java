//Isela Alejandra Ponce de León Carrasco  ||  18550720
//Pila 
public class Principal1 {
    public static void main(String[] args) {
        System.out.println("inicia Main");
        A();
        System.out.println("Termina Main");
        
      }
    public static void A(){
        System.out.println("inicia A");
            B();
            System.out.println("Termina A");

    }
    public static void B(){
        System.out.println("inicia B");
         C();
         System.out.println("Termina B");
}
    public static void C(){
        System.out.println("inicia C");
        System.out.println("Termina C");
        
    }
}

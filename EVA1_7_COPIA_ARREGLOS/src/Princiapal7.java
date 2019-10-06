public class Princiapal7 {
    public static void main(String[] args) {

        int aDatos[]=new int[10];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Originales");
        for (int i = 0; i < aDatos.length; i++) {
            
            System.out.println("["+aDatos[i]+"]");
        }
        int aCopia[]=new int[10];
        
        aCopia=aDatos;
        System.out.println("copiados");
        for (int i = 0; i < aDatos.length; i++) {
           
            System.out.println("["+aDatos[i]+"]");
        }
        System.out.println(aDatos);
        System.out.println(aCopia);
    }
    
}

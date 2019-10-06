package eva1_12_matrices;

public class Principal12 {

    public static void main(String[] args) {
        int aMatriz [][] = new int [3][5];
        
        //FOR ANIDADO 
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int)(Math.random()*100);  
            } 
        }
        
        //Imprimir la matriz
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz [i][j]+ "]");
            }   
            System.out.println("");
        }
        
    }
    
}

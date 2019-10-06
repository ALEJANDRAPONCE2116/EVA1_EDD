package examen_practico;

public class Examen_Practico{
    public static void main(String[] args) {
        System.out.println(genera_clave());
        
        
    }
    public static String genera_clave () {
        int i;
     
         i = (int) (Math.random()*1000);
         String resu;
         if (i < 10 ){ resu= "000"+i;}
         else if (i < 100){resu= "00"+i;}
         else if (i < 1000){resu= "0"+i;}
         else { resu= "" + i;}
          
         
         return resu;
         
         
          
         }
    }

abstract class Algo {}//impide crear instancias de algo

//no estatico -> estatico SI
//estatico -> no estatico NO
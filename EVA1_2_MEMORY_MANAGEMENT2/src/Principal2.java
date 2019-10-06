//Isela Alejandra Ponce de León Carrasco  ||  18550720
//Acabar el stack en la memoria tiempo de ejecución
public class Principal2 {

    public static void main(String[] args) { //main también es una llamada a función
        fakeChrome();
    }
    public static void fakeChrome(){
        fakeChrome(); //---> recursividad
    }
}

//stack --> se determina en tiempo de ejecución
//Recursividad --> cuando 
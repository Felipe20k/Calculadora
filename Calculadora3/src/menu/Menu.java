package menu;
/**
 * @author Felipe
 */
import java.util.Scanner;
/**
 * Este seria el menu principal
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    
    /**
     * Esta funcion hace que pida por entrada dos valores numericos
     * 
     * @return dev
     */
    
    public int[] pedirNumeros(){
    
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Esta funcion hace que cuando se den los dos valores te diga que quieras hacer si multiplicar,dividir,etc
     * 
     * @return Si no cumple la funcion del while como poner un numero o letra hace que vuelva a la entrada 
     */
    
    public String menuOpciones() {
    	
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
   /**
    * 
    * Esta funcion hace que cuando se cumpla la anterior funcion decidas si seguir con la calculadora o no
    * 
    * @return Devuelve un verdadero o falso dependiendo de de eligas si o no
    */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}
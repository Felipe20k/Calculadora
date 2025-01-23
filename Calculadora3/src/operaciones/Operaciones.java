package operaciones;
/**
 * @author Felipe
 */
public class Operaciones{
/**
 * 
 * Metodo para sumar dos valores
 * 
 * @param valor1 Introduce la primera cifra
 * @param valor2 Introduce la segunda cifra
 * @return devuelve la suma de los dos valores
 */
    public int sumar (int valor1, int valor2){
    	
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
/**
 * 
 * Metodo para restar dos valores
 * 
 * @param valor1 Introduce la primera cifra
 * @param valor2 Introduce la segunda cifra
 * @return devuelve la resta de los dos valores
 * 
 */
    
    public int restar (int valor1, int valor2){
    	
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
 /**
  * 
  * Metodo para multiplicar dos valores
  * 
  * @param valor1 Introduce la primera cifra
  * @param valor2 Introduce la segunda cifra
  * @return devuelve la multiplicacion de los dos valores
  * 
  */
    public int multiplicar (int valor1, int valor2){
    	
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * 
     * Metodo para dividir dos valores
     * 
     * @param valor1 Introduce la primera cifra
     * @param valor2 Introduce la segunda cifra
     * @return devuelve la division de los dos valores
     */
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    
    /**
     * Metodo de resto para dos valores 
     * 
     * @param valor1 Introduce la primera cifra
     * @param valor2 Introduce la segunda cifra
     * @return devuelve el resto de un division de dos valores
     */
    
    public int resto (int valor1, int valor2){
  
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}
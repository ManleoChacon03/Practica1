
package practicalogicapresaberes;

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;

public class PRACTICALOGICAPRESABERES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una palabra: ");
        String texto = scanner.nextLine();
        int valorTotal = calcularValorLetras(texto);
        System.out.println("El valor total de las letras es: " + valorTotal);
        scanner.close();
       
    }
    
    public static int calcularValorLetras(String texto){
        Map<Character, Integer> valoresLetras = new HashMap<>();
        
        valoresLetras.put('a', 1);valoresLetras.put('e', 1);valoresLetras.put('i', 1);
        valoresLetras.put('o', 1);valoresLetras.put('u', 1);valoresLetras.put('l', 1);
        valoresLetras.put('n', 1);valoresLetras.put('r', 1);valoresLetras.put('s', 1);valoresLetras.put('t', 1);
        
        valoresLetras.put('d', 2);valoresLetras.put('g', 2);
        
        valoresLetras.put('b', 3);valoresLetras.put('c', 3);valoresLetras.put('m', 3);valoresLetras.put('p', 3);
        
        valoresLetras.put('f', 4); valoresLetras.put('h', 4);valoresLetras.put('v', 4);valoresLetras.put('w', 4);
        valoresLetras.put('y', 4);
        
        valoresLetras.put('k', 5);
        
        valoresLetras.put('j', 8);valoresLetras.put('x', 8);
        
        valoresLetras.put('q', 10);valoresLetras.put('z', 10);       
        
        int valorTotal = 0;
        
        for (char letra : texto.toLowerCase().toCharArray()){
            if (valoresLetras.containsKey(letra)){
                valorTotal += valoresLetras.get(letra);
            }
            
        }
        
       return valorTotal; 
    }
    
}

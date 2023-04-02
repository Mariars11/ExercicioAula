package exercicio.inputstring;

import java.util.*;

class exString{
    String frase;
    public void numCaracteres(){
        System.out.println("Número de caracteres: " + frase.length()); 
    }
    public void stringMaiuscula(){
        System.out.println("Letras maiusculas: " + frase.toUpperCase()); 
    }
    public int numVogais(){
        int totalVogais = 0;
        String fraseComparacao = frase.toLowerCase();
        
        for(int i = 0; i < frase.length(); i++){
            if(fraseComparacao.charAt(i) == 'a' || fraseComparacao.charAt(i) == 'e'|| 
                    fraseComparacao.charAt(i) == 'i'|| fraseComparacao.charAt(i) == 'o' || fraseComparacao.charAt(i) == 'u'){ 
                
                totalVogais++; 
            }
        }
        
        return totalVogais;
    }
    public int numDigitos(){
        int totalDigitos = 0;
        String fraseComparacao = frase.toLowerCase();

        for(int i = 0; i < frase.length(); i++){
            if(fraseComparacao.charAt(i) == '0' || fraseComparacao.charAt(i) == '1'|| 
                    fraseComparacao.charAt(i) == '2'|| fraseComparacao.charAt(i) == '3' || fraseComparacao.charAt(i) == '4' || 
                    fraseComparacao.charAt(i) == '5'|| fraseComparacao.charAt(i) == '6' || fraseComparacao.charAt(i) == '7' || 
                    fraseComparacao.charAt(i) == '8'|| fraseComparacao.charAt(i) == '9' ){ 
                
                totalDigitos++; 
            } 
        }
        
        return totalDigitos;
    }
    
    public void startsEh(){
        String fraseComparacao = frase.toLowerCase();

        if(fraseComparacao.startsWith("é")){ 
            System.out.println("Começa com é"); 
        } else System.out.println("Não começa com é");
    }
    public void endsBonita(){
        String fraseComparacao = frase.toLowerCase();
        
        if(fraseComparacao.endsWith("bonita")){ 
            System.out.println("Termina com bonita");
        } else System.out.println("Não termina com bonita");
    }
    
    public void isPalindromo(){
        String reversa = "";
        
        for(int i = frase.length() - 1; i >= 0; i--){
            reversa += frase.charAt(i);
        }
        String reversaNoSpaces = reversa.toLowerCase().replaceAll("\\s+","");
        String fraseNoSpaces = frase.toLowerCase().replaceAll("\\s+","");
        
        if(reversaNoSpaces.equalsIgnoreCase(fraseNoSpaces)){ 
            System.out.println("É um palindromo!");
        } else System.out.println("Não é um palindromo");
        
    }
}
/*
    A) O número de caracteres da string. ok

    B) A string com todas suas letras em maiúsculo. ok

    C) O número de vogais da string. ok

    D) Se a string digitada começa com “É” (ignorando maiúsculas/minúsculas). ok 

    E) Se a string digitada termina com “bonita” (ignorando maiúsculas/minúsculas). ok

    F) O número de dígitos (0 a 9) da string. 

    G) Se a string é um palíndromo ou não. 
*/
public class InputString {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        exString string = new exString();
        
        System.out.print("Digite uma frase: ");
        string.frase = scan.nextLine(); 
        
        string.numCaracteres();
        string.stringMaiuscula();
        
        System.out.printf("Total de vogais: %d\n", string.numVogais());
        
        string.startsEh();
        string.endsBonita();
        
        System.out.printf("Total de digitos: %d\n", string.numDigitos());
        
        string.isPalindromo();
        
    } 

} 

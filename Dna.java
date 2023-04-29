/*
 Escreva uma classe StringDNA que seja capaz de processar uma string de DNA. Strings de DNA são strings que são formadas exclusivamente 
pelos caracteres ’A’, ’C’, ’G’ e ’T’ – nenhum outro caracter é permitido. Essa classe deve encapsular uma instância da classe String e 
conter ao menos os seguintes métodos:

Construtor, que recebe uma instância da classe String como argumento e copia somente os caracteres válidos para a string encapsulada 
(por exemplo, se a string passada for “CATGATTAG”, a string encapsulada deverá ser “CATGATTAG”, mas se a string passada for “JAVA”, 
a string encapsulada deverá ser “AA”).
paraString, que retorna a string encapsulada;
caractereEm, que retorna o caracter na posição que for passada como argumento;
quantosA, quantosC, quantosG e quantosT, que retornam, respectivamente, quantos caracteres ’A’, ’C’, ’G’ e ’T’ existem na string encapsulada; e
tamanho, que retorna o comprimento da string encapsulada.
Escreva, para a classe StringDNA, um método reversoComplementar que retorne o reverso complementar da string encapsulada pela classe. 
O reverso complementar é calculado em dois passos: primeiramente trocamos cada caracter por seu complementar 
(isto é, ’A’ por ’T’ e vice-versa, ’C’ por ’G’ e vice-versa), depois revertemos a string de forma que o primeiro caracter seja o último e vice-versa. 
Por exemplo, se a string encapsulada for “CTAGGATA” o método deverá retornar “TATCCTAG”. O reverso complementar deve ser retornado como uma nova instância
da própria classe StringDNA.
Crie, na classe StringDNA, o método compara que recebe uma instância da própria classe StringDNA para comparação e retorna um valor inteiro, 
calculado com o seguinte algoritmo:
Coloque o valor zero em um acumulador
Para cada posição nas duas strings, compare os dois caracteres na posição:
Se os caracteres forem exatamente iguais, some +3 pontos ao acumulador;
Se os caracteres forem as combinações ’A’ e ’T’ ou ’T’ e ’A’, some +1 ponto ao acumulador;
Se os caracteres forem as combinações ’C’ e ’G’ ou ’G’ e ’C’, some +1 ponto ao acumulador;
Quando terminarem os caracteres de uma das strings, o valor acumulado será o valor a ser retornado pelo método.
Exemplo:

Se a instância da classe StringDNA contiver a string ”ACATTG” e para o método compara for passada como argumento a string ”ATTCCG”, o valor a ser 
retornado será 3 + 0 + 1 + 0 + 0 + 3 = 7.
 */

package aula6.projeto1;

import java.util.Scanner;

class StringDNA{
    private String DNA;
    
    public StringDNA(String dna){
        dna = dna.toUpperCase();
        String encapsulada = "";
        
        for(int i = 0; i < dna.length(); i++){
            if(dna.charAt(i) == 'A' || dna.charAt(i) == 'C' || dna.charAt(i) == 'G' || dna.charAt(i) == 'T'){
                encapsulada += dna.charAt(i);
            }
        }
        this.DNA = encapsulada;
    }
    
    public String paraString(){
        return this.DNA;
    }
    
    public void caractereEm(){
        String dnaUpper = this.DNA.toUpperCase();
        for(int i = 0; i < this.DNA.length(); i++){
            if(dnaUpper.charAt(i) == 'A' || dnaUpper.charAt(i) == 'C' || dnaUpper.charAt(i) == 'G' || dnaUpper.charAt(i) == 'T'){
                System.out.println("Caractere: " + dnaUpper.charAt(i) + " na posição: " + i);
            }
        }
    }
    public void quantidadeCaracteres(){
        int countA = 0;
        int countC = 0;
        int countG = 0;
        int countT = 0;
        String dnaUpper = this.DNA.toUpperCase();
        for(int i = 0; i < this.DNA.length(); i++){
            if(dnaUpper.charAt(i) == 'A' ){
                countA++;
            }
            else if(dnaUpper.charAt(i) == 'C'){
                countC++;
            }
            else if(dnaUpper.charAt(i) == 'G' ){
                countG++;
            }
            else if(dnaUpper.charAt(i) == 'T'){
                countT++;
            }
        }
        
        System.out.println("Quantidade de A's: " + countA);
        System.out.println("Quantidade de C's: " + countC);
        System.out.println("Quantidade de G's: " + countG);
        System.out.println("Quantidade de T's: " + countT);
        System.out.println("Tamanho da String encapsulada: " + dnaUpper.length());
    }
    
    public void reversoComplementar(){
        String dnaUpper = this.DNA.toUpperCase();
        String invertida = "";
        String complementar = "";
        
        for(int i = dnaUpper.length() - 1; i >= 0; i--){
            invertida += dnaUpper.charAt(i);
        }
        for(int i = 0; i < invertida.length(); i++){
            if(invertida.charAt(i) == 'A'){
                complementar += "T";
            }
            else if(invertida.charAt(i) == 'T'){
                complementar += "A";
            }
            else if(invertida.charAt(i) == 'G'){
                complementar += "C";
            }
            else if(invertida.charAt(i) == 'C'){
                complementar += "G";
            }
        }
        
        System.out.println("String complementar invertida: " + complementar);
    }
    
    public int comparacao(String dnaComparacao){
        int acumulador = 0;
        String dnaUpper = this.DNA.toUpperCase();
        dnaComparacao = dnaComparacao.toUpperCase();
        
        for(int i = 0; i < dnaUpper.length(); i++){
            if(dnaUpper.charAt(i) == dnaComparacao.charAt(i)){
                acumulador += 3;
            }
            else if((dnaUpper.charAt(i) == 'A' && dnaComparacao.charAt(i) == 'T') || (dnaUpper.charAt(i) == 'T' && dnaComparacao.charAt(i) == 'A')){
                acumulador += 1;
            }
            else if((dnaUpper.charAt(i) == 'C' && dnaComparacao.charAt(i) == 'G') || (dnaUpper.charAt(i) == 'G' && dnaComparacao.charAt(i) == 'C')){
                acumulador += 1;
            }
        }
        return acumulador;
    }
    
}

public class Projeto1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o DNA: ");
        String dna = scan.nextLine();
        
        StringDNA Dna = new StringDNA(dna);
        
        System.out.println(Dna.paraString());
        Dna.caractereEm();
        Dna.quantidadeCaracteres();
        Dna.reversoComplementar();
        
        System.out.print("Informe o DNA para comparação: ");
        String dnaComparacao = scan.nextLine();
        
        System.out.println("O resultado: " +  Dna.comparacao(dnaComparacao));
    }
}

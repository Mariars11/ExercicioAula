package exercicio.fracao;

import java.util.*;

class Fracoes{
    int numerador, denominador, resto;
    //transforma no formato (u + n/d)
    String ToString(){
        //declaração
        int divisao = numerador / denominador;
        String resultado;
        //atribuição
        resto = numerador % denominador;
        //condicionais das situações
        if(denominador == 0){
            resultado = "O denominador não pode ser 0";
            return resultado;
        }   
            else if(numerador == 0 || numerador == denominador || resto == 0){
                resultado =  String.format("%d", divisao);
                return resultado;
            } 
                else if(numerador < denominador){
                    resultado =  String.format("%d / %d ", this.numerador, this.denominador);
                    return resultado;
                }
                
        else {
            resultado =  String.format("%d + %d / %d ", divisao, this.resto, this.denominador);
            return resultado;
        }   
    }
    //Transforma em decimal
    float toDecimal(){
        float divisao = ((float)numerador / denominador); //divisao entre ints que vira float
        return divisao;
    } 
    //simplificação da fração
    void simplify(){
        int a, b;
         
        a = this.numerador;
        b = this.denominador;
         
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
         
        System.out.printf("-> Simplificação da divisão:\n%d / %d", numerador / a, denominador / a);
     }
}

/**
 Crie uma classe Fracao para representar frações, que deverá conter como atributos dois inteiros: o
numerador e o denominador; e não se esqueça de criar construtores para iniciar os atributos da
respectiva classe:
• public String toString(): método que devolve uma representação em texto no formato u + n/d, em
que u e n/d representam a parte inteira e a parte decimal da fração. Por exemplo, para 7/3 seria
devolvido "2 + 1/3“;
• public float toDecimal(): método que devolve a representação decimal da fração. Por exemplo,
para 7/3 seria devolvido 2,33 (pode considerar apenas duas casas decimais);
• public void simplify(): método que simplifica a fração dividindo o numerador e o denominador
pelo seu máximo divisor comum (MDC). Por exemplo, a fração 18/48 passaria a ser 3/8, uma vez
que MDC(18,48)=6.

 */
public class Fracao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //inicialização da classe
        Fracoes fracao = new Fracoes();
        //entrada de dados
        System.out.print("Informe o numerador: ");
        fracao.numerador = scan.nextInt();
        System.out.print("Informe o denominador: ");
        fracao.denominador = scan.nextInt();
        
        System.out.println("\n");
        System.out.println("+-------------------------------+");
        System.out.printf("|\tA fração: %d / %d\t |", fracao.numerador, fracao.denominador);
        System.out.println("\n+-------------------------------+");
        
        System.out.printf("-> Representada em texto no formato (u + n/d)\n[ %s ]", fracao.ToString());
        System.out.println("\n");
        
        System.out.printf("-> Representação em decimal:\n%.2f", fracao.toDecimal());
        
        System.out.println("\n");
        fracao.simplify();
        
    }
}

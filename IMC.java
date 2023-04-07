package exercicio.imc;

import java.util.Scanner;

class Paciente{
    Scanner scan = new Scanner(System.in);
    private int peso;
    private float altura;
    
    String classificação(){
        float imc = this.calcularIMC();
        System.out.println("Seu IMC: " + imc);
        if(imc <= 18.4){
            return "Abaixo do Peso!";
        }
        else if(imc <= 18.4){
            return "Abaixo do Peso!";
        }
        else if(imc > 18.4 && imc <= 24.9){
            return "Peso ideal!";
        }
        else if(imc > 24.9 && imc <= 29.9){
            return "Sobrepeso!";
        }
        else if(imc > 29.9 && imc <= 34.9){
            return "Obesidade Grau 1!";
        }
        else if(imc > 34.9 && imc <= 39.9){
            return "Obesidade Grau 2!";
        }
        else if(imc > 39.9){
            return "Obesidade Grau 3!";
        } else return "Não foi possivel classificar!";
    };
    float calcularIMC(){
        System.out.print("Informe o peso: ");
        this.peso = scan.nextInt();
        System.out.print("Informe a altura: ");
        this.altura = scan.nextFloat();
        
        float imc = (float)this.peso/(this.altura * this.altura);
        return imc;
    };
  
}

public class IMC {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        
        System.out.printf("%s", paciente.classificação());
    }
}

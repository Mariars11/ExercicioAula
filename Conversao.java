package projetofinal.sistemaconversor;

import java.util.Scanner;

abstract class Temperatura{
    private double Graus;
    public abstract double Conversao(int opcao);
    
    public Temperatura(double graus){
        this.Graus = graus;
    }
}
class Celsius extends Temperatura{
    private double Resultado;
    private double GrausCelsius;
    public Celsius(double graus){
        super(graus);
        this.GrausCelsius = graus;
    }
    @Override
    public double Conversao(int opcao){
        double retorno;
        switch(opcao){
            case 1:{
                this.Resultado = (this.GrausCelsius * 9/5) +32;
                retorno = this.Resultado;
                break;
            }
            case 2:{
               this.Resultado = (this.GrausCelsius + 273.15 );
               retorno = this.Resultado;
               break;
            }
            default:{
                retorno = 0;
            }
        }
        return retorno;
    }
}
class Fahrenheit extends Temperatura{
    private double Resultado;
    private double GrausFahrenheit;
    public Fahrenheit(double graus){
        super(graus);
        this.GrausFahrenheit = graus;
    }
    @Override
    public double Conversao(int opcao){
        double retorno;
        switch(opcao){
            case 3:{
               this.Resultado = ((this.GrausFahrenheit - 32) / 1.8);
                retorno = this.Resultado;
               break;
            }
            case 4:{
               this.Resultado = ((this.GrausFahrenheit - 32) / 1.8) + 273.15;
                retorno = this.Resultado;
               break;
            }
            default:{
                retorno = 0;
            }
        }
        return retorno;
    }
}
class Kelvin extends Temperatura{
    private double Resultado;
    private double GrausKelvin;
    public Kelvin(double graus){
        super(graus);
        this.GrausKelvin = graus;
    }
    @Override
    public double Conversao(int opcao){
        double retorno;
        switch(opcao){
            case 5:{
               this.Resultado = ((this.GrausKelvin - 273.15) * 1.8) + 32;
                retorno = this.Resultado;
               break;
            }
            case 6:{
               this.Resultado = (this.GrausKelvin - 273.15);
                retorno = this.Resultado;
               break;
            }
            default:{
                retorno = 0;
            }
        }
        return retorno;
    }
}
public class SistemaConversor {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int escolha;
       
        
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Conversor de Temperatura");
        System.out.println("2 - Conversor de Moeda");
        System.out.print("Informe: ");
        escolha = scan.nextInt();
        
        switch(escolha){
            
            case 1:{
                int opcao;
                double graus;
                System.out.println("Escolha uma das opções abaixo: ");
                System.out.println("1 - Converter de Celsius para Fahrenheit");
                System.out.println("2 - Converter de Celsius para Kelvin");
                System.out.println("3 - Converter de Fahrenheit para Celsius");
                System.out.println("4 - Converter de Fahrenheit para Kelvin");
                System.out.println("5 - Converter de Kelvin para Fahrenheit");
                System.out.println("6 - Converter de Kelvin para Celsius");
                System.out.print("Informe: ");
                opcao = scan.nextInt();
                System.out.print("Informe o valor da temperatura(sem o simbolo °): ");
                graus = scan.nextDouble();
                if(opcao == 1 || opcao == 2){
                    Celsius celsius = new Celsius(graus);
                    System.out.println("A temperatura convertida é: " + celsius.Conversao(opcao));
                    //Celsius
                }
                else if(opcao == 3 || opcao == 4){
                    Fahrenheit fahrenheit = new Fahrenheit(graus);
                    System.out.println("A temperatura convertida é: " + fahrenheit.Conversao(opcao));
                    //Celsius
                    //Fahrenheit
                }
                else if(opcao == 5 || opcao == 6){
                    Kelvin kelvin = new Kelvin(graus);
                    System.out.println("A temperatura convertida é: " + kelvin.Conversao(opcao));
                    //Kelvin
                }
                
                break;
            }
            case 2:{
                System.out.println("Escolheu Moeda");
                break;
            }
            default:{
                System.out.println("Não escolheu nenhuma opção!");
                break;
            }
        }
    }
}

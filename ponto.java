package exercicio.ponto;

import java.util.*;


class PontoCartesiano{
    int x, y;
    
    double getModulo(){
        double modulo = Math.sqrt((this.x * this.x) + (this.y*this.y));
        return (modulo);
    }
    String getQuadrante(){
        String quadrante;
        if(this.x > 0 && this.y > 0){
           quadrante = "Pertence ao primeiro quadrante";
           return(quadrante);
        } else if(this.x < 0 && this.y > 0){
            quadrante = "Pertence ao segundo quadrante";
            return(quadrante);
        }
         else if(this.x < 0 && this.y < 0){
            quadrante = "Pertence ao terceiro quadrante";
            return(quadrante);
        } else if(this.x > 0 && this.y < 0){
             quadrante = "Pertence ao quarto quadrante";
              return(quadrante);
         } else if(this.x == 0 && this.y == 0){
             quadrante = "Localizado na origem (0,0)";
              return(quadrante);
         }  else if(this.x == 0 && this.y != 0){
             quadrante = "Localizado no eixo y";
             return(quadrante);
         }    
           else if(this.x != 0 && this.y == 0){
             quadrante = "Localizado no eixo x";
             return(quadrante);
         }    
           else{
               return("Não foi possivel localizar o quadrante.");
           }
    }
}
/**
Crie uma classe Ponto para representar pontos no plano cartesiano, que deverá conter como
atributos dois valores numéricos, que representam as coordenadas no espaço bidimensional (R²).
Implemente também os seguintes métodos:
• public Ponto (float x, float y): método construtor da classe, responsável por inicializar as
coordenadas de cada objeto declarado;
• public float getModulo(): método que devolve a distância do ponto até a origem (pode ser
calculado utilizando fórmula que deriva do Teorema de Pitágoras;
• public String getQuadrante(): método que devolve o quadrante em que o ponto está localizado
(estabeleça notação caso o ponto esteja localizado nos eixos coordenados ou na origem).

 */
public class Ponto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        PontoCartesiano ponto = new PontoCartesiano();
        
        System.out.print("Informe o x: ");
        ponto.x = scan.nextInt();
        System.out.print("Informe o y: ");
        ponto.y = scan.nextInt();
        
        System.out.println("+-------------------------------------------------+");
        System.out.printf("\tO modulo: %.3f\n", ponto.getModulo());
        System.out.printf("\t%s\n", ponto.getQuadrante());
        System.out.println("+-------------------------------------------------+");

    }
}

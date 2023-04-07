package exercicio.eleitoral;

import java.util.Scanner;

class Eleitor{
    Scanner scan = new Scanner(System.in);
    private int idade;
    String classeEleitoral;
    int getIdade(){
        System.out.print("Informe a idade: ");
        this.idade = scan.nextInt();
        return idade;
    };
    String getClasse(){
        if(this.idade < 16){
            return "Não eleitor!";
        }
        else if(this.idade >= 18 && this.idade < 65){
            return "Eleitor Obrigatorio!";
        }
        else if((this.idade >= 16 && this.idade < 18) || this.idade >= 65){
            return "Eleitor Facultativo!";
        }
        else return "Informação não disponivel!";
    };
}

public class Eleitoral {

    public static void main(String[] args) {
        
        Eleitor eleitor = new Eleitor();
        
        eleitor.getIdade();
        System.out.printf("%s", eleitor.getClasse());
    }
}

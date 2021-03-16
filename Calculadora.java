package projetos;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double x, y;
        String operacao;
        
        System.out.println("Essa é uma cálculadora com duas entradas\nAs operações usadas são (+, -, *, /)\nlogo: ");
        System.out.println("Digite o primeiro número: ");
        x = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        y = entrada.nextDouble();
        System.out.println("Digite a operação: ");
        operacao = entrada.next();
        
        if (operacao.equals("+")){
            System.out.println(x + y);
        }
        else if (operacao.equals("-")){
            System.out.println(x - y);
        }
        else if (operacao.equals("*")){
            System.out.println(x*y);
        }
        else if (operacao.equals("/")){
            System.out.println(x/y);
        }
        else{
            System.out.println("Operação Invalida");
        }
        
    }
}

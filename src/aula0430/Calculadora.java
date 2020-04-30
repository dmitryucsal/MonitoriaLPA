package aula0430;

import java.util.Scanner;

public class Calculadora {
    /*
    Elabore uma solução para criar uma calculadora na qual sejam feitas as
    quatro operações básicas (somar, subtrair, dividir e multiplicar) a partir
    de dois valores inteiros, positivos informados pelo usuário.
     */

    public static void main(String[] args) {
        //Variáveis que a calculadora usará
        int opcao = 0;
        double resultado = 0.0;

        //Para digitar os números no programa, precisamos criar um Scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos ao usuário que digite dois números inteiros e positivos
        System.out.println("Informe um número inteiro e positivo");
        int valor1 = sc.nextInt();
        System.out.println("Informe outro número inteiro e positivo");
        int valor2 = sc.nextInt();
        //Enquanto (while) os números não forem inteiros e positivos, o programa perguntará novamente
        //ao usuário quais números serão calculados
        while(valor1 < 0 || valor2 < 0) {
            System.out.println("O véi, é pra ser positivo e inteiro");
            System.out.println("Informe um número inteiro e positivo");
            valor1 = sc.nextInt();
            System.out.println("Informe outro número inteiro e positivo");
            valor2 = sc.nextInt();
        }

        //Perguntaremos agora ao usuário qual o cálculo que ele deseja realizar
        //utilizando o switch
        System.out.println("Escolha:\n" +
                "1 - Para somar\n" +
                "2 - Para subtrair\n" +
                "3 - Para dividir\n" +
                "4 - Para multiplicar.");
        opcao = sc.nextInt();
        //Dependendo da resposta ao trecho acima, a calculadora realizará uma conta
        switch (opcao) {
            case 1:
                //somar, subtrair, multiplicar e dividir são métodos que criamos lá embaixo
                resultado = somar(valor1,valor2);
                break;
            case 2:
                resultado = subtrair(valor1,valor2);
                break;
            case 3:
                resultado = dividir(valor1, valor2);
                break;
            case 4:
                resultado = multiplicar(valor1,valor2);
                break;
        }

        //Aqui imprimimos o resultado
        System.out.println(resposta()+resultado);




//        O trecho de código abaixo roda todas as operações da calculadora
//        de uma vez
//        resultado = somar(valor1,valor2);
//        System.out.println("A soma é "+resultado);
//        resultado = subtrair(valor1,valor2);
//        System.out.println(resposta() +resultado);
//        resultado = multiplicar(valor1,valor2);
//        System.out.println("A multiplicação é "+resultado);
//        resultado = dividir(valor1,valor2);
//        System.out.println("A divisão é "+resultado);

    }

    //Aproveitamos aqui para falar de métodos. Temos 4 métodos que retornam um valor em
    //double. Cada método realiza um tipo de operação
    public static double somar(double valor1, double valor2) {
        double resultado = 0.0;
        resultado = valor1+valor2;
        return resultado;
    }
    public static double subtrair(double valor1, double valor2) {
        return valor1-valor2;
    }
    public static double dividir(double valor1, double valor2) {
        double resultado = valor1/valor2;
        return resultado;
    }
    public static double multiplicar(double valor1, double valor2) {
        return valor1*valor2;
    }
    //Este método retorna uma String, que será usada para apresentar o resultado.
    public static String resposta () {
        return "O resultado é ";
    }
}

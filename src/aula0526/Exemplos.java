package aula0526;

/*elabore uma solução para construir uma calculadora que possa executar as 04 operações básicas: somar, subtrair,
multiplicar e dividir. As operações devem ser feitas com apenas duas parcelas.
Cada operação deve ser programada em um método especifico, sendo que deverá ter um método apenas para executar a
operação selecionada a partir das informações obtidas do usuário.

 */

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //Criamos um scanner pra ler entradas do teclado e declaramos as variáveis
        Scanner osvaldo = new Scanner(System.in);
        int opcao = 0;
        double a = 0;
        double b = 0;
        double resultado = 0;
        //Pedimos ao usuário os dois valores a serem calculados
        System.out.println("Qual o primeiro número?");
        a = osvaldo.nextDouble();
        System.out.println("Qual o segundo número?");
        b = osvaldo.nextDouble();

        //utilizamos um switch para saber qual a operação desejada
        System.out.println("Que operação deseja realizar? Escolha:\n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Dividir\n" +
                "4 - Multiplicar");
        opcao = osvaldo.nextInt();
        switch (opcao){
            //Para realizar a conta, chamamos os métodos relacionados a cada operação
            case 1:
                System.out.println("O resultado da sua soma é "+soma(a,b));
                //resultado = soma(a, b);
                break;
            case 2:
                System.out.println("O resultado da sua subtração é "+subtracao(a,b));
                //resultado = subtracao(a,b);
                break;
            case 3:
                System.out.println("O resultado da sua divisão é "+divisao(a,b));
                //resultado = divisao(a,b);
                break;
            case 4:
                System.out.println("O resultado da sua multiplicação é "+multiplicacao(a,b));
                //resultado = multiplicacao(a,b);
                break;
            default:
                System.out.println("Sabe ler não? É de 1 a 4");
                break;

        }
        //System.out.println("O resultado é "+resultado);

        //chamamos o método acabou, para mostrar que não é preciso criar uma variável para chamar um método
        acabou();

    }

    //Método diz apenas que acabou a execução
    public static void acabou() {
        System.out.println("Por hoje é só pessoal");
    }

    //cada método faz uma operação e retorna um valor
    public static double soma (double a, double b) {
        return  a+b;
    }

    public static double subtracao (double a, double b) {
        double resultado = 0;
        resultado = a - b;
        return resultado;
    }

    public static double multiplicacao (double a, double b) {
        double resultado = a * b;
        return resultado;
    }

    public static double divisao (double a, double b) {
        return a/b;
    }


}

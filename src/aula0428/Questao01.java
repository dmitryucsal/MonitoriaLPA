package aula0428;

public class Questao01 {
    /*
    Elabore uma sequência Fibonacci contendo 30 elementos e obtenha a soma de todos
    os elementos da sequência
     */
    public static void main(String[] args) {
        System.out.println("Contador de Fibonacci (30 elementos)");
        System.out.println();
        int fib = 0;
        int ant = 1;
        int soma = 0;
        //for fará a repetição dos comandos dentro das chaves 30 vezes
        for (int paralepipedo = 0; paralepipedo < 30; paralepipedo++) {
            System.out.print(fib +", ");
            //a variável soma vai adicionar o int fib a cada repetição
            soma += fib;
            fib = fib+ant;
            ant = fib;
        }

        System.out.println("\nA soma de todos os elementos da sequência é "+soma);

    }
}

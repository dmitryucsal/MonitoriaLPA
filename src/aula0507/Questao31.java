package aula0507;
/*elabore uma sequencia (PG) de razão 5, contendo 10 elementos, cujo valor inicial
será informado pelo usuário dentro de um intervalo fechado de 50 a 60. O usuario só
poderá informar errado 03 vezes, passou desse número o mesmo deve apresentar
mensagem de fim da execução por ter informado o valor errado e não apresenta a
sequencia. Utilize a estrutura "for"

 */

import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        //Criamos o scanner pra receber dados do teclado
        Scanner sc = new Scanner(System.in);
        //Declaramos as variáveis
        int inicio = 0;
        int contador = 0;


        //faça (do) o que estpa entre as chaves {}
        do {
            //o contador contabiliza a quantidade de tentativas permitida
            contador++;
            //pedimos um número ao usuário
            System.out.println("informe um número entre 50 e 60");
            inicio = sc.nextInt();


            //enquanto (while) a variável inicio for menor que 50 ou maior que 60
            //e o contador for menor que 3
        } while ((inicio < 50 || inicio > 60) && contador < 3);

        //se inicio estiver ente 50 e 60...
        if ((inicio > 50 && inicio < 60)) {
            //faremos uma repetição do que está entre chaves{}
            for(int x = 0; x < 10; x++) {
                System.out.print(inicio+" ");
                inicio = inicio*5;
            }
        }

    }
}

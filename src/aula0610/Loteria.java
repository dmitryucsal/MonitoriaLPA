package aula0610;
/* Criar o jogo da Mega Sena considerando as seguintes ações:

1) Um método para retornar um o array bidimensional que irá representar o cartão.

2) Imprimir o cartão da Mega Sena:
01  02  03  04  05  06  07  08  09  10
11  12  13  14  15  16  17  18  19  20
21  22  23  24  25  26  27  28  29  30
31  32  33  34  35  36  37  38  39  40
41  42  43  44  45  46  47  48  49  50
51  52  53  54  55  56  57  58  59  60

3) Um método para retornar um array unidimensional com os 06 valores  definidos aleatoriamente com o uso do Random

4) Um método para retornar um array unidimensional com os 08 valores informados pelo usuário

5) Após obter os valores dos usuário, imprimir o cartão com os valores informados pelo usuário
6) Imprimir o resultado da correção do cartão considerando que se o usuário acertou todos os valores sorteados informe
"Ganhador da Mega" caso contrário informe os valores que o usuário acertou.
 */

import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        int[][] numeros = numero();
        imprimirCartela(numeros);
        int[] sorteados = sorteio();
        int[] aposta = escolha();
        apuracao(aposta,sorteados);

    }

    public static int[][] numero() {
        int[][] numeros = new int[6][10];
        int inicio = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                numeros[i][j] = inicio;
                inicio++;
            }
        }
        return numeros;
    }

    public  static void imprimirCartela(int[][] numeros) {
        System.out.println("Estes são os números disponíveis para aposta. Boa sorte\n");
        //O primeiro for tem o tamanho de linhas e o segundo usa o tamanho de linhas para imprimir cada coluna
        for(int linhas = 0; linhas < numeros.length; linhas++) {
            for (int colunas = 0;  colunas < numeros[linhas].length; colunas++) {
                //Se número for menor que 10, o zero é adicionado para fins de enquadramento
                if((numeros[linhas][colunas] < 10)) {
                    System.out.print("| 0"+(numeros[linhas][colunas])+" ");
                } else{
                    System.out.print("| "+numeros[linhas][colunas]+" ");
                }
            }
            //Ao fim de cada linha, fecha a cartela de números e pula uma linha
            System.out.println("|");
            System.out.println(" ");
        }
    }

    public  static void imprimir (int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }

    public static int[] sorteio() {
        Random sorte = new Random();
        int[] megasenasorte = new int[6];
        //Estrutura será repetida toda vez números randômicos dentro do vetor forem iguais
        do {
        for (int i = 0; i < megasenasorte.length; i ++) {
            do {
                megasenasorte[i] = sorte.nextInt(60);
            } while (megasenasorte[i] == 0);
        }
            } while (megasenasorte[0]==megasenasorte[1] || megasenasorte[0]==megasenasorte[2] || megasenasorte[0]==megasenasorte[3] ||
                    megasenasorte[0]==megasenasorte[4] || megasenasorte[0]==megasenasorte[5] || megasenasorte[1]==megasenasorte[2] ||
                    megasenasorte[1]==megasenasorte[3] || megasenasorte[1]==megasenasorte[4] ||
                    megasenasorte[1]==megasenasorte[5] || megasenasorte[2]==megasenasorte[3] ||
                    megasenasorte[2]==megasenasorte[4] || megasenasorte[2]==megasenasorte[5] ||
                    megasenasorte[3]==megasenasorte[4] || megasenasorte[3]==megasenasorte[5] ||
                    megasenasorte[4]==megasenasorte[5] );


        return megasenasorte;
    }

    public static int [] escolha () {
        Scanner sc = new Scanner(System.in);
        int[] aposta = new int[8];
        int count = 1;
        System.out.println("Favor escolher 6 desenas da Mega Sena");
        for(int i = 0; i< 6; i++) {
            System.out.println("Escolha número "+count);
            aposta[i] = sc.nextInt();
            count++;
        }
        return aposta;
    }

    public static void apuracao (int[]aposta, int[] sorteados) {

        int count = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                if(aposta[j] == sorteados[i]) {
                    count++;
                }
            }
        }
        System.out.println("Sua aposta\n");
        imprimir(aposta);
        System.out.println("\nNúmeros sorteados\n");
        imprimir(sorteados);
        if(count == 6) {
            System.out.println("Ganhador da Mega");
        } else {
            System.out.println("Você acertou "+count+ " números. Tente novamente");
        }
    }
}

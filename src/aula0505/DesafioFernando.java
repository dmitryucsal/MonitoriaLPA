package aula0505;
/* PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10
 * e razão 6, na qual o valor limite da sequencia será informado pelo usuário, obedecendo aos
 * seguintes critérios:
 * (1) O valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
 * (2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer
 * solicitando o valor, até que esteja dentro do intervalo.
 * A sequencia só será construída quando o usuário informar o valor dentro do intervalo.
 * Com base no texto acima:
 * a) Apresente a sequencia
 * b) Calcule a quantidade de elementos da sequencia
 * c) Calcule a média aritmética do primeiro e último valor da sequencia.
 * d) Identifique a quantidade de números pares existentes na sequencia
 * e) Identifique a quantidade de números ímpares existentes na sequencia
 * f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia
 * g) Calcule a soma de todos os elementos da sequencia
 * h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6
 * respectivamente, quando for possível. Caso a sequencia não apresente um desses elementos, o
 * mesmo deverá ser informado.
 * Utilize a estrutura de repetição (do / while) */

import java.util.Scanner;

public class DesafioFernando {
    public static void main(String[] args) {
        //Declarando as variáveis
        int seq = 0;
        int pa = 10;
        int contador = 0;
        int primeiro = 10;
        int ultimo = 0;
        double media = 0;
        int pares = 0;
        int impares = 0;
        int div3 = 0;
        int soma = 0;
        int quarto = 0;
        int decimo = 0;

        //Criar Scanner para ler entradas do teclado
        Scanner sc = new Scanner(System.in);

        //O que está entre chaves vai ser repetido até que o valor enteja entre 50 e 100
        do{
            System.out.println("Informe um número entre 50 e 100");
            seq = sc.nextInt();
        } while(seq<50 || seq > 100);


        System.out.println("a) Apresente a sequencia");
        //Uma sequência de números do tamanho (seq) informado pelo usuário
        for(int x=0; x<seq; x++){
            //Contador é adicionado a cada volta da repetição
            contador++;
            //Se o contador for 4, estaremos no quarto valor.
            if(contador == 4){
                quarto = pa;
                //Se o contador for 10 estaremos no décimo valor
            } else if (contador == 10) {
                decimo = pa;
            }
            //A variável soma é adicionada do valor de pa para sabermos a soma de todos os valores  na progressão
            soma += pa;

            System.out.print(pa+", ");

            //a cada volta ultimo recebe o valor de pa, para sabermos qual será o último valor
            ultimo = pa;

            //pa é adicionado da razão da progressão (6)
            pa += 6;

            //Se pa%2 = 0, o valor é par
            if(pa%2==0){
                pares++;
                //caso contrário, será ímpar
            } else {
                impares++;
                //Se o valor ímpar, dividido por três, tiver resto 0...
                if(pa%3==0){
                    //div3 é adicionado de 1
                    div3++;
                }
            }
        }

        //As respostas:
        System.out.println("\nb) Calcule a quantidade de elementos da sequencia");
        System.out.println("Resposta: "+contador);
        System.out.println("c) Calcule a média aritmética do primeiro e último valor da sequencia:");
        //Calcula a média aritimética entre o primeiro e o último número
        media = (primeiro+ultimo)/2;
        System.out.println("Resposta: "+media);
        System.out.println("d) Identifique a quantidade de números pares existentes na sequencia");
        System.out.println("Resposta: "+pares);
        System.out.println("e) Identifique a quantidade de números ímpares existentes na sequencia");
        System.out.println("Resposta: "+impares);
        System.out.println("f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia");
        System.out.println("Resposta: "+div3);
        System.out.println("g) Calcule a soma de todos os elementos da sequencia");
        System.out.println("Resposta: "+soma);
        System.out.println("h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6");
        //Calcula a média ponderada
        media = (((double)quarto*4)+((double)decimo*6))/10;
        System.out.println("Quarto "+quarto+" e décimo "+decimo);
        System.out.println("Resposta: "+media);
    }
}

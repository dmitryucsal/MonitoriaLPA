package aula0526;

public class Arrays {
    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
    }

    public static void exercicio1() {
        /*Lê 5 nomes e notas de uma turma,
      calcula e exibe a média das notas da turma e em seguida
      exibe a relação de nomes cuja nota é superior a esta média
         */
        String[] nomes = {"Dmitry", "Fernando", "Osvaldo", "Neiva", "Jeane"};
        double[] notas = {3, 10, 9, 3, 5};
        double media = media(notas);
        System.out.println("A média da turma é "+media);
        for (int i = 0; i < nomes.length; i++) {
            if(notas[i] >= media) {
                System.out.println("O aluno "+nomes[i]+ " teve média maior que a média da sala");
            } else {
                System.out.println("O aluno "+nomes[i]+ " não teve média maior que a média da sala");
            }
        }

    }

    public static double media (double[] medias) {
        double soma = 0;
        double count = 0;
        for(int x = 0; x < medias.length; x++) {
            soma += medias[x];
            count++;
        }
        return soma/count;
    }

    public static void exercicio2() {
        /* criar um array unidimensional contendo uma sequencia aritmética de 20, valores inteiros, positivos iniciada
        com o valor 3, tendo a razão o valor 6. Sendo assim, apresente as soluções dos itens abaixo em métodos específicos
        que retornem as seguintes soluções:

        a) o vetor criado dinamicamente com a sequencia elaborada.
        b) a soma de todos os elementos do item "a".
        c) o vetor criado dinamicamente com os elementos pares elaborado com o retorno do item "a".
        d) o vetor criado dinamicamente com a seque

         */
        int[] vetor = new int[20];
        int valor = 3;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valor;
            valor += 6;
        }
        letraA(vetor);
    }

    public static void letraA(int[] vetor){
        int[] vetorPar = new int[20];
        int contador = 0;
        int soma = 0;
        for (int i =0 ;  i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
            soma += vetor[i];
            if(vetor[i]%2 == 0) {

                contador++;

            }
        }


        System.out.println("\nA Soma de todo mundo é "+soma);
        System.out.println(contador);



    }
}

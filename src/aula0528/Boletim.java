package aula0528;

/*
1) Crie um método para retornar um vetor contendo 03 notas informadas pelo usuário ponderadas em 2, 3 e 5 referente a primeira unidade. As notas devem ser informadas em um intervalo fechado de 0 a 10. Quando a nota for informada fora do intervalo, deve-se solicitar novamente até que o vetor seja totalmente preenchido com as notas dentro do intervalo.
2) Crie um método para retornar um vetor contendo 03 notas informadas pelo usuário
3) Crie um método para retornar um vetor contendo 03 notas informadas pelo usuário ponderadas em 2, 4 e 4 referente a primeira unidade. As notas devem ser informadas em um intervalo fechado de 0 a 10. Quando a nota for informada fora do intervalo, deve-se solicitar novamente até que o vetor seja totalmente preenchido com as notas dentro do intervalo.
4) Crie um método para retornar a média aritmética obtida pela soma de todos os valores do primeiro vetor com o resultado da soma de todos os valores do segundo vetor.
5) Crie um método para retornar o resultado final obtido com a média aritmética calculada no item anterior. Considere aprovado se a média for maior ou igual a 6, caso contrário considere reprovado.
6) Métodos de impressão

OBS - O enunciado pediu uma média aritimética, mas para a coisa toda funcionar foi preciso calcular uma média ponderada, ou a coisa toda não faria sentido
 */

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        //criamos um vetor para obter as notas
        double[] unidade1 = obternotas();
        //imprimimos o vetor só pra ver se está tudo certo
        impressao(unidade1);
        //aqui colocamos os pesos nas notas
        unidade1 = obterUnidade1(unidade1);
        System.out.println(" ");
        System.out.println("As notas da unidade 1, com seus respectivos pesos são ");
        impressao(unidade1);
        //mesma coisa para a unidade 2
        double[] unidade2 = obternotas();
        unidade2 = obterUnidade2(unidade2);
        System.out.println(" ");
        System.out.println("As notas da unidade 2, com seus respectivos pesos são ");
        impressao(unidade2);
        //a nota final vem da média ponderada, enviando os vetores da unidade 1 e 2
        double notaFinal = mediaPonderada(unidade1, unidade2);
        System.out.println(" ");
        //o método responde se a pessoa passou ou não
        aprovadoOuNao(notaFinal);


    }

    public static double[] obternotas(){
        //criamos um scanner para ler entradas do teclado e três doubles para receber as notas
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double nota1 = -1;
        double nota2 = -1;
        double nota3 = -1;
        System.out.println("Favor informar as notas que você tirou nesta unidade:");
        //enquanto as notas forem menores que 0 ou maiores que 10, a classe vai perguntar as notas de novo
        while((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Qual a primeira nota? ");
            nota1 = sc.nextDouble();
            System.out.println("Qual a segunda nota?");
            nota2 = sc.nextDouble();
            System.out.println("Qual a terceita nota?");
            nota3 = sc.nextDouble();
            //Se alguma das notas estiver fora do escopo, ele avisa que não passou
            if((nota1 < 0 || nota1 > 10) || (nota2<0 || nota2 > 10) || (nota3<0 || nota3 > 10)) {
                System.out.println("Números inválidos, tente novamente");
            }

        }
        //Povoamos o vetor com as três notas e retornamos o vetor de double
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        return notas;

    }




    public static double[] obterUnidade1 (double[] notasInformadas) {
        //aqui multiplicamos cada nota informada por seu respectivo peso, povoamos o vetor e devolvemos
        double[] unidade1 = notasInformadas;
        double nota1 = (notasInformadas[0]*2);
        double nota2 = (notasInformadas[1]*3);
        double nota3 = (notasInformadas[2]*5);
        unidade1[0] = nota1;
        unidade1[1] = nota2;
        unidade1[2] = nota3;

        return unidade1;
    }

    public static double[] obterUnidade2 (double[] notasInformadas) {
        //aqui multiplicamos cada nota informada por seu respectivo peso, povoamos o vetor e devolvemos
        double[] unidade2 = notasInformadas;
        double nota1 = (notasInformadas[0]*2);
        double nota2 = (notasInformadas[1]*4);
        double nota3 = (notasInformadas[2]*4);
        unidade2[0] = nota1;
        unidade2[1] = nota2;
        unidade2[2] = nota3;

        return unidade2;
    }

    public static double mediaPonderada(double[] unidade1, double[] unidade2) {
        //aqui usamos o somatório para receber todas as notas do semestre e depois dividir pelo somatório dos pesos
        double somatorio = 0;
        for (int i = 0; i < unidade1.length; i++) {
            somatorio += unidade1[i];
        }
        somatorio = somatorio/10;
        for (int i = 0; i < unidade2.length; i++) {
            somatorio += unidade2[i];
        }
        somatorio = somatorio/10;
        //no fim retornamos a média ponderada
        return somatorio;

    }

    public static void aprovadoOuNao (double media) {
        //método apenas recebe a nota e usa um if para saber se o aluno passou
        System.out.println("Sua média final foi "+media);
        if (media > 6) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
    }

    public static void impressao(double[] notas) {
        //Usa-se um for para percorrer o vetor e imprimir o que tem dentro
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+" ");
        }
    }
}

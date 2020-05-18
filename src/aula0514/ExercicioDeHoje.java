package aula0514;
/*
PROBLEMA: a partir de no nome completo qualquer, atribuído a uma variável com tipo String, construa os
métodos específicos para solucionar cada questão abaixo:
a) Nome do Método: obterDados. Contém a variável nome com o nome completo qualquer
b) Nome do Método: imprimir. Recebe o nome como parâmetro e imprime o nome
c) Nome do Método: palavraPorLinha. Recebe o nome e executa o método de impressão com uma palavra em cada linha
d) Nome do Método: vertical. Recebe o nome e executa o método de impre
 */

import java.util.Scanner;

public class ExercicioDeHoje {
    public static void main(String[] args) {
        //Criamos uma String para receber os dados
        String galvao = obterDados();
        //Chamamos o método que imprime a String na tela
        imprimir(galvao);
    }

    public static String obterDados () {
        //Criamos um Scanner para receber os dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome completo?");
        //Uma String recebe o que é escrito no teclado
        String nome = sc.nextLine();
        return nome;
    }

    public static void imprimir(String nome) {
        //O método apenas recebe uma String e a imprime na tela
        System.out.println("O nome digitado é " + nome);
    }

    public static void palavraPorLinha (String nome) {
        String nomeTrim = nome.trim();
        for(int x = 0; x < nomeTrim.length(); x++) {
            
        }
    }
}

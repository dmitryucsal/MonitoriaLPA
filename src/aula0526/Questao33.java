package aula0526;

/*a partir de no nome completo qualquer, atribuído a uma variável com tipo String, construa os métodos específicos para
solucionar cada questão abaixo:
a) Nome do Método: obterDados. Contém a variável nome com o nome completo qualquer
b) Nome do Método: imprimir. Recebe o nome como parâmetro e imprime o nome
c) Nome do Método: palavraPorLinha. Recebe o nome e executa o método de impressão com uma palavra em cada linha
d) Nome do Método: vertical. Recebe o nome e executa o método de impressão com o nome na vertical
e) Nome do Método: diagonal. Recebe o nome e executa o método de impressão com o nome na diagonal decrescente
f) Nome do Método: inverso. Recebe o nome e executa o método de impressão com o nome de trás para frente

OBS: O método main vai apenas executar o método obterDados.
 */

import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        obterDados();
    }

    public static void obterDados() {
        //Criamos um scanner para receber entradas do teclado
        Scanner sc = new Scanner(System.in);
        //Criamos uma string para ser manipulada no método
        String nomeCompleto;

        System.out.println("Qual seu nome completo?");
        nomeCompleto = sc.nextLine();

        //chamamos cada método da questão, usando um comando para pular uma linha entre eles
        imprimir(nomeCompleto);
        System.out.println(" ");
        palavraPorLinha(nomeCompleto);
        System.out.println(" ");
        maiusculaOuNao(nomeCompleto);
        System.out.println(" ");
        vertical(nomeCompleto);
        System.out.println(" ");
        diagonal(nomeCompleto);
        System.out.println(" ");
        inverso(nomeCompleto);
    }

    //apenas usa um system out para mostrar o nome na tela
    public static void imprimir(String nome) {
        System.out.println("Imprimir: "+nome);
    }

    public static void palavraPorLinha(String nome) {
        //usamso o trim para tirar espaços em branco no início e no final da string
        String palavra = nome.trim();
        //usamos o replace para trocar um espaço em branco por uma quebra de linha
        palavra = palavra.replace(" ", "\n");
        System.out.println("Palavra por linha:\n"+palavra);
    }

    public static void maiusculaOuNao(String nome){
        //apesar de não estar no enunciado, aqui transformamos a palavra em maiúscula e minúscula
        System.out.println("Tudo maiúsculo "+ nome.toUpperCase());
        System.out.println("Tudo minúsculo "+ nome.toLowerCase());
    }

    public static void vertical(String nome) {
        String letra;
        for(int i =0; i < nome.length(); i++) {
            //usamos o substring para separar cada letra da string e imprimí-la com uma quebra de linha
            letra = nome.substring(i, i+1);
            System.out.println(letra);
        }
    }

    private static void diagonal(String nome) {
        String letra = "";
        String espaco = "";
        String tiraespaco;

        //Criamos estr for para fazer uma string do mesmo tamanho do nome apenas com espaços vazios
        for(int i = 0; i < nome.length(); i++){
            espaco = espaco + " ";
        }

        //Aqui separamos cada letra do nome e depois tiramos um espaço em branco da string espaço
        for(int i = 0; i < nome.length(); i++){
            letra = nome.substring(i, i+1);
            tiraespaco = espaco.substring(i);
            System.out.println(tiraespaco+letra);
        }

    }

    public static void inverso (String nome) {
        String letra;
        //o index é feito para contarmos o tamanho do nome informado
        int index = nome.length();
        for (int i = 0; i < nome.length(); i++) {
            //cada letra separada será separada da última (index) para trás
            letra = nome.substring(index-1, index);
            //diminuímos o index para separarmos a letra anterior
            index--;
            System.out.print(letra);
        }
    }
}


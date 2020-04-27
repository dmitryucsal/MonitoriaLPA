package aula0423;

import java.util.Scanner;

/*
Problema: crie uma solução para a partir de 03 valores inteiros, positivos informados pelo usuário seja identificado se
corresponde a um triângulo isósceles, equilátero ou escaleno.
 */


public class Triangulo {
    public static void main(String[] args) {
        //declarando as variáveis de cada lado do triângulo
        double lado1, lado2, lado3;

        //criando um scanner para ler as entradas do teclado
        Scanner sc = new Scanner(System.in);

        //perguntamos ao usuário o tamanho de cada um dos lados do triângulo
        System.out.println("Qual o tamanho do primeiro lado do triângulo?");
        lado1 = sc.nextDouble();
        System.out.println("Qual o tamanho do segundo lado do triângulo?");
        lado2 = sc.nextDouble();
        System.out.println("Qual o tamanho do terceiro lado do triângulo?");
        lado3 = sc.nextDouble();


        //agora é só ver se ele é equilátero, isórceles ou escaleno
        //se for tudo igual..
        if(lado1 == lado2 && lado2==lado3) {
            System.out.println("Este triângulo é equilátero");
        //se não for tudo igua, mas dois dos lados forem iguais..
        } else if(lado1 == lado2 || lado2==lado3 || lado3==lado1) {
            System.out.println("Este triângulo é isórceles");
        //se não for nem uma coisa, nem outra, só pode ser...
        } else {
            System.out.println("Este triângulo é escaleno");
        }
    }
}

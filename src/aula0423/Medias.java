package aula0423;

import java.util.Scanner;

/* Crie uma solução para a partir de dois valores informados em variaveis, imprimir a
média aritmética e se o resultado é aprovado ou reprovado.
Elabore um algoritmo, em pseudocódigo, para calcular a média ponderada de duas notas definidas nas variaveis. Os pesos
das notas são respectivamente 4 e 6. O resultado deverá ser apresentado como "aprovado" ou "reprovado" na seguinte
regra: média final >= 6 -> aprovado, mediafinal < 6. As notas devem estar em um intervalo fechado que inicia com 0
 e termina com 10.
 */

public class Medias {

    public static void main(String[] args) {
        //Aqui declaramos as variáveis
        double nota1, nota2, resultado;
        //Declaramos os pesos das notas para usarmos nas médias ponderadas
        double peso1 = 3;
        double peso3 = 4;


        //Criamos aqui o scanner que lerá as notas do aluno
        Scanner sc = new Scanner(System.in);

        //pedimos que o scanner leia o que o usuário escreveu e armazene estes números nas variáveis
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextInt();

        //Lembrar de usar parênteses para realizar a conta na ordem certa
        resultado = (nota1+nota2)/2;
        System.out.println("A média aritimética é: "+resultado);

        //se a nota for menor que 6, a pessoa perdeu o semestre
        if(resultado < 6) {
            System.out.println("Você perdeu!");
            //caso contrário (else, em inglês) a pessoa passou na metéria
        } else {
            System.out.println("Você passou!");
        }

        //calculando a média ponderada. Lembrando de usar parênteses para fazer tudo na ordem certa
        resultado = ((nota1*peso1) + (nota2*peso3))/(peso1+peso3);
        System.out.println("A média ponderada é: "+resultado);

        //Novamente veremos se a pessoa passou ou não usando if e else
        if(resultado < 6) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Você passou!");
        }



    }




}

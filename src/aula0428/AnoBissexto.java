package aula0428;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        //Verificar se todos os anos de 1950 a 2020 são bissextos ou não
        //Declaramos o ano inicial
        int ano = 1950;
        //Enquanto (while) o ano for menor que 2020 ele vai rodar o que estiver dentro das chaves{}
        while(ano <=2020) {
            //Se (if) o ano for divisível por quatro e não for divisível por 100 ou o ano for divisível por 400
            if((ano% 4 == 0 && ano %100 != 0) || (ano % 400 ==0 )) {
                //Ele dirá que o ano é bissexto
                System.out.println(ano + " é bissexto");
            }
            ano++;
        }



    }
}

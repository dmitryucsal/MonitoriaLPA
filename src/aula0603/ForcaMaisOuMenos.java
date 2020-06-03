package aula0603;

import java.util.Random;
import java.util.Scanner;

public class ForcaMaisOuMenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criamos 2 Strings, uma para receber a palavra do jogo e outra para receber a letra que o jogador vai tentar
        String palavra = qualPalavra();
        String letra = "";
        //Este vetor armazenará as linhas, que darão a dica da palavra
        String[] linhas = linhas(palavra);
        //iniciamos a quantidade de tentativas da pessoa e de acertos
        int tentativas = 0;
        int acertos = 0;
        //imprimimos o vetor de linhas
        System.out.println("Sua palavra é: ");
        imprimirVetor(linhas);
        //Enquanto a quantidade de acertos e de tentaticas não chegar ao limite, o jogo vai rodar
        while(acertos<palavra.length() && tentativas<6) {
            System.out.println("");
            System.out.println("Escolha uma letra: ");
            letra = sc.nextLine().toUpperCase();
            //Se a pessoa escrever uma frase, ao invés de apenas uma letra, o jogo perguntará novamente
            while (letra.length()>1){
                System.out.println("Escreveu errado, tente novamente");
                letra = sc.nextLine().toUpperCase();
            }
            //Testamos se a letra escolhida faz parte da palavra
            boolean teste = acertouOuNao(palavra,letra);
            if (teste == true) {
                //Se a pessoa acertar, acrescentamos o número de acertos, avisamos o jogador e trocamos a linha pela letra
                acertos++;
                System.out.println("Acertou");
                linhas = substituir(linhas, palavra, letra);
            } else {
                //Se a pessoa errar, adicionamos ao número de tentativas
                tentativas++;
                System.out.println("Errou");
            }
            imprimirVetor(linhas);


        }
        System.out.println("Acabou");
    }

    public static String[] substituir (String[] linhas, String palavra, String letra) {
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra.charAt(0)){
                linhas[i] = " "+palavra.charAt(i)+" ";
                }
            }


        return linhas;
    }

    public static String [] linhas (String palavra) {
        String [] sublinhado = new String[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            sublinhado[i] = " _ ";
        }

        return sublinhado;
    }

    public static void imprimirVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }

    public static boolean acertouOuNao(String palavra, String letra) {
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra.charAt(0)){
                return true;
            }
        }
        return false;
    }

    public static String qualPalavra() {
        Random random = new Random();
        String palavraEscolhida = "";
        String [] bancoDePalavras = {"FERNANDO", "TESTE", "CACHORRO", "JOGOS", "DESGRACA"};
        int randomico = random.nextInt(bancoDePalavras.length);
        palavraEscolhida = bancoDePalavras[randomico];
        return palavraEscolhida;

    }

    //Aqui testamos o while, para ver se ele estava rodando a quantidade de vezes que desejamos
//    public static boolean testou() {
//        int opcao = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1 para verdadeiro e 2 para falso");
//        opcao = sc.nextInt();
//        switch (opcao){
//            case 1:
//                return true;
//            case 2:
//                return false;
//        }
//        return false;
//    }
}

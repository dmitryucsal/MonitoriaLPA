package aula0514;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        //Chama um método void
        inicio();
    }

    public static void inicio() {
        //Cria um Scanner para receber entradas do  teclado
        Scanner sc = new Scanner(System.in);
        //Cria o life do personagem e a opção do Switch
        int life = 100;
        int opcao = 0;
        //Enquanto a opção for diferente de 4 (ou seja, sair)
        while(opcao != 4) {
            //Chama o método menu
            menu();
            //Pergunta qual a opção do menu
            opcao = sc.nextInt();
            switch (opcao) {
                // Se o usuário escolher 1, manda chamar o método apanhou Muito
                case 1:
                    life = apanhouMuito(life);
                    break;
                // Se o usuário escolher 2, manda chamar o método apanhou Pouco
                case 2:
                    life = apanhouPouco(life);
                    break;
                // Se o usuário escolher 3, manda chamar o método bebeu Life
                case 3:
                    life = bebeuLife(life);
                    break;
                // Se o usuário escolher 4, apresenta-se o life do personagem e sai do jogo
                case 4:
                    System.out.println("O life do seu personagem ficou em "+life+". Obrigado por jogar");
                    break;
                //Se a pessoa escolher qualquer outra opção, chama o método errou
                default:
                    errou();
                    break;

            }

        }


    }

    //Método recebe o life, faz o cálculo e retorna o novo life
    public static int apanhouMuito(int life) {
        life -= 20;
        System.out.println("Seu personagem apanhou muito e agora tem o life de " + life);
        return life;

    }

    //Método recebe o life, faz o cálculo e retorna o novo life
    public static int apanhouPouco(int life) {
        life -= 5;
        System.out.println("Seu personagem apanhou pouco e agora tem o life de " + life);
        return life;
    }

    //Método recebe o life, faz o cálculo e retorna o novo life
    public  static int bebeuLife (int life) {
        life += 10;
        System.out.println("Seu personagem bebeu uma poçãozinha doida aí e agora tem o life de " + life);
        return life;
    }

    //Método apenas apresenta na tela que a pessoa esclheu uma opção errada
    public static void errou(){
        System.out.println("Digitou oção inválida");
    }

    //Método apresenta na tela as opções do menu
    public static void menu() {
        System.out.println("Digite:\n" +
                "1 - Se ele apanhou muito\n" +
                "2 - Se ele apanhou pouco\n" +
                "3 - Se ele bebeu life\n" +
                "4 - Pra sair porque cansei");
    }
}

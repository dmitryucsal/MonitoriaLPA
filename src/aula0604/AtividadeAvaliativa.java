package aula0604;

import java.util.Scanner;

public class AtividadeAvaliativa {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean entrou = login();
        if(entrou){
            menu();
        } else {
            System.out.println("Erro de login e senha. tchau!");
        }

    }

    public static boolean login() {

        System.out.println("Qual seu nome de usuario?");
        String nome = sc.nextLine();
        System.out.println("Qual sua senha?");
        String senha = sc.nextLine();
        return Login.login(nome,senha);


    }

    public static void menu() {
        System.out.println("Funcionou");
    }
}

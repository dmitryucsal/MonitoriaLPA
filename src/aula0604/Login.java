package aula0604;

import java.util.Scanner;

public class Login {
    public static boolean login(String login, String senha){
        String[] user = {"usuario", "fernando", "nome"};
        String[] password = {"senha", "professor", "pass"};
        boolean passouLogin = false;
        boolean passouSenha = false;
        for (int i = 0; i < user.length; i++) {
            if(user[i].equals(login)){
                passouLogin = true;
                break;
            }
        }
        for (int i = 0; i < password.length; i++) {
            if(password[i].equals(senha)){
                passouSenha = true;
                break;
            }
        }
        if (passouSenha == true && passouSenha == true) {
            return true;
        } else {
            return false;
        }

    }


}

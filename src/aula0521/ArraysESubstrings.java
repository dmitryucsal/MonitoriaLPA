package aula0521;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class ArraysESubstrings {
    public static void main(String[] args) {

        //Cada método chama um exercício que resolvemos hoje
        array1();
        array2();
        valoresSeq2();
        exerceicioLoginSenha();
    }

    public static void array1() {
        /*
        Escreva o código Java, usando laço(s), que preencha um array com os valores:
        a) 10 9 8 7 6 5 4 3 2 1
        b) 0 1 4 9 16 25 36 49 64 81 100
         */
        //Criamnos um array de inteiros com 10 elementos
        int[] teste = new int[10];
        //Um contador
        int contador = 10;
        //Aqui fazemos um for para povoar o array
        for(int x=0; x<10; x++) {
            //Durante a monitoria este exercício foi resolvido de duas formas. Na primeira, cada elemento do array teste
            // ganhava o valor de contador e este era decrescido de 1 unidade
//            teste[x] = contador;
//            contador--;
            //Na segunda, o array era povoado pro 10- o valor de x
            teste[x] = 10 - x;
        }

        //Aqui imprimimos o array
        for(int i = 0; i < 10; i++) {
            System.out.print(teste[i]+" ");
           // contador++;
        }
        System.out.println("");

        //O segundo array tem 11 elementos
        int[] teste2 = new int[11];
        //E povoamos ele com o quadrado do elemento x
        for(int x=0; x<11; x++){
            teste2[x] = x*x;
        }
        //imprimimos o array novamente
        for(int i = 0; i < 11; i++) {
            System.out.print(teste2[i]+" ");

        }
    }

    public static void array2() {
        /*
        Crie um método que recebe um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
         */
        Scanner sc = new Scanner(System.in);
        //Criamos um contador para saber a quantidade de negativos
        int contador = 0;
        //Criamos um array de inteiros com 10 elementos
        int[] teste = new int[10];
        //Dentro do for, pedimos ao usuário que digite os valores do array
        for (int x = 0; x < teste.length; x++) {
            System.out.println("Digite um inteiro:");
            teste[x] = sc.nextInt();
        }
        //Por fim, rodamos o array todo prcurando valores negativos
        for (int i = 0; i<teste.length; i++){
            if(teste[i]<0){
                contador++;
            }
        }

        System.out.println("O array tem "+contador+" elementos negativos");

    }

    //Este método recebe um array e imprime todos os seus valores
    public static void imprimir(int[]vetor){
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }

    public static void valoresSeq2() {
        /*
         Crie um método de nome valoresSeq2 para ser preenchido dinamicamente com um vetor de 15 números inteiros positivos
         formado pela sequencia lógica dos números que seguem da seguinte forma: {3, 8, 18, 38, 78, ... } -
         O ultimo número deverá ser: 81918
         */
        //Criamos um array com tamanho 15
        int[] vetores = new int[15];
        //criamso um multiplicador e o valor que será adicionado a cada elemento
        int multiplicador = 5;
        int valor = 3;

        //o for roda o tamanho do array
        for(int x = 0; x<vetores.length; x++){
            //o elemento recebe o valor
            vetores[x] = valor;
            //e este é adicionado do seu multiplicador
            valor = vetores[x]+multiplicador;
            multiplicador = multiplicador*2;
        }

        imprimir(vetores);
    }

    public static void exerceicioLoginSenha() {
        /*
        a) criar e retornar um array unidimensional com 03 logins definidos pela atribuição direta
        b) criar e retornar um array unidimensional com 03 senhas formadas por valores inteiros, positivos definidos pela atribuição direta.
        c) em um método específico, o usuário deverá informar um login e senha e esses devem ser identificados se existem correlacionados pelos índices dos arrays unidimensionais recebidos como parâmetro (0 -> 0, 1 -> 1, 2 -> 2). Se o login informado existir no vetor recebido e senha informada também existir no vetor recebido com os mesmos índices, então o retorno do método será "login válido", caso contrário será "login inválido".
        d) elaborar todos os métodos de impressão necessários
         */
        //criamos 2 arrays, um de strings e outro de inteiros
        String [] login = {"dmitry","login","asdrubal"};
        int [] senha = {1234, 123456, 666};

        //aqui chamamos o método para ver se login e senha informados são verdadeiros ou falsos
        boolean logou = identificarUsusario(login, senha);

        if (logou == true) {
            System.out.println("Login válido");
        } else {
            System.out.println("Login inválido");
        }
    }

    public static boolean identificarUsusario(String[] user, int[] senha) {

        Scanner sc = new Scanner(System.in);
        boolean logou = false;
        System.out.println("Qual seu login?");
        String usuario = sc.nextLine();
        System.out.println("Qual a sua senha");
        int password = sc.nextInt();
        //o for vai rodar o tamanho do array e ver se o logine senha conferem
        for (int x = 0; x < user.length; x++) {
            //se tanto login quanto senha forem verdadeiros, ele muda o valor de logou
            if(user[x].equals(usuario) && senha[x] == password) {
                logou = true;
            }
        }

        //por fim o método retorna um valor boleano
        return logou;



    }
}

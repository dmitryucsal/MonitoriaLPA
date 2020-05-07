package aula0507;
/*Elabore uma sequencia de valores inteiros inferiores a 2500, iniciado por 459,
composto por valores (dividendos) que quando divididos por 150 == 9. Calcule a soma
de todos os valores e some com o resultado obtido da media aritmetica do 5 com o 13
elemento.

 */

public class provaTatiane {

    public static void main(String[] args) {
        //Declaração de variáveis
        int soma = 0;
        int seq = 459;
        double media = 0;
        double quinto = 0;
        double pt = 0;
        int contador = 0;

        //Enquanto (while) a sequência for menor que 2500, o programa vai rodar o que está dentro das chaves
        while(seq <= 2500) {
            //se (if) o número atual da sequência, dividido por 150 for igual a 9, o programa vai executar o que estiver
            // dentro das chaves
            if((seq/150 == 9)){
                //adiciona um ao contador
                contador++;
                //adiciona o número atual da sequência à soma
                soma += seq;
                //se (if) o contador for igual a cinco...
                if(contador == 5) {
                    //este número da sequência será o quinto
                    quinto = seq;
                    //se (if) o contador for igual a 13...
                } else if (contador == 13) {
                    //o pt será o 13º número da sequência
                    pt = seq;
                }
            }
            //adiciona mais um à sequência
            seq++;
        }

        //calculamos a média aritimética do quinto e do décimo terceiro elemento
        media = (quinto+pt)/2;

        System.out.println("A soma de tudo é "+ soma);
        System.out.println("A soma de tudo com a média lá é "+media);



    }


    }




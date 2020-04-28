package aula0428;

public class Questao02 {
    /*
    Crie uma progressão geométrica formada por 20 valores inteiros positivos iniciada com o valor 10 e
    razão 3 e obtenha amédia ponderada entre o nono e o décimo segundo elemento, considerando os pesos
    7 e 3 respectivamente
     */
    public static void main(String[] args) {
        //A variável foi declarada como long porque vai chegar um momento em que ele vai passar do
        //limite para um int
        long valor = 10L;
        int razao = 3;
        //aqui armazenaremos o nono e o décimo segundo valor
        long nono = 0;
        long dozemo = 0;
        long media;

        for(int x = 0 ; x < 20; x++) {

            valor = valor*razao;
            //se você usar o comando abaixo, poderá ver os valores desta progressão
            //System.out.print(valor+", ");
            //se (if) este for o nono elemento
            if(x == 8){
                System.out.println("O nono é "+ valor);
                //armazenaremos o seu valor na variável nono
                nono=valor;
            }
            //se (if) este dor o décimo segundo elemento
            if(x == 11){
                System.out.println("O décimo segundo é "+valor);
                //armazenaremos o seu valor na variavel dozemo
                dozemo = valor;
            }
        }
        //aqui faremos o cálculo da média ponderada
        media = ((nono*7)+(dozemo*3))/(7+3);
        System.out.println("A média aritimética foi "+media);
    }
}

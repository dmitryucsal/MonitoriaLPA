package aula0430;

public class QuestaoSara {
    //Aqui precisamos calcular uma progressão geométrica e calcular a média ponderada do oitavo e do décimo sexto valor
    //sendo os respectivos pesos, 2 e 8
    public static void main(String[] args) {
        //Aqui reunimos todas as variáveis que serão usadas
        int contador = 0;
        int resultado = 4;
        double valor1= 0.0;
        double valor2 = 0.0;
        double media = 0.0;

        //Agora, enquanto o contador não chegar em 17, o bolo de código entre as chaves será rodado
        while (contador < 17) {
            //progressão geométrica de razão 2
            resultado = resultado*2;
            //Adiciona a uma linha demosntrando toda a sequência
            System.out.print(resultado+", ");
            //Adiciona ao contador, para que o while saiba quando parar
            contador++;
            //Se (if) o contador estiver em 8 (oitava posição)...
            if(contador == 8) {
                valor1 = resultado;
                //Senão se (else if) estiver em 16...
            } else if (contador == 16) {
                valor2 = resultado;
            }
        }
        //Aqui apenas confirmamos quem são o oitavo e décimo sexto número
        System.out.println("\no valor 8 é "+valor1+" e o 16o é "+valor2);
        //Agora é só calcular a média ponderada
        media = ((valor1*2)+(valor2*8))/10;
        System.out.println("A média ponderada é "+media);
    }
}

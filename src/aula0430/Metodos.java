package aula0430;

public class Metodos {
    //Nesta classe criamos um método chamado media, que calcula a media aritimética de dois números
    public static void main(String[] args) {
        //Aqui chamamos o método de dentro do system println e já mandamos os dois valores dentro
        System.out.println("A média é "+media(2.5,5.6));

        //Agora vamos definir dois valores e depois chamar o método média
        double valor1 = 4.6;
        double valor2 = 8.6;
        System.out.println("A média é "+media(valor1,valor2));
    }

    //Este método recebe 2 números (valor1 e valor2) e calcula a média aritimética
    public static double media (double valor1, double valor2){
        double resultado = 0.0;
        resultado = ((valor1+valor2)/2);
    //como o método diz que vai retornar um double, é obrigatório colocar a linha abaixo
        return resultado;

    }



}

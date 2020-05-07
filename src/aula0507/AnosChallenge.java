package aula0507;
//ESTE EXERCÍCIO SERÁ COMPLETADO NA TERÇA-FEIRA
//mas se quiser tentar terminar, agradeço. Qualquer coisa é só mandar a dúvida pelo whatsapp ou classroom
public class AnosChallenge {
    public static void main(String[] args) {

        int soma = anosCompletos(1999,2019);
        int mes = 0;


        System.out.println(soma);

    }

    public static int anosCompletos(int anoInicio, int anoFim) {
        int soma = 0;
        int ano = anoInicio;

        while (ano<anoFim){
            if((ano% 4 == 0 && ano %100 != 0) || (ano % 400 ==0 )) {

                soma+=366;
            } else {
                soma+=365;
            }
            ano++;

        }
        return soma;
    }
}

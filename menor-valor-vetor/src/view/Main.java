package view;

import controller.MenorValorController;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {3, -7, 2, 5, -8, 0, 4};
        int tamanhoVetor = vetor.length;
        int ultimaPosicao = vetor[vetor.length-1];

        MenorValorController mv = new MenorValorController();

        int resultado = mv.encontraMenorValor(vetor, tamanhoVetor, ultimaPosicao);

        System.out.println(resultado);
    }
}
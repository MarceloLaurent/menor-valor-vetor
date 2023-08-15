//Exercicio2
package controller;

public class MenorValorController {

    public MenorValorController() {
        super();
    }

    public int encontraMenorValor(int []vetor, int tamanhoVetor, int ultimaPosicao){
        if(tamanhoVetor == 1){
            return ultimaPosicao; //Condição de parada: ter um vetor com tamanho 1
        }else {
            int menorValor = Math.min(ultimaPosicao, vetor[tamanhoVetor-2]); //Define o menor valor entre as duas últimas posições
            tamanhoVetor--;
            ultimaPosicao = menorValor;
            return Math.min(menorValor, encontraMenorValor(vetor, tamanhoVetor, ultimaPosicao));
        } //Chamada da função: Compara o menor valor já estabelecido com o encontrado pela chamada do método
          //com o tamanho resuzido em 1 e o menor valor definido como última posição
    }
}

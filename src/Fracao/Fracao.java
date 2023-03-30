/*
2 Exercício
Crie a classe Fracao em java, que representa uma fração matemática. Esta classe deve ser capaz de
armazenar o numerador e o denominador da fração. Ela ainda deve ter métodos que recebem
uma fração como parâmetro, multiplicam ambas as frações, e retornam uma nova fração
como resultado.

Crie um programa simples que instancia duas frações, define seus valores, calcula o valor da
multiplicação entre elas e mostra o resultado.

Dica: a multiplicação de 2 frações é feita através da multiplicação dos numeradores e dos
denominadores das frações, e o valor resultante é uma terceira fração.
* */

/*Explicação dos métodos:

Fracao(int numerador, int denominador):
construtor que recebe o numerador e o denominador da fração e os armazena nos atributos da classe.
getNumerador(): método que retorna o numerador da fração.
getDenominador(): método que retorna o denominador da fração.
setNumerador(int numerador): método que recebe um novo valor para
o numerador da fração e atualiza o atributo correspondente.
setDenominador(int denominador): método que recebe um novo valor
 para o denominador da fração e atualiza o atributo correspondente.
*/

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }
}

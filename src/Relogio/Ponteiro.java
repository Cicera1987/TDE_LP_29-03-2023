/*
Exercicio 01

Crie as classes Relogio e Ponteiro e escreva um método main() para treinar a chamada aos
métodos e atributos.

Atributos da classe Ponteiro:
• posicao(int): indica em qual posição está o ponteiro(1, 2, 3, 4, etc.)
Dica 1: Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante. Se um ponteiro
dos minutos está na posição 3, significa que o método lerMinuto() deve retornar 15, que é o
minuto correspondente a esta posição. O mesmo vale para o ponteiro dos segundos.


* */
public class Ponteiro {
    private int posicao;

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return this.posicao;
    }
}

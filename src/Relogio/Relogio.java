/*
Exercicio 01

Crie as classes Relogio e Ponteiro e escreva um método main() para treinar a chamada aos
métodos e atributos.

Atributos da classe Relogio:
• ponteiroHora (tipo Ponteiro)
• ponteiroMinuto (tipo Ponteiro)
• ponteiroSegundo (tipo Ponteiro)

Métodos da classe Relogio:
• acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente
cada ponteiro do relógio. Os parâmetros passados são hora, minuto e segundo.
• lerHora(): retorna a hora atual do relógio.
• lerMinuto(): retorna o minuto atual do relógio.
• lerSegundo(): retorna o segundo atual do relógio.

Atributos da classe Ponteiro:
• posicao(int): indica em qual posição está o ponteiro(1, 2, 3, 4, etc.)
Dica 1: Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante. Se um ponteiro
dos minutos está na posição 3, significa que o método lerMinuto() deve retornar 15, que é o
minuto correspondente a esta posição. O mesmo vale para o ponteiro dos segundos.

* */

public class Relogio {
    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio() {
        this.ponteiroHora = new Ponteiro();
        this.ponteiroMinuto = new Ponteiro();
        this.ponteiroSegundo = new Ponteiro();
    }

    public void acertarRelogio(int hora, int minuto, int segundo) {
        this.ponteiroHora.setPosicao(hora);
        this.ponteiroMinuto.setPosicao(minuto);
        this.ponteiroSegundo.setPosicao(segundo);
    }

    public int lerHora() {
        return this.ponteiroHora.getPosicao();
    }

    public int lerMinuto() {
        return this.ponteiroMinuto.getPosicao() * 5; // cada posição representa 5 minutos
    }

    public int lerSegundo() {
        return this.ponteiroSegundo.getPosicao() * 5; // cada posição representa 5 segundos
    }
}





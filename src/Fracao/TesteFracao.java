
/*
Explicação do programa:

Primeiro, instanciamos duas frações (f1 e f2) com os valores desejados (3/5 e 2/7, respectivamente).
Em seguida, chamamos o método multiplicar da fração f1, passando como parâmetro a fração f2.
O resultado é armazenado na variável resultado.
Por fim, imprimimos na tela uma mensagem contendo as frações multiplicadas e o resultado da operação.

* */

public class TesteFracao {
    public static void main(String[] args) {
        Fracao f1 = new Fracao(3, 5);
        Fracao f2 = new Fracao(2, 7);

        Fracao resultado = f1.multiplicar(f2);

        System.out.println(f1.getNumerador() + "/" + f1.getDenominador() + " * " + f2.getNumerador() + "/" + f2.getDenominador() + " = " + resultado.getNumerador() + "/" + resultado.getDenominador());
    }
}

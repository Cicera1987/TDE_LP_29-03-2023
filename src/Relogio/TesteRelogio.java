public class TesteRelogio {
        public static void main(String[] args) {
            Relogio relogio = new Relogio();

            // Acerta o relógio para 9h:30m:45s
            relogio.acertarRelogio(9, 6, 9);

            // Imprime a hora atual do relógio
            System.out.println("Hora: " + relogio.lerHora());

            // Imprime o minuto atual do relógio
            System.out.println("Minuto: " + relogio.lerMinuto());

            // Imprime o segundo atual do relógio
            System.out.println("Segundo: " + relogio.lerSegundo());
        }
}

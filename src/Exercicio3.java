public class Exercicio3 {
    public static void main(String[] args) {
        Boletim escola = new Boletim();
        escola.solicitarValores();
        escola.verificarMateria();

        String aprovar = escola.solicitarAprovacao();
        System.out.println(aprovar);
    }
}
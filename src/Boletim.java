import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
public class Boletim {
    Scanner sc = new Scanner(System.in);
    String nome;
    String materias[] = {"matematica","ingles","historia","educacaofisica","fisica","quimica",
                         "artes","sociologia", "filosofia","portugues","geografia","biologia"};
    String materia;
    double nota1;
    double nota2;
    double nota3;
    boolean materia_valida = true;
    public void solicitarValores() {
        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Digite o nome da materia em que você deseja saber a média: ");
        materia = sc.next();
        System.out.println("Digite sua primeira nota nesta matéria: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota nesta matéria: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota nesta matéria: ");
        nota3 = sc.nextDouble();
    }
    public void verificarMateria() {
        materia = materia.toLowerCase();
        materia = Normalizer.normalize(materia, Normalizer.Form.NFD);
        materia = materia.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        if(Arrays.asList(materias).contains(materia)) {
            System.out.printf("A matéria escolhida foi: %s \n", materia);
        } else {
            System.out.printf("A matéria %s não existe nos nossos sistemas, ou há um erro de digitação. \n", materia);
            materia_valida = false;
        }
    }
    public String solicitarAprovacao() {
        if (!materia_valida){
            return "Não é possível dizer se você está aprovado na matéria, pois ela não existe.";
        } else {
            double media_aritmetica = (nota1 + nota2 + nota3) / 3;
            double media_aritmetica_real = Math.round(media_aritmetica*100.0)/100.0;
            if (media_aritmetica_real >= 7.0) {
                return "APROVADO.";
            } else if (media_aritmetica_real <= 6.9 && media_aritmetica_real >= 6.0){
                return "EM RECUPERAÇÃO.";
            } else {
                return "REPROVADO.";
            }
        }
    }
}

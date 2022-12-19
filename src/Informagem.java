import java.util.Scanner;
public class Informagem {
    Scanner sc = new Scanner(System.in);
    String nomes[] = new String[5];
    int idades[] = new int[5];
    public void informarNomes() {
        for(int i = 0; i < 5; i++) {
            System.out.print("Insira um nome: ");
            nomes[i] = sc.next();
        }
    }
    public void informarIdades() {
        for(int j = 0; j < 5; j++) {
            System.out.print("Insira a idade deles, sucessivamente: ");
            idades[j] = sc.nextInt();
        }
    }
    public void informarFatos() {
        int menor = idades[0];
        int maior = idades[0];
        String maior_nome = nomes[0];
        String menor_nome = nomes[0];
        for(int k = 0; k < 5; k++) {
            if(idades[k] > maior) {
                maior = idades[k];
                maior_nome = nomes[k];
            }
            else if (idades[k] < menor) {
                menor = idades[k];
                menor_nome = nomes[k];
            }
        }
        int soma = 0;
        int quantidades = 0;
        for (int l : idades) {
            soma += l;
            quantidades++;
        }
        double media = soma / quantidades;
        System.out.println("Menor idade: " + menor + ", idade do " + menor_nome);
        System.out.println("Maior idade: " + maior + ", idade do " + maior_nome);
        System.out.println("A média das idades é: " + media);
    }
}

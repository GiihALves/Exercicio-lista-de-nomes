import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class NomesLista {
    public static void main(String[] args) {
        List<String> ListaNomes = new ArrayList<>();
        ListaNomes.add("Gustavo");
        ListaNomes.add("Renan");
        ListaNomes.add("Fernando");
        ListaNomes.add("Luís Henrique");

        for (String nome : ListaNomes){
            System.out.println(nome);
        }
        String nome;
        System.out.println("Digite o nome que deseja remover: ");

        Scanner ler = new Scanner(System.in);

        nome = ler.nextLine();

        ListaNomes.remove(nome);

        System.out.println(ListaNomes);




    }

}

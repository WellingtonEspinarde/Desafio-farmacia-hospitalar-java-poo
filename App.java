import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int opcao;
    ArrayList<Medicamentos> lista = new ArrayList<>();

        do {
            System.out.println("Digite 1 para registrar um medicamento injetavel");
            System.out.println("Digite 2 para registrar um medicamento de comprimido");
            System.out.println("Digite 3 para registrar um medicamento liquido");
            System.out.println("Digite 0 para Sair");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                Injetaveis injetavel = new Injetaveis();

                    System.out.println(injetavel.admistracao());

                    System.out.println("Digite o nome:");
                    injetavel.setNome(scan.nextLine());
                    System.out.println("Digite o principio ativo");
                    injetavel.setPrincipioAtivo(scan.nextLine());
                    System.out.println("Digite o modo de uso:");
                    injetavel.setModoUsar(scan.nextLine());
                    System.out.println("Digite a dosagem");
                    injetavel.setMg(scan.nextInt());
                    scan.nextLine();
                    lista.add(injetavel);

                    System.out.println("Medicamento cadastrado com sucesso!");
                    System.out.println(injetavel.toString());
                    break;

                    case 2:
                    Comprimidos comprimido = new Comprimidos();

                    System.out.println(comprimido.admistracao());

                    System.out.println("Digite o nome:");
                    comprimido.setNome(scan.nextLine());
                    System.out.println("Digite o principio ativo");
                    comprimido.setPrincipioAtivo(scan.nextLine());
                    System.out.println("Digite o modo de uso:");
                    comprimido.setModoUsar(scan.nextLine());
                    System.out.println("Digite a dosagem");
                    comprimido.setMg(scan.nextInt());
                    scan.nextLine();
                    lista.add(comprimido);

                    System.out.println("Medicamento cadastrado com sucesso!");
                    System.out.println(comprimido.toString());
                    break;

                    case 3:
                    Liquidos liquido = new Liquidos();

                    System.out.println(liquido.admistracao());

                    System.out.println("Digite o nome:");
                    liquido.setNome(scan.nextLine());
                    System.out.println("Digite o principio ativo");
                    liquido.setPrincipioAtivo(scan.nextLine());
                    System.out.println("Digite o modo de uso:");
                    liquido.setModoUsar(scan.nextLine());
                    System.out.println("Digite a dosagem");
                    liquido.setMg(scan.nextInt());
                    scan.nextLine();
                    lista.add(liquido);

                    System.out.println("Medicamento cadastrado com sucesso!");
                    System.out.println(liquido.toString());
                    break;

                    case 0:
                    System.out.println("Saindo...");

                default:
                    break;
            }
            
            
        } while (opcao != 0);

        scan.close();
    }
}

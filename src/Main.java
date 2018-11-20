import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        agenda.mostraMenu();

        String opcao = sc.next();

        try{
            while (!opcao.equals("S")){

                if (opcao.equals("C")) {
                    int posicao = sc.nextInt();
                    sc.nextLine();
                    String nome = sc.nextLine();
                    String sobrenome = sc.nextLine();
                    String telefone = sc.nextLine();
                    agenda.cadastraContato(posicao, new Contato(telefone, nome, sobrenome));
                    System.out.println(" ");
                    agenda.mostraMenu();
                    opcao = sc.next();
                }

                else if(opcao.equals("E")){
                    int posicao = sc.nextInt();
                    System.out.println(agenda.exibeContato(posicao));
                    agenda.mostraMenu();
                    opcao = sc.next();
                }

                else if(opcao.equals("L")){
                    System.out.println(agenda.listaContatos());
                    agenda.mostraMenu();
                    opcao = sc.next();
                    System.out.println(" ");
                }

                else if(opcao.equals("S")){
                    break;
                }

                else{
                    System.out.println("OPÇÃO INVÁLIDA!");
                    agenda.mostraMenu();
                    opcao = sc.next();
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Wrong answer");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

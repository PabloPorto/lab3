import java.util.Arrays;

public class Agenda {

    private Contato[] contatos = new Contato[100];

    public void cadastraContato(int posicao,Contato contato) {
        if (posicao < 1 || posicao > 100){
            throw new RuntimeException("POSIÇÃO INVÁLIDA");
        }

        contatos[posicao-1] = contato;
        System.out.println("CADASTRO REALIZADO!");
    }

    public String exibeContato(int posicao) {
        if (posicao>100 || posicao<1) {
            throw new RuntimeException("\nPOSIÇÃO INVÁLIDA!\n");
        }

        if(contatos[posicao-1] == null) {
            throw new NullPointerException("\nPOSIÇÃO INVÁLIDA!\n");
        }

        return contatos[posicao-1].toString();

    }

    public String listaContatos(){
        String message = "";
        for (int i=0; i<contatos.length;i++) {
            if(contatos[i] == null){
                continue;
            }
            message += (i+1) + " - " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + "\n";
        }
        return message;
    }

    public void mostraMenu(){
        System.out.println("(C)adastrar Contato");
        System.out.println("(L)istar Contatos");
        System.out.println("(E)xibir Contato");
        System.out.println("(S)air");
        System.out.println(" ");
        System.out.print("Opção> ");

    }
}

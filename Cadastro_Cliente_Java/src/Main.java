import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String resposta;
        Scanner scanner = new Scanner(System.in);
        do {
            Cliente cliente = new Cliente();
            System.out.println("Digite o nome do cliente.");
            cliente.nome = scanner.nextLine();
            do {
                System.out.println("Digite a idade do cliente.");
                cliente.idade = scanner.nextInt();
                if (cliente.idade <= 0){
                    System.out.println("Idade Invalida. ");
                }
            }
            while((cliente.idade <= 0));
                scanner.nextLine();
                System.out.println("Digite o CPF do cliente.");
                cliente.cpf = scanner.nextLine();
                System.out.println("Digite o telefone do cliente.");
                cliente.telefone = scanner.nextLine();
                clientes.add(cliente);
                System.out.println("Gostaria de cadastrar outro cliente? s/n");
                resposta = scanner.nextLine();
        }
       while(resposta.equalsIgnoreCase("s"));
    for (int i = 0; i < clientes.size(); i++){
        System.out.println("CLIENTE " + (i + 1));
        System.out.println("Nome " + clientes.get(i).nome);
        System.out.println("Idade " + clientes.get(i).idade);
        System.out.println("CPF " + clientes.get(i).cpf);
        System.out.println("Telefone " + clientes.get(i).telefone);
        System.out.println("");
        }
        System.out.println("Total de Clientes Cadastrados: " + clientes.size());
    }
}

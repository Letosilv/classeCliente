import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciarBanco {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        try {
            // Coleta de dados do cliente
            System.out.println("Informe seu nome:");
            cliente.setNome(scanner.nextLine());

            System.out.println("Informe seu sobrenome:");
            cliente.setSobrenome(scanner.nextLine());

            System.out.println("Informe seu CPF:");
            cliente.setCpf(scanner.nextLine());

            System.out.println("Informe seu saldo inicial:");
            cliente.setSaldo(Double.parseDouble(scanner.nextLine()));

            Funcoes funcoes = new Funcoes();
            boolean continuar = true;

            while (continuar) {
                System.out.println("\n####################################");
                System.out.println("O que deseja?");
                System.out.println("####################################");
                System.out.println("(1) Consultar saldo");
                System.out.println("(2) Fazer depósito");
                System.out.println("(3) Fazer saque");
                System.out.println("(4) Finalizar sessão");
                System.out.println("####################################\n");

                System.out.print("Selecione o número da opção desejada: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1 -> funcoes.consutarSaldo(cliente);
                    case 2 -> {
                        System.out.print("Informe o valor a ser depositado: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        funcoes.depositar(cliente, valorDeposito);
                    }
                    case 3 -> {
                        System.out.print("Informe o valor a ser sacado: R$ ");
                        double valorSaque = scanner.nextDouble();
                        funcoes.sacar(cliente, valorSaque);
                    }
                    case 4 -> {
                        continuar = false;
                        System.out.println("Encerrando a aplicação!");
                    }
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }

                try {
                    if (continuar) {
                        System.out.println("\nPressione ENTER para voltar ao menu.");
                        System.in.read(); // Aguarda pressionar Enter
                    }
                } catch (IOException ex) {
                    Logger.getLogger(GerenciarBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } finally {
            scanner.close();
        }
    }
}

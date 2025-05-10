
public class Funcoes {

    public void consutarSaldo(Cliente cliente) {
        System.out.println("");
        System.out.println("Função Consultar Saldo");
        System.out.println("Seu saldo é: " + cliente.getSaldo());
    }// fim do método consultar saldo

    public void depositar(Cliente cliente, double valor) {

        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("");
        System.out.println("Função Depósitar");
        System.out.println("Seu novo saldo é de: " +
                cliente.getSaldo());

    }// fim do método depositar

    public void sacar(Cliente cliente, double valor) {

        cliente.setSaldo((cliente.getSaldo() - valor));
        System.out.println("");
        System.out.println("Função Sacar");
        System.out.println("Seu novo saldo é de: " +
                cliente.getSaldo());

    }// fim do metodo sacar

}
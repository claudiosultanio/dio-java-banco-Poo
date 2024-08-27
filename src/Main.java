public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco();

        bancoInicial.setNome("Dio Bank");

        Cliente claudio = new Cliente("Claudio", bancoInicial);
        claudio.setNome("Claudio Sultanio");

        Conta ccorrente = new ContaCorrente(claudio);

        ccorrente.depositar(1000);

        Cliente Sultanio = new Cliente("Sultanio", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(Sultanio);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(450, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();


    }

}

    public abstract class Conta implements Iconta {


        private static final int AgenciaPadrao = 0001;
        private static int Sequencial = 0001;

        private int agencia;
        private int numero;
        private double saldo;

        private Cliente cliente;


        public Conta(Cliente cliente) {
            this.agencia = Conta.AgenciaPadrao;
            this.numero = Sequencial++;
            this.cliente = cliente;
        }

        public Conta() {

        }

        public static int getSequencial() {
            return Sequencial;
        }

        public int getAgencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public Cliente getCliente() {
            return cliente;
        }


        @Override
        public String toString() {
            return "Conta{" +
                    "agencia=" + agencia +
                    ", numero=" + numero +
                    ", saldo=" + saldo +
                    ", cliente=" + cliente +
                    '}';
        }


        protected void imprimirInfosComuns() {
            System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
            System.out.printf(String.format("Agência: %d%n", this.agencia));
            System.out.printf(String.format("Número: %d%n", this.numero));
            System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
        }

        @Override
        public void sacar(double valor) {
            saldo = -valor;

        }

        @Override
        public void depositar(double valor) {
            saldo = +valor;

        }

        @Override
        public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);

        }

        @Override
        public void imprimirExtrato() {

        }

    }


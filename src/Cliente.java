public class Cliente {
    public Banco banco;

    public String nome;
    public String cpf;
    public String endereco;
    public String email;
    public String telefone;

    //construtor da lista de clientes do Banco
    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    //construtor da classe Cliente
    public Cliente(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }


    @Override
    public String toString() {
        return "Cliente {" +
                "banco=" + banco.nome + ", nome='" + this.getNome() +
                '}';
    }
}

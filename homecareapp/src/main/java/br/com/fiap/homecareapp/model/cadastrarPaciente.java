package br.com.fiap.homecareapp.model;

public class cadastrarPaciente {
    private String nome;
    private String cep;
    private int numero;
    private String complemento;
    private String logradouro;
    private String bairro;

    public cadastrarPaciente(String nome, String cep, int numero, String complemento, String logradouro,
    String bairro) {
        this.nome = nome;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "cadastrarPaciente [nome=" + nome + ", cep=" + cep + ", numero=" + numero + ", complemento="
                + complemento + ", logradouro=" + logradouro + ", bairro=" + bairro + "]";
    }

    

    
}

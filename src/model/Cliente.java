
package model;

/**
 *
 * @author Luis Gustavo
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private double renda;

    public Cliente(String cpf, String nome, String endereco, double renda) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}

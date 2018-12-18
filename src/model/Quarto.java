
package model;

import java.util.Calendar;

/**
 *
 * @author Luis Gustavo
 */
public class Quarto {
    private int numero;
    private String tipo;
    private double valorDiaria;
    private Cliente cliente;
    private Calendar dataLocacao;
    private int diasLocados;

    public Quarto() {
    }

    public Quarto(int numero, String tipo, double valorDiaria, Cliente cliente, Calendar dataLocacao, int diasLocados) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.diasLocados = diasLocados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public int getDiasLocados() {
        return diasLocados;
    }

    public void setDiasLocados(int diasLocados) {
        this.diasLocados = diasLocados;
    }
    
    public Object saida(){
        return new Object[]{
            numero,
            tipo,
            valorDiaria,
            cliente.getCpf(),
            cliente.getNome(),
            dataLocacao,
            diasLocados
        };        
    }
    
    public double calculaValor(){
        return diasLocados * valorDiaria;
    }
}

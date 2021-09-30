package io.github.emvnuel.banco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void sacar(String nome, BigDecimal valor) {
        Conta conta = pesquisarCliente(nome);
        conta.sacar(valor);
    }

    public void sacar(Integer numeroConta, BigDecimal valor) {
        Conta conta = pesquisarCliente(numeroConta);
        conta.sacar(valor);
    }

    public void depositar(String nome, BigDecimal valor) {
        Conta conta = pesquisarCliente(nome);
        conta.depositar(valor);
    }

    public void depositar(Integer numeroConta, BigDecimal valor) {
        Conta conta = pesquisarCliente(numeroConta);
        conta.depositar(valor);
    }

    public Conta pesquisarCliente(Integer conta) {
        return clientes.stream()
                .filter(cliente -> cliente.getConta().getNumero().equals(conta))
                .findFirst()
                .map(Cliente::getConta).orElseThrow(() -> new IllegalArgumentException("Cliente não existe"));
    }

    public Conta pesquisarCliente(String nome) {
        return clientes.stream()
                .filter(cliente -> cliente.getNome().equals(nome))
                .findFirst()
                .map(Cliente::getConta).orElseThrow(() -> new IllegalArgumentException("Cliente não existe"));
    }

    public void aplicarAtualizacaoMensal() {
        this.clientes.stream().map(Cliente::getConta).forEach(Conta::applicatAtualizacaoMensal);
    }

}

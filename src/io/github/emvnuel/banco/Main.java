package io.github.emvnuel.banco;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.cadastar(new Cliente("Emanuel", new ContaCorrente(1234, new BigDecimal("3000.00"))));
        banco.cadastar(new Cliente("Fulaninho", new ContaPoupanca(4321, new BigDecimal("300000.00"))));

        banco.sacar("Emanuel", new BigDecimal("2000.00"));
        banco.depositar(1234, new BigDecimal("500.00"));

        banco.sacar("Fulaninho", new BigDecimal("200000.00"));
        banco.sacar(4321, new BigDecimal("50000.0"));

        banco.aplicarAtualizacaoMensal();

        System.out.println("SALDO EMANUEL: "+ banco.pesquisarCliente("Emanuel").getSaldo());
        System.out.println("SALDO FULANINHO: "+ banco.pesquisarCliente("Fulaninho").getSaldo());


    }
}

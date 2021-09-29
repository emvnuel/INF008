package io.github.emvnuel.banco;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.cadastar(new Cliente("Emanuel", new ContaCorrente(1234, BigDecimal.valueOf(3000.0))));
        banco.cadastar(new Cliente("Fulaninho", new ContaPoupanca(4321, BigDecimal.valueOf(300000.0))));

        banco.sacar("Emanuel", BigDecimal.valueOf(2000.0));
        banco.depositar(1234, BigDecimal.valueOf(500.0));

        banco.sacar("Fulaninho", BigDecimal.valueOf(200000.0));
        banco.sacar(4321, BigDecimal.valueOf(50000.0));


        banco.aplicarAtualizacaoMensal();

        System.out.println("SALDO EMANUEL: "+ banco.pesquisarCliente("Emanuel").getSaldo());
        System.out.println("SALDO FULANINHO: "+ banco.pesquisarCliente("Fulaninho").getSaldo());

        banco.aplicarAtualizacaoMensal();

    }
}

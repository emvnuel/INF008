package io.github.emvnuel.banco;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Integer numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public BigDecimal getValorAposAtualizacaoMensal() {
        return this.getSaldo().add(this.getSaldo().multiply(new BigDecimal("0.01")));
    }

}

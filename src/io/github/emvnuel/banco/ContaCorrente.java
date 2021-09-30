package io.github.emvnuel.banco;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(Integer numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public BigDecimal getValorAposAtualizacaoMensal() {
        return this.getSaldo().subtract(BigDecimal.ONE);
    }

}

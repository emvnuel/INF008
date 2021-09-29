package io.github.emvnuel.banco;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(Integer numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public void atualizacaoMensal() {
        this.setSaldo(this.getSaldo().subtract(BigDecimal.ONE));
    }

}

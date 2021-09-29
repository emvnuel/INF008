package io.github.emvnuel.banco;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Conta {

    private Integer numero;
    private BigDecimal saldo;

    public Conta(Integer numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    protected void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Não é possível sacar um valor que você não possui animal");
        this.saldo = this.saldo.subtract(valor);
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo.setScale(2, RoundingMode.HALF_EVEN);
    }

    public abstract void atualizacaoMensal();
}

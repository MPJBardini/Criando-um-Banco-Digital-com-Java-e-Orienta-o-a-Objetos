package br.com.bancodigital;

public class ContaPoupanca extends Conta implements ContaPoupanca {

    // Atributos específicos da conta poupança

    @Override
    public void depositar(double valor) {
        // Implementação do depósito para conta poupança
    }

    @Override
    public void sacar(double valor) {
        // Implementação do saque para conta poupança
    }

    @Override
    public void transferir(Conta destino, double valor) {
        // Implementação da transferência para conta poupança
    }

    @Override
    public void calcularRendimentoMensal() {
        // Implementação do cálculo do rendimento mensal para conta poupança
    }
}

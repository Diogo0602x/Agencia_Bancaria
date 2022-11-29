package Program;

import Utilities.Utils;

public class Conta {

    private static int contadorDeContas = 1;

    public Conta(Pessoa cliente) {
        this.numeroConta = contadorDeContas;
        this.cliente = cliente;
        contadorDeContas += 1;
    }

    private int numeroConta;
    private Pessoa cliente;
    private Double saldo = 0.0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString() {

        return "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.cliente.getNome() +
                "\nCPF: " + this.cliente.getCPF() +
                "\nEmail: " + this.cliente.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo())+
                "\n";
    }

    public void depositar(Double valor) {
        if(valor > 0 ) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public void sacar(Double valor) {
        if(valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

    public void transferir(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && valor <= this.getSaldo()) {
            setSaldo(getSaldo() - valor );
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }
    }

}

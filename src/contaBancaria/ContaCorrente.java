package contaBancaria;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
    Random numeroAgencia = new Random();

    String nome;
    final int AGENCIA= numeroAgencia.nextInt(9999)+1;
    double saldo = 2000.0;

     public void escolherOperacao(){
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
        String stringOpcao = 
        "[1] Depositar Dinheiro\n" +
        "[2] Sacar Dinheiro\n" +
        "[3] Consultar Saldo\n" +
        "[4] Dados da Conta\n" +
        "[0] Sair";
        System.out.println(stringOpcao);
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=");
    }
   
    public void cadastrarConta(){
        System.out.println("Cadastrando conta");

        System.out.println("Digite seu Nome: ");
        this.nome = terminal.next().toUpperCase();

        System.out.println("Olá, " + this.nome + ". Conta cadastrada com sucesso!");
        dadosConta();
    }

    public void depositar(){
        System.out.println("Qual o valor do deposito? ");
        double valorDeposito = terminal.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Deposito no valor de R$ " + valorDeposito + " realizado com sucesso!");
        consultarSaldo();
    }

    public void sacar(){
        System.out.println("Quanto deseja sacar? ");
        double valorSaque = terminal.nextDouble();
        this.saldo = this.saldo - valorSaque;
        System.out.println("Saque no valor de R$ " + valorSaque + " realizado com sucesso");
        consultarSaldo();
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    public void dadosConta(){
        System.out.println("Consultando Dados da Conta");
        System.out.println("NOME: " + this.nome);
        System.out.println("AGÊNCIA: " + this.AGENCIA);
        System.out.println("SALDO: " + this.saldo);
    }

   
}

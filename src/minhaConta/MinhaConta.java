package minhaConta;

import java.util.Locale;
import java.util.Scanner;

import contaBancaria.ContaCorrente;

public class MinhaConta {
    
    public static void main(String[] args) {
        
        ContaCorrente minhaConta = new ContaCorrente();
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        minhaConta.cadastrarConta();
        
        while(true){
       
            minhaConta.escolherOperacao();

            System.out.println("Escolha o número da Operação: ");
            int opcao = terminal.nextInt();
        
            if ( opcao == 1){
                minhaConta.depositar();

            } else if ( opcao == 2){
                minhaConta.sacar();

            } else if ( opcao == 3){
                minhaConta.consultarSaldo();

            } else if ( opcao == 4){
                minhaConta.dadosConta();

            } else if (opcao == 0){
                System.out.println("Operação finalizada com sucesso!");
                break;
                
            } else {
                System.out.println("Opção inválida.");              
            }
        }

    } 
}


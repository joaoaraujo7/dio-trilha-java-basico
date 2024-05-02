package application;
import java.util.Scanner;

import entities.Conta;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numeroConta = sc.nextInt();
        
        System.out.println("Por favor, digite o nome da agência: ");
        String nomeAgencia = sc.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(numeroConta, nomeAgencia, nomeCliente, saldo);

        System.out.println(conta.exibirBoasVindas());

        sc.close();
    }
}

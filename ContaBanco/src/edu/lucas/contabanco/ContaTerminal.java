package edu.lucas.contabanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número da Agência Bancária: ");
		
		String agencia = scan.nextLine();
		
		System.out.println("Digite o número da Conta Bancária: ");
		
		int conta = Integer.parseInt(scan.nextLine());
		
		System.out.println("Digite o seu nome: ");
		
		String nome = scan.nextLine();
		
		System.out.println("Digite o saldo de sua conta: ");
		
		double saldo = Double.parseDouble(scan.nextLine());
		
		String res = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + (", conta ") + conta + " e seu saldo " + saldo + " já está disponível para saque.";
		System.out.println(res);
	}

}

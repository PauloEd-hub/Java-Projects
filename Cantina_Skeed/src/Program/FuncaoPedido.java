
//Método construtor = mesmo nome da classe



package Program;

import java.util.Scanner;

public class FuncaoPedido {
	private String client_name;
	private double price;
	private String salgado;
	private int quantidade;
	
	public void Status_Compra() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome?");
		this.client_name = sc.nextLine();
		sc.nextLine();
		System.out.print("Qual o salgado que você quer?");
		this.salgado = sc.nextLine();	
			
		System.out.print("Quantos salgados voce quer?");
		this.quantidade = sc.nextInt();

	}	
	
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSalgado() {
		return salgado;
	}
	public void setSalgado(String salgado) {
		this.salgado = salgado;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	










}



public class Conta {
	private double saldo ;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O tatal de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return true;
		}
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	

}

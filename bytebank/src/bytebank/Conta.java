package bytebank;

public class Conta {
	double saldo ;
	int agencia;
	int conta;
	String nome;
	
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
			destino.deposita(200);
			return true;
		}else {
			return true;
		}
	}

}

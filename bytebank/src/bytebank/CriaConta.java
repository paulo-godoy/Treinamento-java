package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 1000;
		System.out.println(conta.saldo);
		
		conta.saldo += 3000;
		
		System.out.println(conta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 300;
		System.out.println(segundaConta.saldo);
	}
}

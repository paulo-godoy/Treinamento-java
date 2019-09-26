package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta paulo = new Conta();
		conta.saldo = 100;
		paulo.saldo = 0;
		System.out.println(conta.saldo);
		conta.deposita(400);
		System.out.println(conta.saldo);
		boolean retorno = conta.saque(200);
		System.out.println(conta.saldo);
		System.out.println(retorno);
		
		conta.transfere(350, paulo);
		
		System.out.println(conta.saldo);
		
		System.out.println(paulo.saldo);
		
	}

}

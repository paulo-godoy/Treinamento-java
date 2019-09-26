
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = " Godoy";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Desenvolvedor";
		
		Conta contaDoPaulo = new Conta(1231, 1277272);
		
		contaDoPaulo.deposita(10000);
		
		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().nome);
		System.out.println(contaDoPaulo.getTitular().cpf);
		System.out.println(contaDoPaulo.getTitular().profissao);
		System.out.println(contaDoPaulo.pegaSaldo());
		System.out.println(contaDoPaulo.getTitular().nome);
		

	}

}

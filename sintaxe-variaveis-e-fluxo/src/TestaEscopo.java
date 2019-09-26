public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais...");

		int idade = 10;
		int totalPessoa = 1;
		boolean quantidadePessoas = totalPessoa >= 2;
		if (idade >= 18 || quantidadePessoas) {
			System.out.println("Seja bem vindo!.");
		} else {
			System.out.println("Você não pode entrar.");
		}
	}
}


public class Exercicio6 {

	public static void main(String[] args) {

		int proximo = 0;
		int atual = 0;
		int anterior = 1;

		System.out.print(atual + ", ");

		while (proximo <= 100) {

			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;

			System.out.print(atual + ", ");
		}
	}
}

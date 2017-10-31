
class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
}

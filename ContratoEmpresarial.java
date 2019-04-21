package seguradora.java;

public class ContratoEmpresarial {

	public PessoaJuridica pessoaJuridica;
	public double valor;
	public int numFuncionarios;
	public int numVisitasDiar;
	public int ramo;
	public double valorSeguro;
	
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitasDiar() {
		return numVisitasDiar;
	}
	public void setNumVisitasDiar(int numVisitasDiar) {
		this.numVisitasDiar = numVisitasDiar;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
	
	public String dadosContratoEmpresarial() {
		return "CNPJ Pessoa : " + pessoaJuridica.getCnpj()
				+ " Valor Seguro: " + valorSeguro
				+ " Ramo: " + ramo
				+ " Numero de Funcionarios: " + numFuncionarios
				+ " valor imovel: " + valor;
	}
	
	ContratoEmpresarial(PessoaJuridica pessoaJuridica, float valor, int numFuncionarios, int numVisitasDiar, int ramo, double valorSeguro){
		
		this.pessoaJuridica = pessoaJuridica;
		this.valor = valor;
		this.numFuncionarios = numFuncionarios;
		this.numVisitasDiar = numVisitasDiar;
		this.ramo = ramo;
		this.valorSeguro = valorSeguro;
	}
	

}

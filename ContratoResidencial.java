package seguradora.java;

public class ContratoResidencial {

	public PessoaFisica pessoaFisica; //var q referencia o tipo PessoaFisica
	public double valor;
	public int zona;
	public int tipoDeResidencia;
	public double valorSeguro;
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getTipoDeResidencia() {
		return tipoDeResidencia;
	}
	public void setTipoDeResidencia(int tipoDeResidencia) {
		this.tipoDeResidencia = tipoDeResidencia;
	}
	
		
	
	ContratoResidencial(PessoaFisica pessoaFisica, double valor, int zona, int tipoDeResidencia, double valorSeguro){
		
		this.pessoaFisica = pessoaFisica;
		this.valor = valor;
		this.zona = zona;
		this.tipoDeResidencia = tipoDeResidencia;
		this.valorSeguro = valorSeguro;
		
	}
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public String dadosContratoResidencial() {
		return "CPF Pessoa : " + pessoaFisica.getCpf()
				+ " Valor Seguro: " + valorSeguro
				+ " Zona: " + zona
				+ " tipo residencia: " +tipoDeResidencia
				+ " valor imovel: " + valor;
	}

}

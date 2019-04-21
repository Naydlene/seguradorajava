package seguradora.java;

public class PessoaJuridica {

	public String nome;
	public String nomeFantasia;
	public String endereco;
	public String cnpj;
	public String telefone;
	public String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	PessoaJuridica(String nome, String nomeFantasia, String endereco, String cnpj, String telefone, String email) {

		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public String dadosPessoaJuridica() {
		String retorno = "Nome: " + this.nome + "\n Nome fantasia: " + this.nomeFantasia + "\nEndereço: "
				+ this.endereco + "\n CNPJ: " + this.cnpj + "\nTelefone: " + this.telefone + "\nE-mail: " + this.email;
		return retorno;

	}
}
package seguradora.java;


public class PessoaFisica {

		public String nome;
		public String endereco;
		public String dataDeNasc;
		public String cpf;
		public String telefone;
		public String email;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getDataDeNasc() {
			return dataDeNasc;
		}
		public void setDataDeNasc(String dataDeNasc) {
			this.dataDeNasc = dataDeNasc;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
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
		
		PessoaFisica(String nome, String endereco, String dataDeNasc, String cpf, String telefone, String email){
			this.nome = nome;
			this.endereco = endereco;
			this.dataDeNasc = dataDeNasc;
			this.cpf = cpf;
			this.telefone = telefone;
			this.email = email;
			
		}
		
		public String dadosPessoaFisica() {
			String retorno = "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nData de nascimento: " + this.dataDeNasc + "\n CPF: " + this.cpf + "\nTelefone: " + this.telefone + "\nE-mail: " + this.email;
			return retorno;
		

	}

}

package seguradora.java;

import java.util.Scanner;


import java.util.ArrayList;

public class Cadastro {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<PessoaFisica> ListPessoaFisica = new ArrayList<>();
		ArrayList<PessoaJuridica> ListPessoaJuridica = new ArrayList<>();
		ArrayList<ContratoResidencial> ListContratoResidencial = new ArrayList<>();
		ArrayList<ContratoEmpresarial> ListContratoEmpresarial = new ArrayList<>();

		int opcao;
		do {
			System.out.println(
			" Digite 1 - Cadastrar pessoa física. \n"
			+ " Digite 2 - Cadastrar pessoa jurídica.\n"
			+ " Digite 3 - Cadastrar contrato residencial.\n"
			+ " Digite 4 - Cadastrar contrato empresarial\n"
			+ " Digite 5 - Exibir lista de pessoas físicas.\n"
			+ " Digite 6 - Exibir lista de pessoas juridicas\n"
			+ " Digite 7 - Exibir lista de todos clientes.\n"
			+ " Digite 8 - Exibir lista de contratos residenciais\n"
			+ " Digite 9 - Exibir lista de contratos empresariais");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				ListPessoaFisica.add(cadastrarPessoaFisica());
				break;

			case 2:
				ListPessoaJuridica.add(cadastrarPessoaJuridica());
				break;
				
			case 3:
				ListContratoResidencial.add(cadastrarContratoResidencial(ListPessoaFisica));
				break;
				
			case 4:
				ListContratoEmpresarial.add(cadastrarContratoEmpresarial(ListPessoaJuridica));

			case 5:
				exibirPessoaFisica(ListPessoaFisica);
				break;
				
			case 6:
				exibirPessoaJuridica(ListPessoaJuridica); //nome do metodo e a variavel da lista.
				break;
				
			case 7: 
				exibirListaDeClientes(ListPessoaFisica, ListPessoaJuridica);
				break;
				
			case 8: 
				exibirListaResidenciais(ListContratoResidencial);
				break;
				
			case 9: 
				exibirListaDeEmpresariais(ListContratoEmpresarial);
				break;
			}
		} while (opcao != 0);
	}

	static public PessoaFisica cadastrarPessoaFisica() {
		String lixo = input.nextLine();
		System.out.println("Informe o nome: ");
		String nome = input.nextLine();
		System.out.println("Informe o endereço: ");
		String endereco = input.nextLine();
		System.out.println("Informe a data de nascimento: ");
		String dataDeNasc = input.nextLine();
		System.out.println("Infome o CPF: ");
		String cpf = input.nextLine();
		System.out.println("Informe o telefone: ");
		String telefone = input.nextLine();
		System.out.println("Informe o e-mail: ");
		String email = input.nextLine();
		PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, dataDeNasc, cpf, telefone, email);
		return pessoaFisica;

	}

	static public PessoaJuridica cadastrarPessoaJuridica() {
		String lixo = input.nextLine();
		System.out.println("Informe o nome: ");
		String nome = input.nextLine();
		System.out.println("Infome o nome fantasia: ");
		String nomeFantasia = input.nextLine();
		System.out.println("Infome o endereço: ");
		String endereco = input.nextLine();
		System.out.println("Infome o CNPJ: ");
		String cnpj = input.nextLine();
		System.out.println("Informe o telefone: ");
		String telefone = input.nextLine();
		System.out.println("Informe o e-mail: ");
		String email = input.nextLine();
		PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, nomeFantasia, endereco, cnpj, telefone, email);
		return pessoaJuridica;

	}
	
	static public ContratoResidencial cadastrarContratoResidencial(ArrayList<PessoaFisica> ListPessoaFisica) {
		double porcentagem = 0.02;
		double valorSeguro;
		String cpf;
		PessoaFisica pessoaFisica;
		String lixo = input.nextLine();
		do {
			exibirPessoaFisica(ListPessoaFisica);
			System.out.println("Informe o CPF: ");
			cpf = input.nextLine();
		}while(!confirmarPessoaFisica(ListPessoaFisica, cpf));
		pessoaFisica = retornarPessoaFisica(ListPessoaFisica, cpf);
		System.out.println("Informe o valor do imóvel: ");
		double valor = input.nextFloat();
		System.out.println("Informe a zona: \n1 - Urbana.\n2 - Suburbana.\n3 - Rural.");
		int zona = input.nextInt();
		if(zona == 1) {
			porcentagem = porcentagem + 0.01;
		} 
		if(zona ==2) {
			porcentagem = porcentagem + 0.005;
		}
		System.out.println("Infome o tipo de residência:\n1 - Apartamento.\n2 - Casa.");
		int tipoDeResidencia = input.nextInt();
		if(tipoDeResidencia == 2) {
			porcentagem = porcentagem + 0.005;
		}
		valorSeguro = porcentagem * valor;
		ContratoResidencial contratoResidencial = new ContratoResidencial(pessoaFisica, valor, zona, tipoDeResidencia, valorSeguro);
		return contratoResidencial;
	}
	
	static public ContratoEmpresarial cadastrarContratoEmpresarial(ArrayList<PessoaJuridica> ListPessoaJuridica) {
		int i;
		double porcentagemSeguro = 0.04;
		double valorSeguro;
		String cnpj;
		PessoaJuridica pessoaJuridica;
		String lixo = input.nextLine();
		do {
			exibirPessoaJuridica(ListPessoaJuridica);
			System.out.println("Informe o CNPJ: ");
			cnpj = input.nextLine();
		}while(!confirmarPessoaJuridica(ListPessoaJuridica, cnpj));
		pessoaJuridica = retornarPessoaJuridica(ListPessoaJuridica, cnpj);
		System.out.println("Informe o valor do imóvel: ");
		float valor = input.nextFloat();
		System.out.println("Informe a quantidade de funcionários da empresa: ");
		int numFuncionarios = input.nextInt();
		int funcDiv10 = (int)(numFuncionarios/10);
		porcentagemSeguro = porcentagemSeguro + (funcDiv10 * 0.002);
		System.out.println("Informe a quantidade de  visitas diárias: ");
		int numVisitasDiar = input.nextInt();
		int visitDiv10 = (int)(numVisitasDiar/10);
		porcentagemSeguro = porcentagemSeguro + (visitDiv10 * 0.003);
		System.out.println("Informe o ramo: 1 - Comercio || 2 - Industria || 3 - Agropecuaria ");
		int ramo = input.nextInt();
		if(ramo == 1)
			porcentagemSeguro+=0.01;
		else if (ramo == 2)
			porcentagemSeguro+=0.005;
		valorSeguro = valor * porcentagemSeguro;
		ContratoEmpresarial contratoempresarial = new ContratoEmpresarial(pessoaJuridica, valor, numFuncionarios, numVisitasDiar, ramo, valorSeguro);
		return contratoempresarial;
		
	}
	
	static private void exibirListaResidenciais(ArrayList<ContratoResidencial> ListContratoResidencial) {
		for (ContratoResidencial cr : ListContratoResidencial) {
			System.out.println("Contrato residencial: ");
			System.out.println(cr.dadosContratoResidencial());
		}
	}
	
	static private void exibirListaDeEmpresariais(ArrayList<ContratoEmpresarial> ListContratoEmpresarial) {
		for (ContratoEmpresarial ce : ListContratoEmpresarial) {
			System.out.println("Contrato empresarial: ");
			System.out.println(ce.dadosContratoEmpresarial());
		
		}
	}
	static private void exibirPessoaFisica(ArrayList<PessoaFisica> ListPessoaFisica) {
		for (PessoaFisica f : ListPessoaFisica) {
			System.out.println("PessoaFisica: ");
			System.out.println(f.dadosPessoaFisica());
		
		}
	}
	static private void exibirPessoaJuridica(ArrayList<PessoaJuridica> ListPessoaJuridica) {
		for (PessoaJuridica j : ListPessoaJuridica) {
			System.out.println("PessoaJuridica: ");
			System.out.println(j.dadosPessoaJuridica());
		}
		 
	}
	
	static private PessoaJuridica retornarPessoaJuridica(ArrayList<PessoaJuridica> ListPessoaJuridica,String cnpj) {
		for (PessoaJuridica j : ListPessoaJuridica) {
			if(j.getCnpj().equalsIgnoreCase(cnpj))
				return j;
		}
	 return null;
	}
	
	static private PessoaFisica retornarPessoaFisica(ArrayList<PessoaFisica> ListPessoaFisica,String cpf) {
		for (PessoaFisica f : ListPessoaFisica) {
			if(f.getCpf().equalsIgnoreCase(cpf))
				return f;
		}
	 return null;
	}
	static private void exibirListaDeClientes(ArrayList<PessoaFisica> ListPessoaFisica, ArrayList<PessoaJuridica> ListPessoaJuridica) {
		exibirPessoaFisica(ListPessoaFisica);
		exibirPessoaJuridica(ListPessoaJuridica);
	}
	
	static private boolean confirmarPessoaJuridica(ArrayList<PessoaJuridica> ListPessoaJuridica,String cnpj) {
		for (PessoaJuridica j : ListPessoaJuridica) {
			if(cnpj.equalsIgnoreCase(j.getCnpj()))
				return true;
		}
	 System.err.println("Cliente inexistente, digite o CNPJ certo.");
	 return false;
	}
	static private boolean confirmarPessoaFisica(ArrayList<PessoaFisica> ListPessoaFisica,String cpf) {
		for (PessoaFisica f : ListPessoaFisica) {
			if(cpf.equalsIgnoreCase(f.getCpf()))
				return true;
		}
	 System.err.println("Cliente inexistente, digite o CPF certo.");
	 return false;
	}
	
}

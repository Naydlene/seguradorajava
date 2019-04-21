package seguradora.java;

public class Sinistro {
	ContratoEmpresarial contratoEmpresarial;
	ContratoResidencial contratoResidencial;
	public int tipoContrato;
	public String data;
	public double porcentagemDePerca;
	
	public Sinistro(ContratoEmpresarial contratoEmpresarial, ContratoResidencial contratoResidencial, int tipoContrato,
			String data, double porcentagemDePerca) {
		super();
		this.contratoEmpresarial = contratoEmpresarial;
		this.contratoResidencial = contratoResidencial;
		this.tipoContrato = tipoContrato;
		this.data = data;
		this.porcentagemDePerca = porcentagemDePerca;
	}
	public ContratoEmpresarial getContratoEmpresarial() {
		return contratoEmpresarial;
	}
	public void setContratoEmpresarial(ContratoEmpresarial contratoEmpresarial) {
		this.contratoEmpresarial = contratoEmpresarial;
	}
	public ContratoResidencial getContratoResidencial() {
		return contratoResidencial;
	}
	public void setContratoResidencial(ContratoResidencial contratoResidencial) {
		this.contratoResidencial = contratoResidencial;
	}
	public int getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPorcentagemDePerca() {
		return porcentagemDePerca;
	}
	public void setPorcentagemDePerca(double porcentagemDePerca) {
		this.porcentagemDePerca = porcentagemDePerca;
	}
}

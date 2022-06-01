package Entidade;

public class EmpregadoTercerizado extends Empregado{

	private Double CobrancaAdicional;

	public EmpregadoTercerizado(Double cobrancaAdicional) {
		super();
	}

	public EmpregadoTercerizado(String nome, Integer horas, Double valorPorHoras, Double cobrancaAdicional) {
		super(nome, horas, valorPorHoras);
		CobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return CobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		CobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double FormaDePagamento() {
		return super.FormaDePagamento() + CobrancaAdicional * 1.1;
	}
}
package Entidade;

public class Empregado {

	private String nome;
	private Integer Horas;
	private Double ValorPorHoras;
	
	public Empregado() {
		
	}

	public Empregado(String nome, Integer horas, Double valorPorHoras) {
		this.nome = nome;
		Horas = horas;
		ValorPorHoras = valorPorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return Horas;
	}

	public void setHoras(Integer horas) {
		Horas = horas;
	}

	public Double getValorPorHoras() {
		return ValorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		ValorPorHoras = valorPorHoras;
	}

	public double FormaDePagamento() {
		return Horas * ValorPorHoras;
	}
}

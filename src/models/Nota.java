package models;

public class Nota {
	
	private int quantidade;
	private String titulo;
	private Double valor;
	private Nota proximaNota;
	
	//Construtor para instanciar as notas, exceto a de dez reais
	public Nota(Double valor, Nota proximaNota, String titulo) {
		this.titulo = titulo;
		this.quantidade = 0;
		this.valor = valor;
		this.proximaNota = proximaNota;
	}
	
	//Construtor para nota de Dez que não chama uma outra nota caso o valor a ser sacado seja inferior
	public Nota(Double valor, String titulo) {
		this.titulo = titulo;
		this.quantidade = 0;
		this.valor = valor;
	}
	
	//Método para sacar determinado valor ou sacar uma nota de valor inferior se necessário
	public Double sacarValor(Double valor) {
		return (valor - this.valor) >= 0 ? this.calcula(valor) : getProximaNota().sacarValor(valor);
	}
	
	//Método auxiliar para calcular o valor e determinar a quantidade de notas utilizadas
	private Double calcula(Double valorSaque) {
		this.setQuantidade(this.getQuantidade() + 1);
		return valorSaque - this.valor;
	}
	
	//Getters and Setters
	public String getMensagem() {
		return this.getQuantidade() > 1 ? this.getQuantidade() + " notas de " + this.getTitulo() + "." 
					: this.getQuantidade() + " nota de " + this.getTitulo() + ".";
	}

	//Getters e Setters
	public Nota getProximaNota() {
		return proximaNota;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}

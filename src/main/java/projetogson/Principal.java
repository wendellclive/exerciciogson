package projetogson;

public class Principal {

	private String nome;
	private String malte;
	private String marca;
	private int Ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMalte() {
		return malte;
	}

	public void setMalte(String malte) {
		this.malte = malte;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	@Override
	public String toString() {
		return "Principal [nome=" + nome + ", malte=" + malte + ", marca=" + marca + ", Ano=" + Ano + "]";
	}
}

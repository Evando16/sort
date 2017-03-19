
public class Movie {
	private int id;
	private String nome;
	private int popularidade;
	
	
	public Movie(int id, String nome, int popularidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.popularidade = popularidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPopularidade() {
		return popularidade;
	}


	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}


	public void setId(int id) {
		this.id = id;
	}		
	
}

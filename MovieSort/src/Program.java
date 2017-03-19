import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		/**
		 * Nota:
		 * Não sei se seu curso tem alguma video aula ou explicação, mas quando você ordernar o vetor
		 * será necessário atualizar a lista na tela, você vai ter que redesenhar sua tela com a lista de filmes
		 */
		
		
		ArrayList<Movie> listMovie = new ArrayList<>();
		ArrayList<Movie> result = new ArrayList<>();
		
		
		listMovie.add(new Movie(1, "The Lord of Rings", 10));
		listMovie.add(new Movie(2, "Star wars", 10));
		listMovie.add(new Movie(3, "Deadpool", 8));
		listMovie.add(new Movie(4, "Nemo", 5));
		listMovie.add(new Movie(5, "Logan", 9));
		listMovie.add(new Movie(6, "Power Rangers", 6));
		listMovie.add(new Movie(7, "Batman", 1));
		
		System.out.println("Array da forma como foi inicializada");
		for (Movie obj : listMovie) {
			System.out.println(obj.getPopularidade() + " - " + obj.getNome());
		}	
		
		result = MovieSort.SortPopDecrescente(listMovie);
		System.out.println("\nArray decrescente");
		for (Movie obj : result) {
			System.out.println(obj.getPopularidade() + " - " + obj.getNome());
		}
		
		result = MovieSort.SortPopAscendente(listMovie);
		System.out.println("\nArray Ascendente");
		for (Movie obj : result) {
			System.out.println(obj.getPopularidade() + " - " + obj.getNome());
		}
	}
}

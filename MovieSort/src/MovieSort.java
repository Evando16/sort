import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Essa classe tem dois metodos static para que você possa chamar esses metodos sem precisar fazer uma
 * instância da classe
 * @author Evando Junior
 *
 */
public class MovieSort {	
	/**
	 * Neste metodo você faz um Collections.sort() e passa uma classe para como parametro, mas pq passar
	 * a classe como parametro?
	 * O metodo sort precisa de uma classe que implemente o Comparator e que tenha uma metodo dentro dela
	 * chamado compare para fazer a ordenação da lista (ele faz isso internamente, quando vc retorna 0, 1 ou -1
	 * @param listMovie
	 * @return
	 */
	
	public static ArrayList<Movie> SortPopDecrescente(ArrayList<Movie> listMovie) {
		Collections.sort(listMovie, new SortDecrescente());
		return listMovie;
	}
	
	public static ArrayList<Movie> SortPopAscendente(ArrayList<Movie> listMovie) {
		Collections.sort(listMovie, new SortAscendente());
		return listMovie;
	}
}

/**
 * Cada classe foi feita para um sort especifico, uma faz o sort decrescente e o outro ascendente
 * Ele faz essa ordenação pelo retorno 0, 1 ou -1 (é um funcionamento interno do metodo sort)
 * @author Evando Junior
 *
 */

class SortDecrescente implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.getPopularidade() == o2.getPopularidade()) {
			return 0;
		}else if (o1.getPopularidade() > o2.getPopularidade()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}

class SortAscendente implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.getPopularidade() == o2.getPopularidade()) {
			return 0;
		}else if (o1.getPopularidade() > o2.getPopularidade()) {
			return 1;
		}else {
			return -1;
		}		
	}
	
}

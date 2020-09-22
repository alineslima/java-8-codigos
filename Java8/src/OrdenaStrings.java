import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		Collections.sort(palavras, comparador);
		
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		palavras.sort(comparador);
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		
		
//		palavras.forEach((String s) -> {
//		    System.out.println(s);
//		});
//		
		palavras.forEach(s -> System.out.println(s));
		
//		palavras.sort(new Comparator<String>() {
//		    public int compare(String s1, String s2) {
//		        if (s1.length() < s2.length())
//		            return -1;
//		        if (s1.length() > s2.length())
//		            return 1;
//		        return 0;
//		    }
//		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		
//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		
	}

}	
		
		
		
		
		class ComparadorDeStringPorTamanho implements Comparator<String> {

			  public int compare(String s1, String s2) {
			        if(s1.length() < s2.length()) 
			            return -1;
			        if(s1.length() > s2.length()) 
			            return 1;
			        return 0;
		    }

		}
		
		
		class ConsumidorDeString implements Consumer<String> {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		}

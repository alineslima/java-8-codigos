import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestaCurso {
	
	public static void main(String[] args) {
		
	
	List<Curso> cursos = new ArrayList<Curso>();
	cursos.add(new Curso("Python", 45));
	cursos.add(new Curso("JavaScript", 150));
	cursos.add(new Curso("Java 8", 113));
	cursos.add(new Curso("C", 55));

//	cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
	cursos.sort(Comparator.comparingInt(Curso::getAlunos));
	
//	Stream<Curso> streamDeCurso = cursos.stream();
//	Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
	
	Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
	cursos.forEach(c -> System.out.println(c.getNome()));
	
//	cursos.stream()
//	   .filter(c -> c.getAlunos() > 100)
//	   .forEach(c -> System.out.println(c.getNome()));
	
//	cursos.stream()
//	   .filter(c -> c.getAlunos() > 100)
//	   .map(Curso::getAlunos)
//	   .forEach(System.out::println);
	
	IntStream stream = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .mapToInt(Curso::getAlunos);
	
	int soma = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .mapToInt(Curso::getAlunos)
			   .sum();
	
	
	Optional<Curso> optional = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .findAny();
	
//	Curso curso = optional.get();
	Curso curso = optional.orElse(null);
	
	optional.ifPresent(c -> System.out.println(c.getNome()));
	
	
	cursos.stream()
	   .filter(c -> c.getAlunos() > 100)
	   .findAny()
	   .ifPresent(c -> System.out.println(c.getNome()));
	
	
	List<Curso> resultados = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .collect(Collectors.toList());
	
	cursos = cursos.stream()
			   .filter(c -> c.getAlunos() > 100)
			   .collect(Collectors.toList());
	
	Map mapa = cursos 
			.stream() 
			.filter(c -> c.getAlunos() > 100) 
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
	}
}

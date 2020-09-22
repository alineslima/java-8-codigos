import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
	

		        LocalDate hoje = LocalDate.now();
		        System.out.println(hoje);
		        
		        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		        
//		        Period periodo = Period.between(hoje, olimpiadasRio);
//		        System.out.println(periodo);
		        
		        Period periodo = Period.between(hoje, olimpiadasRio);
		        System.out.println(periodo.getYears());
		        System.out.println(periodo.getMonths());
		        System.out.println(periodo.getDays());
		        
		        System.out.println(hoje.minusYears(1));
		        System.out.println(hoje.minusMonths(4));
		        System.out.println(hoje.minusDays(2));

		        System.out.println(hoje.plusYears(1));
		        System.out.println(hoje.plusMonths(4));
		        System.out.println(hoje.plusDays(2));

		        
		        olimpiadasRio.plusYears(4);
		        System.out.println(olimpiadasRio);
		        
		        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		        System.out.println(proximasOlimpiadas);
		        
		        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        
		        String valorFormatado = proximasOlimpiadas.format(formatador);
		        System.out.println(valorFormatado);
	}

}

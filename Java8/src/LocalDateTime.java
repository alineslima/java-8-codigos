import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {

	public static void main(String[] args) {
		
//		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
//		LocalDateTime agora = LocalDateTime.now();
//		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
		
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);

	}

}

package exercicio3;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.junit.Test;

public class TestesExercicio3 {

	@Test
	public void testName() throws Exception {
		assertEquals(1, 1);
	}
	
	@Test
	public void testeDatas() throws Exception {
		LocalDate hoje = new LocalDate(2017,04,01);
		assertEquals(1, hoje.getDayOfMonth());
		assertEquals(4, hoje.getMonthOfYear());
		assertEquals(2017, hoje.getYear());
	}
	
	@Test
	public void testeDataDoMeuNascimento() throws Exception {
		LocalDate data = new LocalDate(1985,9,28);
		LocalDate meuNascimento = new LocalDate(1985,9,28);
		assertEquals(data, meuNascimento);
	}
	
	@Test
	public void testeHorarioAcordado() throws Exception {
		LocalTime hora = new LocalTime(8,30);
		LocalTime acordei = new LocalTime(8,30);
		assertEquals(hora, acordei);
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void testeDataInvalida() throws Exception {
		LocalDate data = new LocalDate(1932,2,30);
	}	

	@Test
	public void testeSomaUmDiaEm28DeFevereiro() throws Exception {
		LocalDate vinteEoito = new LocalDate(2017,2,28);
		LocalDate umDeMarco = new LocalDate(2017,3,1);
		assertEquals(vinteEoito.plusDays(1), umDeMarco);
	}

	@Test
	public void contaHoras() throws Exception {
		DateTime trintaEUm = new DateTime(2017,3,31,18,30);
		DateTime seisDeCinco = new DateTime(2017,5,6,18,30);
		Interval interval = new Interval(trintaEUm, seisDeCinco);
		Period period = new Period(interval.toDurationMillis());
		assertEquals(864, period.getHours());
	}
	
}

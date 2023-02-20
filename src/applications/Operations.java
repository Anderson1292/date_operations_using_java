package applications;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.parse("2023-02-11");
		LocalDateTime local = LocalDateTime.parse("2023-02-11T10:20:30");
		Instant inst = Instant.parse("2023-02-11T01:21:20Z");
		
		//Instant actual = Instant.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println(data.format(format1));
		System.out.println(local.format(format2));
		System.out.println(format3.format(inst));
		System.out.println(local.format(format4));
		System.out.println(format5.format(inst));

	}

}
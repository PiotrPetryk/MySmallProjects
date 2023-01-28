package godziny;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Godziny {

	public static int ileMinelo(String zakres) {
		int poz = zakres.indexOf("-");
		String odStr = zakres.substring(0, poz).trim();
		String doStr = zakres.substring(poz+1).trim();
		LocalTime odTime = LocalTime.parse(odStr, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US));
		LocalTime doTime = LocalTime.parse(doStr, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US));
		if (doTime.isBefore(odTime)) {
			return 24-(int)doTime.until(odTime, ChronoUnit.HOURS);
		}else {
			return (int)odTime.until(doTime, ChronoUnit.HOURS);
		}

	}

	public static void main(String[] args) {
		System.out.println(ileMinelo("1:00 AM - 9:00 PM"));
	}
}

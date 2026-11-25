import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class GestionnaireRdv {

    private final Calendar calendar = Calendar.getInstance(Locale.FRENCH);

    public void printTodayWithSlash() {
        int day = this.calendar.get(Calendar.DAY_OF_MONTH);
        int mounth = this.calendar.get(Calendar.MONTH) + 1;
        int year = this.calendar.get(Calendar.YEAR);

        System.out.printf("%d/%d/%d%n", day, mounth, year);
    }

    public void printCompleteDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE d LLLL y à k:m");
        System.out.println(formatter.format(this.calendar.getTime()));
    }
}

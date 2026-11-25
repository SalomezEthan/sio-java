import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RendezVous {
    
    private String objet;
    private Calendar date;
    
    public RendezVous(String objet, Calendar date) {
        this.objet = objet;
        this.AddDaysIfWeekEnd(date);
        this.date = date;
    }
    
    public void reporter() {
        this.date.add(Calendar.WEEK_OF_YEAR, 2);
        this.date.add(Calendar.DAY_OF_YEAR, 3);
        this.AddDaysIfWeekEnd(this.date);
    }
    
    private void AddDaysIfWeekEnd(Calendar date) {
        int month = date.get(Calendar.DAY_OF_WEEK);
        if (month == Calendar.SATURDAY) {
            date.add(Calendar.DAY_OF_YEAR, 2);
        }
        else if (month == Calendar.SUNDAY) {
            date.add(Calendar.DAY_OF_YEAR, 1);
        }
    }
    
    public Calendar getDateRappel() {
        
        Calendar dateRappel = (Calendar)this.date.clone();
        dateRappel.roll(Calendar.DAY_OF_YEAR, -2);
        
        return dateRappel;
    }
    
    
    
    public long getJoursRestants() {
        
        Calendar calendar = Calendar.getInstance();
        
        long currentDay = calendar.getTimeInMillis();
        long rdvDay = this.date.getTimeInMillis();
        
        return (rdvDay - currentDay) / 1_000 / 60 / 60 / 24;
    }
    
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE d LLLL y à k:m");
        
        builder
        .append("Votre rendez vous pour ")
        .append(this.objet)
        .append(' ')
        .append("est prévu pour le ")
        .append(formatter.format(this.date.getTime()));
        
        return builder.toString();
    }
}

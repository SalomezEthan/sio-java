import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Course {

    private ArrayList<Cheval> chevaux;
    private LocalDateTime date;
    
    public Course(LocalDateTime date) {
        this.chevaux = new ArrayList<Cheval>();
        this.date = date;
    }

    public void ajouterChevalParticipant(Cheval cheval) {
        this.chevaux.add(cheval);
    }

    public Boolean retirerChevalParticipant(Cheval cheval) {
        return this.chevaux.remove(cheval);
    }

    public void afficherListChevauxParticipants() {
        System.out.println("Les chevaux participants de la course sont :");
        for (int i = 0; i < this.chevaux.size(); ++i) {
            System.out.print((i + 1) + ". ");
            System.out.println(this.chevaux.get(i).versChaine());
        }
    }

    public void afficherDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd uuuu à HH:mm");
        System.out.println("La date de la course est le " + this.date.format(formatter));
    }

    public Boolean contains(Cheval cheval) {
        return this.chevaux.contains(cheval);
    }

    public LocalDateTime getCourseDateCalendar() {
        return this.date;
    }

    public List<Cheval> getChevauxParticipants() {
        return Collections.unmodifiableList(this.chevaux);
    }
}
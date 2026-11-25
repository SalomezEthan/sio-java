import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Resultat {

    private final Course course;
    private ArrayList<Cheval> classement;

    public Resultat(Course course) {
        this.course = course;
        this.classement = new ArrayList<Cheval>();
    }

    public void push(Cheval cheval) throws Exception {

        if (!this.course.contains(cheval)) {
            throw new Exception("La course ne connait pas ce cheval participant.");
        }

        if (this.classement.contains(cheval)) {
            throw new Exception("Le cheval est déjà dans le classement.");
        }

        this.classement.add(cheval);
    }

    public List<Cheval> getClassement() {
        return Collections.unmodifiableList(this.classement);
    }
}

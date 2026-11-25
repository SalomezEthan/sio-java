import java.time.LocalDateTime;
import java.util.Calendar;

class Program {
    public static void main(String[] args) throws Exception {

        Cheval miss = new Cheval("miss", 3, 1.5f, 200, 0);
        Cheval argon = new Cheval("argon", 3, 1.5f, 200, 0);
        Cheval luck = new Cheval("Luck", 3, 1.5f, 200, 0);
        Cheval bouh = new Cheval("bouh", 3, 1.5f, 200, 0);

        Course paris = new Course(LocalDateTime.of(2027, 12, 28, 18, 0));
        paris.ajouterChevalParticipant(bouh);
        paris.ajouterChevalParticipant(argon);

        Course lyon = new Course(LocalDateTime.of(2027, 1, 12, 16, 0));
        lyon.ajouterChevalParticipant(bouh);
        lyon.ajouterChevalParticipant(luck);
        lyon.ajouterChevalParticipant(miss);

        Course grenoble = new Course(LocalDateTime.of(2027, 8, 18, 18, 0));
        lyon.ajouterChevalParticipant(miss);
        lyon.ajouterChevalParticipant(argon);

        CourseCalendar calendar = new CourseCalendar(2027);
        calendar.ajouterCourse(paris);
        calendar.ajouterCourse(lyon);
        calendar.ajouterCourse(grenoble);

        calendar.afficherResumeCoursesAnnee();
        System.out.println("---------------------------------------------\n");

        Resultat resultParis = new Resultat(paris);
        resultParis.push(bouh);
        resultParis.push(argon);

        Resultat resultLyon = new Resultat(lyon);
        resultLyon.push(miss);
        resultLyon.push(bouh);
        resultLyon.push(luck);

        Resultat resultGrenoble = new Resultat(grenoble);
        resultGrenoble.push(miss);
        resultGrenoble.push(argon);

        
    }
}
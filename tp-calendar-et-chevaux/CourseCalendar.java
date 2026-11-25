import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class CourseCalendar {

    private final ArrayList<Course> courses;
    private final int year;

    public CourseCalendar(int year) {
        this.courses = new ArrayList<Course>();
        this.year = year;
    }

    public void ajouterCourse(Course course) throws Exception {

        if (course.getCourseDateCalendar().getYear() != this.year) {
            throw new Exception("L'année de la course doit être la même année que le calendrier.");
        }

        this.courses.add(course);
        this.courses.sort(new DateCourseComparateur());
    }

    public void afficherResumeCoursesAnnee() {
        for (Course course : this.courses) {
            course.afficherDate();
            course.afficherListChevauxParticipants();
            System.out.println();
        }
    }
}

class DateCourseComparateur implements Comparator<Course> {

    @Override
    public int compare(Course arg0, Course arg1) {
        
        LocalDateTime a = arg0.getCourseDateCalendar();
        LocalDateTime b = arg1.getCourseDateCalendar();

        return a.compareTo(b);
    }

    

}
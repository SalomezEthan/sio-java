import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ResumeResultat {
    
    private Resultat[] resultats;
    private Dictionary<Cheval, Integer> stats;

    public ResumeResultat(Resultat[] resultats) {
        this.resultats = resultats;
        this.stats = new Hashtable<>();
    }

    private void registerResult(Resultat result) {
        
    }
}

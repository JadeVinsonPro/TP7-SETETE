import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    private String annee;
    private Map<Jouet, Integer> lesJouets = new HashMap<>();

    public Catalogue(String annee) {
        this.annee = annee;
    }

    public void QuantiteDistribuee() {
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "annee='" + annee + '\'' +
                '}';
    }
}


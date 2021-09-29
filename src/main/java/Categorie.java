import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private Integer code;
    private String libelle;
    private List<Jouet> lesJouets = new ArrayList<Jouet>();

    public Categorie(Integer code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public void AjouterJouet(Jouet jouet) {
        this.lesJouets.add(jouet);

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Jouet {
    private Integer numero;
    private String libelle;
    private Categorie laCategorie;
    private TrancheAge laTranche;

    public Jouet(Integer numero, String libelle, Categorie laCategorie, TrancheAge laTranche) {
        this.numero = numero;
        this.libelle = libelle;
        this.laCategorie = laCategorie;
        this.laTranche = laTranche;
    }

    public boolean Convient(Integer unAge) {
        if (laTranche.getAgeMin() < unAge & unAge < laTranche.getAgeMax() ){
            return true;
        }
            else {
                return false;

        }
    }

      public String getInfos() {
        return "Les informations : {" +
                "Le libellé du jouet : '" + libelle + '\'' +
                "; le libellé de sa catégorie=" + laCategorie.getLibelle() +
                "; Age minimum =" + laTranche.getAgeMin()  + "; Age maximum =" + laTranche.getAgeMax()  +

                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Categorie getLaCategorie() {
        return laCategorie;
    }

    public void setLaCategorie(Categorie laCategorie) {
        this.laCategorie = laCategorie;
    }

    public TrancheAge getLaTranche() {
        return laTranche;
    }

    public void setLaTranche(TrancheAge laTranche) {
        this.laTranche = laTranche;
    }


}

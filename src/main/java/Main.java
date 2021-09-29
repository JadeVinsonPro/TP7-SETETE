import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Catalogue catalogue1 = new Catalogue("2020");

    Categorie categorie1 = new Categorie(1, "Decorations");
    Categorie categorie2 = new Categorie(2, "Jeu de societe");

    TrancheAge trancheAge1 = new TrancheAge(1, 5, 10);
    TrancheAge trancheAge2 = new TrancheAge(2, 8, 14);

    Jouet jouet1 = new Jouet(1,"Cheval en bois",categorie1,trancheAge1);


    System.out.println(catalogue1);


    }
}

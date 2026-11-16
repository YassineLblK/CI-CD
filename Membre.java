import java.util.ArrayList;
import java.util.List;

public class Membre {
    private final String nom;
    private final List<Livre> livres = new ArrayList<>();

    public Membre(String nom) { this.nom = nom; }

    public String getNom() { return nom; }
    public List<Livre> getLivres() { return livres; }
}
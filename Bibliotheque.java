import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private final List<Livre> livres = new ArrayList<>();

    public void ajouter(Livre livre) { livres.add(livre); }

    public boolean emprunter(Membre membre, String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre) && !l.isEmprunte()) {
                l.setEmprunte(true);
                membre.getLivres().add(l);
                return true;
            }
        }
        return false;
    }

    public void afficher() {
        livres.forEach(System.out::println);
    }
}
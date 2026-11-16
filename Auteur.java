public class Auteur {
    private final String nom;
    private final String pays;

    public Auteur(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
    }

    public String getNom() { return nom; }
    public String getPays() { return pays; }

    @Override
    public String toString() { return nom + " - " + pays; }
}
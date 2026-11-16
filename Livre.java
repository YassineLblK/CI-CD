public class Livre {
    private final String titre;
    private final String auteur;
    private boolean emprunte = false;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() { return titre; }
    public boolean isEmprunte() { return emprunte; }
    public void setEmprunte(boolean emprunte) { this.emprunte = emprunte; }

    @Override
    public String toString() {
        return titre + " (" + auteur + ")" + (emprunte ? " [emprunté]" : " [disponible]");
    }
}
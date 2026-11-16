public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();
        biblio.ajouter(new Livre("Le Petit Prince", "Saint-Exupéry"));
        biblio.ajouter(new Livre("L'Étranger", "Camus"));
        biblio.ajouter(new Livre("Les Misérables", "Hugo"));

        Membre omar = new Membre("Omar");

        System.out.println("\n ========================== ");
        System.out.println("\n ========================== ");

        System.out.println("Emprunt avec succes ? " + biblio.emprunter(omar, "L'Étranger"));
        System.out.println("Emprunt réussi ? " + biblio.emprunter(omar, "L'Étranger"));

        System.out.println("\n ========================== ");
        System.out.println("\n ========================== ");

        System.out.println("\nÉtat de la bibliothèque :");
        biblio.afficher();

        System.out.println("\n ========================== ");
        System.out.println("\n ========================== ");

        System.out.println("\nLivres de " + omar.getNom() + " : " + omar.getLivres());
    }
}
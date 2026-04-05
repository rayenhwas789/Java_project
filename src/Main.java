public class Main {

    public static void main(String[] args) {

        // Créer un membre
        Membre m = new Membre("Ahmed","Mejri", "ahmed@gmail.com", "1234", "MENSUEL");
        m.ajouterMembre();
        // Créer un bureau
        Bureau b = new Bureau("Bureau A", true, 80);
        b.ajouterBureau();

        // Fermer la connexion (optionnel)
        //ConnexionDB.closeConnection();
    }
}

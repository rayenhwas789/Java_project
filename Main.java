public class Main {

    public static void main(String[] args) {

        //Membre m = new Membre("Arfaoui","Takwa", "takwa@gmail.com", "2587", "Journalier");
        //m.ajouterMembre();

        // Fermer la connexion

        Bureau b = new Bureau("Bureau B", true, 10);
        //b.ajouterBureau();

        /*
        //Modifier les valeurs avec setters
        b.setNom("Bureau VIP");
        b.setDisponible(false);
        b.setTarif(150);

        //Modifier dans la DB (id = 1)
        b.modifierBureau(1);

        //érifier disponibilité
        b.verifierDisponibilite(1);
        */
        //Supprimer le bureau (id = 1)
        b.supprimerBureau(1);

        // 🔹 6. Vérifier après suppression
        b.verifierDisponibilite(1);





        ConnexionDB.closeConnection();
    }
}

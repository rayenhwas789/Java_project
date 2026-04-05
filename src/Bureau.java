import java.sql.Connection;
import java.sql.PreparedStatement;

public class Bureau {

    // Attributs du bureau
    private int id;
    private String nom;
    private boolean disponible;
    private double tarif;

    // Constructeur
    public Bureau(String nom, boolean disponible, double tarif) {
        this.nom = nom;
        this.disponible = disponible;
        this.tarif = tarif;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getTarif() {
        return tarif;
    }

    // Ajouter un bureau dans la base de données
    public void ajouterBureau() {
/*
        // Connexion à la base
        Connection conn = ConnexionDB.getConnection();

        // Requête SQL
        String sql = "INSERT INTO bureau (nom, disponible, tarif) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nom);
            ps.setBoolean(2, disponible);
            ps.setDouble(3, tarif);

            ps.executeUpdate();
*/
            System.out.println("Bureau ajouté : " + nom);
/*
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Vérifier disponibilité
    public boolean verifierDisponibilite() {
        return disponible;


 */
}}

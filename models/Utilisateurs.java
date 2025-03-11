package models;

public class Utilisateurs {
    public String nom;
    public String identifiant;
    public String motDePasse;

    public  Utilisateurs(String nom, String identifiant, String motDePasse) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Identifiant: " + identifiant;
    }
}

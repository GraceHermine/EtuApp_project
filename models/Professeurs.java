package models;

public class Professeurs {
    public String nom;
    public String prenom;
    public String specialite;

    
    public Professeurs(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Spécialité: " + specialite;
    }
}

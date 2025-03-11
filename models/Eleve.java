package models;

public class Eleve {
    public String nom;
    public String prenom;
    public String matricule;

    public Eleve(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Matricule: " + matricule;
    }
}

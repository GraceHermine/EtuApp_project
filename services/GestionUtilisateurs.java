package services;

import models.Utilisateurs;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionUtilisateurs {
    private static ArrayList<Utilisateurs> utilisateurs = new ArrayList<>();

    public static void afficherMenuUtilisateurs(Scanner scanner) {
        while (true) {
            System.out.println("\n======= GESTION DES UTILISATEURS =======");
            System.out.println("1: Ajouter un utilisateur");
            System.out.println("2: Supprimer un utilisateur");
            System.out.println("3: Lister les utilisateurs");
            System.out.println("4: Retour");
            System.out.print("\nVotre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: "); 
                    String nom = scanner.nextLine();
                    System.out.print("Identifiant: "); 
                    String identifiant = scanner.nextLine();
                    System.out.print("Mot de passe: "); 
                    String motDePasse = scanner.nextLine();
                    utilisateurs.add(new Utilisateurs(nom, identifiant, motDePasse));
                    System.out.println("Utilisateur ajouté avec succès !");
                    break;
                case 2:
                    System.out.print("Identifiant de l'utilisateur à supprimer: ");
                    String idSup = scanner.nextLine();
                    utilisateurs.removeIf(u -> u.getIdentifiant().equals(idSup));
                    System.out.println("Utilisateur supprimé !");
                    break;
                case 3:
                    System.out.println("Liste des utilisateurs:");
                    for (Utilisateurs u : utilisateurs) {
                        System.out.println(u);
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}

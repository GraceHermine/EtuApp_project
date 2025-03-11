package services;

import models.Professeurs;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionProfesseurs {
     private static ArrayList<Professeurs> professeurs = new ArrayList<>();

    public static void afficherMenuProfesseurs(Scanner scanner) {
        while (true) {
            System.out.println("\n======= GESTION DES PROFESSEURS =======");
            System.out.println("1: Ajouter un professeur");
            System.out.println("2: Supprimer un professeur");
            System.out.println("3: Lister les professeurs");
            System.out.println("4: Retour");
            System.out.print("\nVotre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: "); String nom = scanner.nextLine();
                    System.out.print("Prénom: "); String prenom = scanner.nextLine();
                    System.out.print("Spécialité: "); String specialite = scanner.nextLine();
                    professeurs.add(new Professeurs(nom, prenom, specialite));
                    System.out.println("Professeur ajouté avec succès !");
                    break;
                case 2:
                    System.out.print("Nom du professeur à supprimer: ");
                    String nomSup = scanner.nextLine();
                    professeurs.removeIf(p -> p.toString().contains(nomSup));
                    System.out.println("Professeur supprimé !");
                    break;
                case 3:
                    System.out.println("Liste des professeurs:");
                    for (Professeurs p : professeurs) System.out.println(p);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}

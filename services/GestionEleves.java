package services;

import java.util.ArrayList;
import java.util.Scanner;
import models.Eleve;

public class GestionEleves {
    private static ArrayList<Eleve> eleves = new ArrayList<>();

    public static void afficherMenuEleves(Scanner scanner) {
        while (true) {
            System.out.println("\n\t\t\t\t\t\t========================================");
            System.out.println("\t\t\t\t\t\t    GESTION DES ÉLÈVES");
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println("\t\t\t\t\t\tMenu:");
            System.out.println("1:\t\t\t\t\t\t Ajouter un élève");
            System.out.println("2:\t\t\t\t\t\t Supprimer un élève");
            System.out.println("3:\t\t\t\t\t\t Modifier les informations de l'élève");
            System.out.println("4:\t\t\t\t\t\t Lister les élèves");
            System.out.println("5:\t\t\t\t\t\t Obtenir le dernier élève ajouté");
            System.out.println("6:\t\t\t\t\t\t Retour");
            System.out.println("0:\t\t\t\t\t\t Accueil");

            System.out.print("\n\t\t\t\t\t\tVotre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom: "); String nom = scanner.nextLine();
                    System.out.print("Prénom: "); String prenom = scanner.nextLine();
                    System.out.print("Matricule: "); String matricule = scanner.nextLine();
                    eleves.add(new Eleve(nom, prenom, matricule));
                    System.out.println("Élève ajouté avec succès!");
                    break;
                case 2:
                    System.out.print("Matricule de l'élève à supprimer: ");
                    String matSup = scanner.nextLine();
                    eleves.removeIf(e -> e.matricule.equals(matSup));
                    System.out.println("Élève supprimé!");
                    break;
                case 3:
                    System.out.print("Matricule de l'élève à modifier: ");
                    String matMod = scanner.nextLine();
                    for (Eleve e : eleves) {
                        if (e.matricule.equals(matMod)) {
                            System.out.print("Nouveau nom: "); e.nom = scanner.nextLine();
                            System.out.print("Nouveau prénom: "); e.prenom = scanner.nextLine();
                            System.out.println("Informations modifiées!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Liste des élèves:");
                    for (Eleve e : eleves) System.out.println(e);
                    break;
                case 5:
                    if (!eleves.isEmpty()) System.out.println("Dernier élève: " + eleves.get(eleves.size() - 1));
                    else System.out.println("Aucun élève enregistré");
                    break;
                case 6: return;
                case 0: return;
                default: System.out.println("Choix invalide");
            }
        }
    }
}

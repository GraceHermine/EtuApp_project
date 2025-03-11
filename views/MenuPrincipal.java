package views;

import java.util.Scanner;

import services.GestionEleves;
import services.GestionProfesseurs;
import services.GestionUtilisateurs;

public class MenuPrincipal {
     public static void afficherMenuPrincipal(Scanner scanner) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("    BIENVENU DANS L'APPLICATION ETAB v1.1");
            System.out.println("========================================");
            System.out.println("MENU:");
            System.out.println("1: Gestion des élèves");
            System.out.println("2: Gestion des professeurs");
            System.out.println("3: Gestion des utilisateurs");
            System.out.println("0: Quitter");

            System.out.print("\nVotre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1: GestionEleves.afficherMenuEleves(scanner); break;
                case 2: GestionProfesseurs.afficherMenuProfesseurs(scanner); break;
                case 3: GestionUtilisateurs.afficherMenuUtilisateurs(scanner); break;
                case 0: System.out.println("Fermeture de l'application..."); return;
                default: System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}

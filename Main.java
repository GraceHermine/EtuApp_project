import java.util.Scanner;
import views.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean estConnecte = false;

        while (!estConnecte) {
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println("\t\t\t\t\t\t BIENVENUE DANS L'APPLICATION ETAB v1.1");
            System.out.println("\t\t\t\t\t\t========================================");
            System.out.println("\n\t\t\t\t\t\tCONNEXION\n");
            System.out.print("\t\t\t\t\t\tIdentifiant : ");
            String identifiant = scanner.nextLine();
            System.out.print("\t\t\t\t\t\tMot de passe : ");
            String motDePasse = scanner.nextLine();

            if (identifiant.equals("admin") && motDePasse.equals("1234")) {
                estConnecte = true;
                System.out.println("\nConnexion réussie !");
                MenuPrincipal.afficherMenuPrincipal(scanner);
            } else {
                System.out.println("\nIdentifiant ou mot de passe incorrect. Veuillez réessayer.\n");
            }
        }
        scanner.close();
    }
}

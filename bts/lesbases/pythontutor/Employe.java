// copier et coller sur https://pythontutor.com/java.html#mode=edit

import java.util.Scanner; // Gestion des entrées clavier

public class Employe {
    // Q1
    // Partie 1: Attributs, synataxe de création: <accesseur> <type> <identifiant>;
    private int code; // entier
    private String nom; // chaîne de caractères
    private String poste; // chaîne de caractères
    private double salaire; // nombre à virgule flottante

    // Q2
    // Partie 2: Les Methodes, 
    // synataxe de création: <accesseur> <type de retour> <identifiant>(<paramètres>, ...) { ... }
    
    public void initialise(int cod, String no, String post, double salair){
        System.out.println("[GUIDE] Initialisation des attributs de l'employé avec paramètres...");

        code = cod; // affectation
        nom = no;
        poste = post;
        salaire = salair;

        System.out.println("[GUIDE] L'employé est initialisé...");
    }

    // Q3
    public void insertNom(String no) {
        nom = no;
    }

    // Q3
    public String recupereNom() {
        return nom;
    }

    // Q5
    public void augmenterSalaire(double pourcentage) {
        if(pourcentage > 0){
            double montant = salaire * pourcentage / 100;
            salaire += montant; // salaire = salaire + montant;
        }else{
            System.out.println("Le pourcentage doit avoir une valeur positive...");
        }
    }

    // Q4
    public void afficherInfos() {
        System.out.println("[GUIDE] Affichage des infos de l'employé...");

        // in one statement
        System.out.println("Code: " + code + ", Nom: " + nom + ", Poste: " + poste + ", Salaire: " + salaire);
    }
    
    
        public static void main(String[] args) {
            System.out.println("[GUIDE] Programme de gestion des employés...");
            
            // Q7 Q8
            // Création des objets, syntaxe: <Type/Classe> <Identifiant> = new <Classe>();
            Employe E1 = new Employe();
            Employe E2 = new Employe();
    
            // En utilisant des valeurs littérales
            E1.initialise(101, "Alice", "Manager", 75000.0);
            E1.afficherInfos();
            
            // Q9 
            E1.insertNom("Layla");
            System.out.println("Le nouveau nom de l'employé est: " + E1.recupereNom());
    
            // Autrement
            String nouveauNom = E1.recupereNom();
            System.out.println("Le nouveau nom de l'employé est: " + nouveauNom);
    
            E1.augmenterSalaire(10);
    
            System.out.println("____ Apres augmentation du salaire de 10% _____");
            E1.afficherInfos();
    
            E2.initialise(102, "Bob", "Developer", 60000.0);
            E2.afficherInfos();
    
            int code = 1;
            String nom = "Boby";
            String poste = "Backend Developer";
            double salaire = 120000.0;
    
            E2.initialise(code, nom, poste, salaire);
            E2.afficherInfos();
        
    }
}

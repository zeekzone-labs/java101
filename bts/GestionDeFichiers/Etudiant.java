package src.com.gestion_de_fichier;

public class Etudiant {
    private int id;
    private String nom;
    private String filiere;

    // Constructeur: Pas de type de retour
    public Etudiant(int id, String nom, String filiere) {
        this.id = id;
        this.nom = nom;
        this.filiere = filiere;
    }

    public int calculerLaSomme(int a, int b) {
        int somme = a + b;
        return somme;   
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getFiliere() {
        return filiere;
    }

    public String toString() {
        return "Etudiant [id=" + id + ", nom=" + nom + ", filiere=" + filiere + "]";
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}

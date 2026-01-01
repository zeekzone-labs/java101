package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import src.com.gestion_de_fichier.Etudiant;

public class Main {
    public static void main(String[] args) {

        System.out.println("[GUIDE] Gestion des fichers étudiants...");

        // Etudiant e1 = saisieEtudiant();

        // Gestion de fichier: Store data in a text file Etudiants.txt
        // creerFichier("Etudiants.txt");

        // Write data in a text with FileWriter class
        // stockeretudiant(e1, "Etudiants.txt");

        // Read data in a text with FileReader class
        // lireEtudiants("Etudiants.txt");

        // Lecture caractere par caractere
        // lectureCharactereParCharactere("Etudiants.txt");

        // Copier un fichier binaire
        copierFichierBinaire("1.jpeg", "destination_image.jpeg");

    }

    private static void lireEtudiants(String string) {
        try {
            File fichier = new File(string);
            Scanner reader = new Scanner(fichier); // Scanner pour lire le fichier

            // lire header ID,Nom,Filiere
            String header = reader.nextLine();
            System.out.println(header);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();

                String[] parts = data.split(",");

                int id = Integer.parseInt(parts[0]);
                String nom = parts[1];
                String filiere = parts[2];

                Etudiant e = new Etudiant(id, nom, filiere);
                System.out.println(e);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Erreur lors de la lecture du fichier.");
            e.printStackTrace();
        }
    }

    private static Etudiant saisieEtudiant() {
        Scanner in = new Scanner(System.in); // Scanner pour la saisie clavier

        int id;
        String nom;
        String filiere;

        System.out.println("Entrez l'ID: ");
        id = in.nextInt();
        System.out.println("Entrez le nom: ");
        nom = in.next();
        System.out.println("Entrez la filiere: ");
        filiere = in.next();

        Etudiant e1 = new Etudiant(id, nom, filiere);

        System.out.println("Etudiant 1: " + e1);
        in.close();

        return e1;
    }

    private static void creerFichier(String nomFichier) {
        File fichier = new File(nomFichier);
        try {
            if (fichier.createNewFile()) {
                System.out.println("Fichier créé: " + fichier.getName());
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la création du fichier.");
            e.printStackTrace();
        }
    }

    private static void stockeretudiant(Etudiant e, String nomFichier) {
        try {
            FileWriter writer = new FileWriter(nomFichier, true);
            writer.write(e.getId() + "," + e.getNom() + "," + e.getFiliere() + "\n");
            writer.close();
            System.out.println("Données de l'étudiant stockées dans le fichier.");
        } catch (Exception ex) {
            System.out.println("Erreur lors de l'écriture dans le fichier.");
            ex.printStackTrace();
        }
    }

    private static void lectureCharactereParCharactere(String nomFichier) {
        try {
            FileInputStream fis = new FileInputStream(nomFichier);
            int caractere;
            while ((caractere = fis.read()) != -1) {
                // Convertir l'entier lu en caractère et l'afficher
                System.out.print((char) caractere);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier.");
            e.printStackTrace();
        }
    }

    private static void copierFichierBinaire(String source, String destination) {
        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            int octet;
            while ((octet = fis.read()) != -1) {
                fos.write(octet);
            }

            fis.close();
            fos.close();
            System.out.println("Fichier copié avec succès de " + source + " à " + destination);
        } catch (IOException e) {
            System.out.println("Erreur lors de la copie du fichier.");
            e.printStackTrace();
        }
    }
}
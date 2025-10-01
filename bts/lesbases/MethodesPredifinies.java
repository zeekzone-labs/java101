

public class MethodesPredifinies {
    public static void main(String[] args) {
        // Methodes predifinies de la class String
        String chaine = "Bonjour tout le monde"; // declaration et affectation de la chaine
        System.out.println(chaine);

        // Methode 1. Pour afficher la taille
        int len; // déclaration de la variable qui stocker la taille
        len = chaine.length(); // affectation de la taille de la chaine
        System.out.println("La taille de la chaine est: " + len);

        // Methode 2. Pour afficher recuperer une lettre/caractere de la chaine
        char lettre = chaine.charAt(0);
        System.out.println("La premiere lettre: " + lettre);
        System.out.println("La deuxieme lettre: " + chaine.charAt(1));
        System.out.println("La troisieme lettre: " + chaine.charAt(2));
        System.out.println("La quatrieme lettre: " + chaine.charAt(3));
        System.out.println("La cinquieme lettre: " + chaine.charAt(4));

        for (int i = 5; i < len; i++) {
            System.out.println("La " + (i + 1) + "-ieme lettre: " + chaine.charAt(i));
        }

        // Methode 3. Pour recuper une sous chaine de caracteres avec indice de debut
        String chaine2 = chaine.substring(8);
        System.out.println("La sous chaine est: " + chaine2);

        // Methode 4. Pour recuper une sous chaine de caracteres avec indice de debut et fin
        String chaine3 = chaine.substring(8, 11+1);
        System.out.println("La sous chaine est: " + chaine3);

        // Methode 5. Pour recuper l'indice de debut d'une sous chaine
        String tout = "tout";
        char caractere = 'l';
        int indexTout = chaine.indexOf(tout);
        int indexCaractere = chaine.indexOf(caractere);
        System.out.println("L'indice de debut de '"+ tout +"'' est: " + indexTout );
        System.out.println("L'indice de debut de '"+ caractere +"' est: " + indexCaractere );
    }

}

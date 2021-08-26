import java.util.*;

public class luhnChecksum {
    public static void main(String[] args) {

        Scanner scanTest = new Scanner(System.in);
        System.out.println("Entrez le code à tester.");
        String code = scanTest.nextLine();


        int x = 1;
        int resultat = 0;
        for (char ch : code.toCharArray()) {
            int a = Character.getNumericValue(ch);

            if (x % 2 == 0) {
                if (a >= 5) {
                    a = a * 2 - 9;
                } else {
                    a = a * 2;
                }
            }
            resultat = resultat + a;
            x++;

        }

        String additionCle = String.valueOf(resultat);
        int cleT = Character.getNumericValue(additionCle.charAt(additionCle.length() - 1));
        int cle = (0);
        if (cleT != 0) {
            cle = 10 - cleT;
        }


        System.out.println("Pour " + code + " le résultat de la formule de Luhn est " + resultat + " et la clé est donc " + cle + ".");

        System.out.println("Entrez la bonne clé.");
        int cleTestee = scanTest.nextInt();

        while (cleTestee != cle) {
            System.out.println("Mauvaise clé!");
            System.out.println("Entrez la bonne clé.");
            cleTestee = scanTest.nextInt();
        }
        System.out.println("C'est la bonne clé!");
    }

}

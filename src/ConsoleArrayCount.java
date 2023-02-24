import java.util.Scanner;

public class ConsoleArrayCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez les caractères: ");
        String chars = scanner.nextLine();
        char[] oneDim = chars.toCharArray();
        System.out.print("Quel est le caractère à recherché: ");
        char search = scanner.nextLine().toCharArray()[0];
        System.out.println("Le nombre d'occurence de " + search + " est " + countChar(oneDim, search));
    }

    /**
     * compte le nombre d'occurences d'un caractère dans un tableau de caractères
     * @param tab est le tableau de caractères
     * @param search est le caractère recherché
     * @return le nombre d'occurence
     */
    private static int countChar(char[] tab, char search) {
        int count = 0;
        for(char c : tab) {
            if (c == search) {
                ++count;
            }
        }
        return count;
    }
}

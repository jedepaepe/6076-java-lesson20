import java.util.Scanner;

public class ConsoleArrayCountSingleResponsibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez les caractères: ");
        String chars = scanner.nextLine();
        char[] oneDim = chars.toCharArray();
        System.out.print("Quel est le caractère à recherché: ");
        char search = scanner.nextLine().toCharArray()[0];
        System.out.println("Le nombre d'occurence de " + search + " est " + CharArrayUtil.countChar(oneDim, search));
    }

}

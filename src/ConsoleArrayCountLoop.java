import java.util.Scanner;

public class ConsoleArrayCountLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez les caractères: ");
        String chars = scanner.nextLine();
        char[] oneDim = chars.toCharArray();
        String command;
        do {
            System.out.print("Quel est le caractère à recherché (ou 'stop' pour arrêter): ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) break;
            char search = command.toCharArray()[0];
            System.out.println("Le nombre d'occurence de " + search + " est " + CharArrayUtil.countChar(oneDim, search));
        } while(true);
    }

}

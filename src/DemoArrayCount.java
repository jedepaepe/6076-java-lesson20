import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * classe pour montrer comme rechercher le nombre de caractères dans un tableau de caractères
 */
public class DemoArrayCount {

    public static void main(String[] args) {
        char[] oneDim = new char[] { 'a', 'b', 'a', 'c', 'b', 'a' };
        // comment calculer le nombre de 'a', 'b', 'c'
        System.out.println("nr de a " + countChar(oneDim, 'a'));
        System.out.println("nr de b " + countChar(oneDim, 'b'));
        System.out.println("nr de c " + countChar(oneDim, 'c'));
        System.out.println("nr de d " + countChar(oneDim, 'd'));
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

    /***
     * compte le nombre d'occurences d'un caractère dans un tableau de caractères
     * (autre manière de calculer)
     * @param tab est le tableau de caractères
     * @param search est le caractère recherché
     * @return le nombre d'occurence
     */
    private static int shortCountChar(char[] tab, char search) {
        // tab.length retourne le nombre de caractères dans le tableau
        // new String crée une string à partir du tableau
        // "" + search convertit notre caractère en une String
        // replaceAll("" + search, "") supprime toutes les occurances de search dans la String
        // .length() retourne le nombre de caractère dans la String
        // le nombre d'occcurence est la différence
        return tab.length - new String(tab).replaceAll("" + search, "").length();
    }

    /***
     * compte le nombre d'occurences d'un caractère dans un tableau de caractères
     * (autre manière de calculer)
     * @param tab est le tableau de caractères
     * @param search est le caractère recherché
     * @return le nombre d'occurence
     */
    private static int streamCountChar(char[] tab, char search) {
        // IntStream.range(0, tab.length) crée un stream d'entiers commençant par 0 et de longuer tab.length
        // mapToObjec(i -> tab[i]) transforme (map) l'entier (0, 1, 2, ...) en un caractère (tab[0], tab[1], tab[2] ...)
        //      et retourne donc un stream de Character
        // filter(c -> c == search) filtre : retourne un stream ne contenant que des caractères search
        // count() retourne le nombre d'élément "dans" le stream
        return (int) IntStream.range(0, tab.length).mapToObj(i -> tab[i]).filter(c -> c == search).count();
    }
}

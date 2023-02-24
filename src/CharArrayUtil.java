public class CharArrayUtil {
    /**
     * compte le nombre d'occurences d'un caractère dans un tableau de caractères
     * @param tab est le tableau de caractères
     * @param search est le caractère recherché
     * @return le nombre d'occurence
     */
    public static int countChar(char[] tab, char search) {
        int count = 0;
        for(char c : tab) {
            if (c == search) {
                ++count;
            }
        }
        return count;
    }
}

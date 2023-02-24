/**
 * montre comment compter le nombre d'occurences d'un caractère dans un tableau de caractère
 */
public class Demo2DimArrayCount {
    public static void main(String[] args) {
        char[][] tictactoe = new char[][] {
                { '-', 'X', 'O' },
                { '-', 'X', '-' },
                { '-', 'O', '-' }
        };

        for(char[] line : tictactoe) {
            System.out.println("" + line[0] + line[1] + line[2]);
        }

        int nrX = countChar(tictactoe, 'X');
        System.out.println(nrX);
    }

    /**
     * compte le nombre d'occurence d'un caractère dans un tableau à deux dimension
     * @param twoDimTab est le tableau à deux dimensions
     * @param search est le caractère recherché
     * @return le nombre d'occurence du caractère recherché dans le tableau
     */
    private static int countChar(char[][] twoDimTab, char search) {
        int count = 0;
        for(char[] line : twoDimTab) {
            for(char c : line) {
                if (c == search) {
                    ++count;
                }
            }
        }
        return count;
    }
}

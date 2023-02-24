import java.util.Scanner;

public class TicTacToeBasicX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] state = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' },
        };

        do {
            showBoard(state);
            doStep(state, scanner);
        } while(! isTerminated(state));
        showResult(state);
        scanner.close();
    }

    private static void showBoard(char[][] state) {
        for (int i = 0; i < state.length; ++i) {
            System.out.println("" + state[i][0] + state[i][1] + state[i][2]);
        }
    }

    private static void doStep(char[][] state, Scanner scanner) {
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        state[line][column] = isX(state) ? 'X' : 'O';
    }

    /**
     * calcule quel joueur doit jouer (X ou O)
     * @param state la valeur des cases du tic tac toe
     * @return true si c'est à X de jouer, false si c'est à O de jouer
     */
    private static boolean isX(char[][] state) {
        int nrX = countChar(state, 'X');
        int nrO = countChar(state, 'O');
        return nrX == nrO;
    }

    /**
     * compte le nombre d'occurences d'un caractère dans un tableau à deux dimensions
     * @param twoDimTab est le tableau à deux dimensions
     * @param search est le caractère recherché
     * @return le nombre d'occurence
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

    private static boolean isTerminated(char[][] state) {
        return false;
    }

    private static void showResult(char[][] state) {
    }
}
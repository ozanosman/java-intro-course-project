/**
 * Клас съдържащ методи за стартиране на играта и избиране на първи играч.
 *
 * @author Озан Осман
 */
public class Application extends Player
{
    /**
     * Метод, който стартира играта.
     *
     * @author Озан Осман
     */
    protected void renderGame()
    {
        gameBoardSymbols();

        System.out.println("Играта започва!\nВажно!\nИграч едно се отбелязва с '1'!\nИграч две се отбелязва с '2'!");

        renderStartingPlayer();
    }

    /**
     * Метод, избир първия на ход играч.
     *
     * @author Озан Осман
     */
    private void renderStartingPlayer()
    {
        int startingPlayer = random.nextInt(2) + 1;

        System.out.print("\nПърви започва: ");

        if (startingPlayer != 1)
        {
            System.out.println("Играч 1\n");
            pickPlayerTurn(player2);
            return;
        }

        System.out.println("Играч 2\n");
        pickPlayerTurn(player1);
    }
}

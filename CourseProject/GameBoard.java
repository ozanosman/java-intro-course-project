import java.util.Random;

/**
 * Клас съдържащ методи за създаването на игралното поле и елементите му.
 *
 * @author Озан Осман
 */
public class GameBoard extends SquareSymbols
{
    protected static SquareSymbols[] symbols = new SquareSymbols[20];
    protected static SquareSymbols[] traps = new SquareSymbols[7];

    protected static Random random = new Random();

    /**
     * Метод, който случайно търси позиции за елементите("Start", "Trap", "Invest", "Party", "Chance", "Steal")
     * в масива докато всички не са в него.
     *
     * @author Озан Осман
     */
    protected static void gameBoardSymbols()
    {
        for (int i = 0; i < 7; i++)
        {
            traps[i] = new SquareSymbols();
            traps[i].squareTrap();
        }

        for (int i = 0; i < 20; i++)
        {
            symbols[i] = new SquareSymbols();
        }

        symbols[19].squareStart();

        while (true)
        {
            int position = random.nextInt(19);

            if (symbols[position].isEmpty && numberOfInvest > 0)
            {
                symbols[position].squareInvest();
                numberOfInvest--;
                continue;
            }

            if (symbols[position].isEmpty && numberOfParty > 0)
            {
                symbols[position].squareParty();
                numberOfParty--;
                continue;
            }

            if (symbols[position].isEmpty && numberOfChance > 0)
            {
                symbols[position].squareChance();
                numberOfChance--;
                continue;
            }

            if (symbols[position].isEmpty && numberOfSteal > 0)
            {
                symbols[position].squareSteal();
                numberOfSteal--;
                continue;
            }

            if (symbols[position].isEmpty && numberOfTrap > 0)
            {
                symbols[position] = traps[numberOfTrap - 1];
                numberOfTrap--;
                continue;
            }

            if (numberOfTrap == 0)
            {
                break;
            }
        }
    }

    /**
     * Метод, който принтира игралното поле с останалите му нужни елементи.
     *
     * @author Озан Осман
     */
    protected static void renderGameBoard()
    {
        System.out.println(FULL_LINE);

        for (int i = 0; i < 20; i++)
        {
            if (i == Player.player1.position && i == Player.player2.position)
            {
                System.out.print(symbols[i].symbolIndex + BOTH_PLAYER_POSITION);
            }
            else if (i == Player.player1.position)
            {
                System.out.print(symbols[i].symbolIndex + PLAYER1_POSITION);
            }
            else if (i == Player.player2.position)
            {
                System.out.print(symbols[i].symbolIndex + PLAYER2_POSITION);
            }
            else
            {
                System.out.print(symbols[i].symbolIndex + EMPTY_POSITION);
            }

            if (i == 7 || i == 9 || i == 11)
            {
                System.out.println();
            }

            if (i == 8 || i == 10)
            {
                System.out.print(EMPTY_LINE);
            }
        }

        System.out.println();
        System.out.println(FULL_LINE);
    }
}

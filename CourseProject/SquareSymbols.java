/**
 * Клас съдържащ методи за създаването на типа на квадратчетата и останалите елементи.
 *
 * @author Озан Осман
 */
public class SquareSymbols
{
    protected String symbolName;
    protected String symbolIndex;

    protected boolean isEmpty = true;

    protected static int numberOfTrap = 7;
    protected static int numberOfInvest = 3;
    protected static int numberOfParty = 3;
    protected static int numberOfChance = 3;
    protected static int numberOfSteal = 3;

    protected static final String BOTH_PLAYER_POSITION = "12|";
    protected static final String PLAYER1_POSITION = " 1|";
    protected static final String PLAYER2_POSITION = " 2|";
    protected static final String EMPTY_POSITION = "  |";

    protected static final String EMPTY_LINE = "                                          ";
    protected static final String FULL_LINE = "--------------------------------------------------------";

    /**
     * Метод, който се задава като квадратчето "Start".
     *
     * @author Озан Осман
     */
    protected void squareStart()
    {
        symbolName = "Start";

        symbolIndex = "|S  ";
    }

    /**
     * Метод, който се задава като квадратчето "Trap".
     *
     * @author Озан Осман
     */
    protected void squareTrap()
    {
        symbolName = "Trap";

        symbolIndex = "|T  ";

        isEmpty = false;
    }

    /**
     * Метод, който се задава като квадратчето "Invest".
     *
     * @author Озан Осман
     */
    protected void squareInvest()
    {
        symbolName = "Invest";

        symbolIndex = "|I  ";

        isEmpty = false;
    }

    /**
     * Метод, който се задава като квадратчето "Party".
     *
     * @author Озан Осман
     */
    protected void squareParty()
    {
        symbolName = "Party";

        symbolIndex = "|P  ";

        isEmpty = false;
    }

    /**
     * Метод, който се задава като квадратчето "Chance".
     *
     * @author Озан Осман
     */
    protected void squareChance()
    {
        symbolName = "Chance";

        symbolIndex = "|C  ";

        isEmpty = false;
    }

    /**
     * Метод, който се задава като квадратчето "Steal".
     *
     * @author Озан Осман
     */
    protected void squareSteal()
    {
        symbolName = "Steal";

        symbolIndex = "|St ";

        isEmpty = false;
    }
}

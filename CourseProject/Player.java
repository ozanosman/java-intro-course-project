import java.util.Scanner;

/**
 * Клас съдържащ методи за избиране на играч, движение на играч, проверка
 * къде е стъпил играча, проверка дали на играча са му останали пари, колко
 * пари има играча и продължение на играта.
 *
 * @author Озан Осман
 */
public class Player extends GameBoard
{
    protected static Scanner userInput = new Scanner(System.in);

    protected static Player player1 = new Player();
    protected static Player player2 = new Player();

    protected int name;
    protected int chocolateCoins = 1000;
    protected int position = 19;

    /**
     * Метод, който първо ни препраща към метода за проверка дали на играча са останали пари, ако
     * играта продължи се сменя играча, който е на ход.
     *
     * @author Озан Осман
     */
    protected static void pickPlayerTurn(Player player)
    {
        player1.name = 1;
        player2.name = 2;

        renderCheckPlayerMoney(player);

        if (player.name == 1)
        {
            player2.playerMovement();
            return;
        }

        player1.playerMovement();
    }

    /**
     * Метод, който придвижва играчите. Използва едномерен масив, с дадени условия чрез който може
     * да открие каква трябва да бъде позицията на играча.
     *
     * @author Озан Осман
     */
    protected void playerMovement()
    {
        int dice = random.nextInt(2) + 1;

        if (position > 13)
        {
            position -= dice;
        }
        else if (position >= 0 && position < 6)
        {
            position += dice;
        }
        else
        {
            switch (position)
            {
                case 13: position = dice == 1 ? 12 : 10;
                    break;

                case 12: position = dice == 1 ? 10 : 8;
                    break;

                case 10: position = dice == 1 ? 8 : 0;
                    break;

                case 8: position = dice == 1 ? 0 : 1;
                    break;

                case 6: position = dice == 1 ? 7 : 9;
                    break;

                case 7: position = dice == 1 ? 9 : 11;
                    break;

                case 9: position = dice == 1 ? 11 : 19;
                    break;

                case 11: position = 19;
            }
        }

        renderGameBoard();
        renderCheckSquareType();
    }

    /**
     * Метод, който проверява на какъв тип квадратче е попаднал играча и ни изпълнява определени
     * методи според типа на квадратчето.
     *
     * @author Озан Осман
     */
    private void renderCheckSquareType()
    {
        if (name == 1)
        {
            System.out.println("\nИграч 1 попадна на квадратчето: " + symbols[position].symbolName);
        }
        else
        {
            System.out.println("\nИграч 2 попадна на квадратчето: " + symbols[position].symbolName);
        }

        switch (symbols[position].symbolName)
        {
            case "Start": StartSystem.renderStartSystem(this);
                renderContinue();
                break;

            case "Trap": TrapSystem.renderTrapSystem(this);
                renderContinue();
                break;

            case "Invest": InvestSystem.renderInvestSystem(this);
                renderContinue();
                break;

            case "Party": PartySystem.renderPartySystem(this);
                renderContinue();
                break;

            case "Chance": ChanceSystem.renderChanceSystem(this);
                renderContinue();
                break;

            case "Steal": StealSystem.renderStealSystem(this);
                renderContinue();
                break;
        }
    }

    /**
     * Метод, който проверява дали играча е загубил всичките си парички.
     *
     * @author Озан Осман
     */
    private static void renderCheckPlayerMoney(Player player)
    {
        if (player.chocolateCoins < 1)
        {
            if (player.name == 1)
            {
                System.out.println("\nИграч 1 загуби всичките си шоколадови парички!\nТой губи играта!");
            }
            else
            {
                System.out.println("\nИграч 2 загуби всичките си шоколадови парички!\nТой губи играта!");
            }

            System.exit(0);
        }
    }

    /**
     * Метод, който показва общите пари на играча.
     *
     * @author Озан Осман
     */
    protected static void renderPlayerTotalMoney(Player player)
    {
        if (player.name == 1)
        {
            System.out.println("\nИграч 1 има общо " + player.chocolateCoins + " шоколадови парички!");
        }
        else
        {
            System.out.println("\nИграч 2 има общо " + player.chocolateCoins + " шоколадови парички!");
        }
    }

    /**
     * Метод, който пита за продължение на играта.
     *
     * @author Озан Осман
     */
    protected void renderContinue()
    {
        System.out.println("\nПродължение?\n1 за Да\n2 за Изход");

        int userChoice = userInput.nextInt();

        switch (userChoice)
        {
            case 1: Player.pickPlayerTurn(this);
                break;

            case 2: System.out.println("\nЗатваря се...");
                System.exit(0);

            default: System.err.println("\nГрешен избор!\nОпитайте отново!");
                renderContinue();
        }
    }
}

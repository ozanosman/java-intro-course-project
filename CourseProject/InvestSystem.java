/**
 * Клас съдържащ метод за квадратчето "Invest".
 *
 * @author Озан Осман
 */
public class InvestSystem extends Player
{
    protected static void renderInvestSystem(Player player)
    {
        System.out.println("\nИскате ли да инвестирате?\n1 за Да\n2 за Не");

        int userChoice = userInput.nextInt();

        switch (userChoice)
        {
            case 1: renderInvestChoices(player);
                break;

            case 2: System.out.println("\nВие не обичате риска!");
                break;

            default: System.err.println("\nГрешен избор!\nОпитайте отново!");
                renderInvestSystem(player);
        }
    }

    private static void renderInvestChoices(Player player)
    {
        System.out.println("\nКъде искате да инвестирате?\n1 за \"Evel Co\"\n2 за \"Bombs Away\"\n3 за \"Macrosoft\"\n4 за Изход");

        int userChoice = userInput.nextInt();

        switch (userChoice)
        {
            case 1: player.chocolateCoins +=150;
                renderPlayerTotalMoney(player);
                break;

            case 2: player.chocolateCoins +=125;
                renderPlayerTotalMoney(player);
                break;

            case 3: player.chocolateCoins +=175;
                renderPlayerTotalMoney(player);
                break;

            case 4: System.out.println("\nВие не харесахте компаниите!");
                break;

            default: System.err.println("\nГрешен избор!\nОпитайте отново!");
                renderInvestChoices(player);
        }
    }
}

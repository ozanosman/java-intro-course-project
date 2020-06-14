/**
 * Клас съдържащ метод за квадратчето "Chance".
 *
 * @author Озан Осман
 */
public class ChanceSystem extends Player
{
    protected static void renderChanceSystem(Player player)
    {
        System.out.println("\nИскате ли да си пробвате късмета?\n1 за Да\n2 за Не");

        int userChoice = userInput.nextInt();

        switch (userChoice)
        {
            case 1: chancePicker(player);
                break;

            case 2: System.out.println("\nВие не обичате риска!");
                break;

            default: System.err.println("\nГрешен избор!\nОпитайте отново!");

        }
    }

    private static void chancePicker(Player player)
    {
        int chanceDecider = random.nextInt(10) + 1;

        if (chanceDecider % 2 == 0)
        {
            System.out.println("\nВие спечелихте!");
            chancePickerPositive(player);
        }
        else
        {
            System.out.println("\nВие загубихте!");
            chancePickerNegative(player);
        }
        renderPlayerTotalMoney(player);
    }

    private static void chancePickerPositive(Player player)
    {
        int randomNumber = random.nextInt(101) + 1;

        if (randomNumber < 40)
        {
            player.chocolateCoins -=50;
        }

        if (randomNumber > 39 && randomNumber < 66)
        {
            player.chocolateCoins -=100;
        }

        if (randomNumber > 65 && randomNumber < 80)
        {
            player.chocolateCoins -=150;
        }

        if (randomNumber > 79 && randomNumber < 95)
        {
            player.chocolateCoins -=200;
        }

        if (randomNumber > 94)
        {
            player.chocolateCoins -=250;
        }
    }

    private static void chancePickerNegative(Player player)
    {
        int randomNumber = random.nextInt(101) + 1;

        if (randomNumber < 40)
        {
            player.chocolateCoins +=50;
        }

        if (randomNumber > 39 && randomNumber < 66)
        {
            player.chocolateCoins +=100;
        }

        if (randomNumber > 65 && randomNumber < 80)
        {
            player.chocolateCoins +=150;
        }

        if (randomNumber > 79 && randomNumber < 95)
        {
            player.chocolateCoins +=200;
        }

        if (randomNumber > 94)
        {
            player.chocolateCoins +=250;
        }
    }
}

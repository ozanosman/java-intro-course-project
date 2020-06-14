/**
 * Клас съдържащ метод за квадратчето "Steal".
 *
 * @author Озан Осман
 */
public class StealSystem extends Player
{
    protected static void renderStealSystem(Player player)
    {
        System.out.println("\nИскате ли да откраднете пари от народа?\n1 за Да\n2 за Не");

        int userChoice = userInput.nextInt();

        switch (userChoice)
        {
            case 1: player.chocolateCoins +=100;
                System.out.println("\nВие откраднахте от народа 100 шоколадови парички!");
                renderPlayerTotalMoney(player);
                break;

            case 2: System.out.println("\nВие сте добър човек!");
                break;

            default: System.err.println("\nГрешен избор!\nОпитайте отново!");
                renderStealSystem(player);
        }
    }
}

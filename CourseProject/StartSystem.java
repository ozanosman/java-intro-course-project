/**
 * Клас съдържащ метод за квадратчето "Start".
 *
 * @author Озан Осман
 */
public class StartSystem extends Player
{
    protected static void renderStartSystem(Player player)
    {
        if (player.name == 1)
        {
            System.out.println("\nИграч 1 е на старта");
        }
        else
        {
            System.out.println("\nИграч 2 е на старта");
        }

        renderPlayerTotalMoney(player);
    }
}

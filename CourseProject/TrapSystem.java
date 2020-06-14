/**
 * Клас съдържащ метод за квадратчето "Trap".
 *
 * @author Озан Осман
 */
public class TrapSystem extends Player
{
    protected static void renderTrapSystem(Player player)
    {
        if (player.name == 1)
        {
            System.out.println("\nИграч 1 може да е заложил капан тука!");
        }
        else
        {
            System.out.println("\nИграч 2 може да е заложил капан тука!");
        }
    }
}

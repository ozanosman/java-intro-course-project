/**
 * Клас съдържащ метод за квадратчето "Party".
 *
 * @author Озан Осман
 */
public class PartySystem extends Player
{
    protected static void renderPartySystem(Player player)
    {
        player.chocolateCoins -= 25;

        if (player.name == 1)
        {
            System.out.println("\nИграч 1 организира купон за да се отпусне от живота, но той загуби 25 шоколадови парички.\nОстава с: " + player.chocolateCoins);
        }
        else
        {
            System.out.println("\nИграч 2 организира купон за да се отпусне от живота, но той загуби 25 шоколадови парички.\nОстава с: " + player.chocolateCoins);
        }
    }
}

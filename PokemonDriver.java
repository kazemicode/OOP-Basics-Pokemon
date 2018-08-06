
/**
 * This is a program that uses the Pokemon class to create new Pokemon
 * Objects! Instantiate (create) three different Pokemon other than the 
 * sample below. Then, call the attack() method for each of your Pokemon.
 */
public class PokemonDriver
{
    public static void main(String[] args)
    {
        // creates a new Pokemon object with the name Pikachu and the 
        // attack Thunderbolt
        Pokemon p1 = new Pokemon("Pikachu", "Thunderbolt");
        
        // Calls the fight() method declared in the Pokemon class
        // Notice that the identifier (p1) comes before the method.
        p1.fight();
        
        // Create three more Pokemon objects below.
        
        // Call the fight() method for each new Pokemon object you created
    }
}


/**
 * Class Pokemon creates a Pokemon object with a name and an attack
 * 
 * @author CSA 2018-19
 * @version 1.0
 */
public class Pokemon
{
    // instance variables 
    private String name;
    private String attack;

    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon(String myName, String myAttack)
    {
        
        name = myName;
        attack = myAttack;
    }

    /**
     * fight method -- prints name and attack
     * 
     * @param  none
     * @return void (nothing)
     */
    public void fight()
    {
        
        System.out.println(name + " uses " + attack +"!");
    }
}

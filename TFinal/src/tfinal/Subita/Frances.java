
package tfinal.Subita;

/**
 *
 * @author Lobo
 */
public class Frances implements Language
{
    
    public String getPuntos(int points)
    {
        String[] words={"ZERO","QUINZE","TRENTE","QUARANTE"};
        return words[points];
    }
    public String getDeuce()
    {
        return "ATTACHER";
    }
    public String getAll()
    {
        return "À";
    }
    public String getAdvantage()
    {
        return "AVANTAGE JOUEUR ";
    }
    public String getWin()
    {
        return "GAGNE JOUEUR ";
    }
}

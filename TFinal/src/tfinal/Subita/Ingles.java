
package tfinal.Subita;

/**
 *
 * @author Lobo
 */
public class Ingles implements Language
{
    
    public String getPuntos(int points)
    {
        String[] words={"LOVE","FIFTEEN","THIRTY","FORTY"};
        return words[points];
    }
    public String getDeuce()
    {
        return "DEUCE";
    }
    public String getAll()
    {
        return "ALL";
    }
    public String getAdvantage()
    {
        return "ADVANTAGE PLAYER ";
    }
    public String getWin()
    {
        return "WINS PLAYER ";
    }
}

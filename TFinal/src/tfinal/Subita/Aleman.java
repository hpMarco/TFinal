
package tfinal.Subita;

/**
 *
 * @author Lobo
 */
public class Aleman implements Language,Language2{
    
    public String getPuntos(int points){
        String[] words={"LIEBE","FÜNZEHN","DREBIG","VIERZING"};
        return words[points];
    }
    public String getDeuce(){
        return "ZIEHEN";
    }
    public String getAll(){
        return "ALLE";
    }
    public String getAdvantage(){
        return "SPIELER BEWEGT SICH ";
    }
    public String getWin(){
        return "SPIELER GEWINNT ";
    }

    
}

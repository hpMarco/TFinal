package tfinal.Subita;
/**
 *
 * @author Lobo
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Raqueta1 
{
	private static final int z = 330;
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;
	int x = 150;
	int xa = 0;
        
	private JuegoGrap game;

	public Raqueta1(JuegoGrap game) 
        {
		this.game = game;
	}

	public void move() 
        {
		if (x + xa > 1 && x + xa < game.getWidth() - WIDTH)
			x = x + xa;    
	}

	public void paint(Graphics2D g) 
        {
		g.fillRect(x, z, WIDTH, HEIGHT);
	}

	public void keyReleased(KeyEvent e) 
        {
		xa = 0;  
	}

	public void keyPressed(KeyEvent e) 
        {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;       
	}

	public Rectangle getBounds() 
        {
		return new Rectangle(x, z, WIDTH, HEIGHT);
	}

	public int getTopY() 
        {
		return z;
	}
}
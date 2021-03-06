package tfinal.Subita;
/**
 *
 * @author Lobo
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JuegoGrap extends JPanel 
{

	Ball ball = new Ball(this);
	Raqueta1 racquet1 = new Raqueta1(this);
        Raqueta2 racquet2 = new Raqueta2(this);
        
        //public void Game2() {}

	public JuegoGrap() {
		addKeyListener(new KeyListener() 
                {
			@Override
			public void keyTyped(KeyEvent e) 
                        {
			}

			@Override
			public void keyReleased(KeyEvent e) 
                        {
				racquet1.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) 
                        {
				racquet1.keyPressed(e);
			}
		});
		setFocusable(true);
                
                //Evento para controlar la 2 raqueta//
                addKeyListener(new KeyListener() 
                {
			@Override
			public void keyTyped(KeyEvent e) 
                        {
			}

			@Override
			public void keyReleased(KeyEvent e) 
                        {
				racquet2.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) 
                        {
				racquet2.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	void move() 
        {
		ball.move();
		racquet1.move();
                racquet2.move();
	}

	@Override
	public void paint(Graphics g) 
        {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
		racquet1.paint(g2d);
                racquet2.paint(g2d);

	}

	public static void main(String[] args) throws InterruptedException 
        {
		JFrame frame = new JFrame("Mini Tennis");
		JuegoGrap game = new JuegoGrap();
		frame.add(game);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		while (true) 
                {
			game.move();
			game.repaint();
			Thread.sleep(7);
		}		
	}
}
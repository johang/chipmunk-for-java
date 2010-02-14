package johang.chipmunk.demo1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;

	private List<Drawable> drawables;

	private Dimension dimension;

	public Panel(List<Drawable> ds, Dimension d) {
		drawables = ds;
		dimension = d;

		setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawDrawables((Graphics2D) g);
	}

	private void drawDrawables(Graphics2D g2d) {
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		for (Drawable d : drawables) {
			d.draw(g2d);
		}
	}

	public Dimension getPreferredSize() {
		return dimension;
	}
}

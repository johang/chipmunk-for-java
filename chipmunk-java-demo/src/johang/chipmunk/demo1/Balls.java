package johang.chipmunk.demo1;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import johang.chipmunk.reusable.SuperSpace;

public class Balls {
	public static void main(String[] args) {
		System.loadLibrary("chipmunk-jni");

		SuperSpace space = new SuperSpace();

		Dimension fs = new Dimension(2*320, 2*240);

		List<Drawable> balls = new ArrayList<Drawable>();

		for (int i = 0; i < 10; i++) {
			float r = (float) (Math.random() * 30 + 10);

			float x = (float) (Math.random() * (fs.width - r)) + r;
			float y = (float) (Math.random() * (fs.height - r)) + r;
			float dx = (float) (Math.random() * 200) - 100;
			float dy = (float) (Math.random() * 200) - 100;

			Ball b1 = new Ball(x, y, dx, dy, r);
			balls.add(b1);
			space.addShape(b1.getShape());
			space.addBody(b1.getBody());
		}

		Border border = new Border(0, 0, fs.width, fs.height);

		Panel p = new Panel(balls, fs);

		space.addStaticShape(border.getCompositeShape());

		space.setGravity(0, 0);
		space.setIterations(10);
		space.resizeStaticHash(30.0f, 1000);
		space.resizeActiveHash(30.0f, 1000);

		JFrame f = new JFrame();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(p);
		f.pack();
		f.setVisible(true);

		try {
			int fps = 15;
			float dt = 1.0f / fps;
			long dtl = 1000 / fps;
			long t0, t1;

			while (true) {
				t0 = System.currentTimeMillis();

				space.step(dt);
				p.repaint();

				t1 = System.currentTimeMillis();

				long s = dtl - (t1 - t0);

				if (s > 0) {
					Thread.sleep(s);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// space.freeChildren();
		// space.free();
	}
}

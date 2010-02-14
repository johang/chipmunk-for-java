package johang.chipmunk.demo1;

import java.awt.Graphics2D;

import johang.chipmunk.Body;
import johang.chipmunk.reusable.CompositeShape;
import johang.chipmunk.reusable.ShallowBoxShape;

public class Border implements Drawable {
	private ShallowBoxShape shape;

	private Body body;

	public Border(float x1, float y1, float x2, float y2) {
		body = new Body(Float.MAX_VALUE, Float.MAX_VALUE);

		shape = new ShallowBoxShape(body, x1, y1, x2, y2, 50);

		shape.setE(1.0f);
		shape.setU(0.0f);
	}

	public Body getBody() {
		return body;
	}

	public CompositeShape getCompositeShape() {
		return shape;
	}

	public void draw(Graphics2D g2d) {
	}
}

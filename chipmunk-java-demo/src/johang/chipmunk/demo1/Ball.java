package johang.chipmunk.demo1;

import java.awt.Color;
import java.awt.Graphics2D;

import johang.chipmunk.Body;
import johang.chipmunk.Chipmunk;
import johang.chipmunk.CircleShape;
import johang.chipmunk.Shape;

public class Ball implements Drawable {
	private CircleShape shape;

	private Body body;

	public Ball(float x, float y, float dx, float dy, float r) {
		float mass = (float) (r * r * Math.PI);

		body = new Body(mass, Chipmunk.momentForCircle(mass, r, 0, x, y));

		body.setPosition(x, y);
		body.setVelocity(dx, dy);

		shape = new CircleShape(body, r, 0, 0);

		shape.setE(1.0f);
		shape.setU(0.0f);
	}

	public Body getBody() {
		return body;
	}

	public Shape getShape() {
		return shape;
	}

	public void draw(Graphics2D g2d) {
		int x = Math.round(body.getPositionX());
		int y = Math.round(body.getPositionY());
		int radius = Math.round(shape.getRadius());
		g2d.setColor(Color.GREEN.darker().darker());
		g2d.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
	}
}

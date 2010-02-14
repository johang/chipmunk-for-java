package johang.chipmunk.reusable;

import java.util.ArrayList;
import java.util.List;

import johang.chipmunk.Body;
import johang.chipmunk.Shape;
import johang.chipmunk.Space;

abstract public class CompositeShape {
	private Body body;

	protected List<Shape> shapes;

	public CompositeShape(Body b) {
		body = b;

		shapes = new ArrayList<Shape>();
	}

	public Body getBody() {
		return body;
	}

	public void addStaticShapes(Space space) {
		for (Shape s : shapes) {
			space.addStaticShape(s);
		}
	}

	public void addShapes(Space space) {
		for (Shape s : shapes) {
			space.addShape(s);
		}
	}

	public void removeStaticShapes(Space space) {
		for (Shape s : shapes) {
			space.removeStaticShape(s);
		}
	}

	public void removeShapes(Space space) {
		for (Shape s : shapes) {
			space.removeShape(s);
		}
	}

	public void setU(float u) {
		for (Shape s : shapes) {
			s.setU(u);
		}
	}

	public void setE(float e) {
		for (Shape s : shapes) {
			s.setE(e);
		}
	}
}

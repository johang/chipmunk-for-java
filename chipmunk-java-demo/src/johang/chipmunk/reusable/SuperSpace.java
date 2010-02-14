package johang.chipmunk.reusable;

import johang.chipmunk.Space;

public class SuperSpace extends Space {
	public SuperSpace() {
		super();
	}

	public void addStaticShape(CompositeShape shape) {
		shape.addStaticShapes(this);
	}

	public void addShape(CompositeShape shape) {
		shape.addShapes(this);
	}

	public void removeStaticShape(CompositeShape shape) {
		shape.removeStaticShapes(this);
	}

	public void removeShape(CompositeShape shape) {
		shape.removeShapes(this);
	}
}

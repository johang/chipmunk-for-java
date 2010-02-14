package johang.chipmunk.reusable;

import johang.chipmunk.Body;
import johang.chipmunk.SegmentShape;

public class ShallowBoxShape extends CompositeShape {
	public ShallowBoxShape(Body b, float x1, float y1, float x2, float y2,
			float r) {
		super(b);

		shapes.add(new SegmentShape(b, x2 + r, y2 + r, x2 + r, y1 - r, r));
		shapes.add(new SegmentShape(b, x2 + r, y1 - r, x1 - r, y1 - r, r));
		shapes.add(new SegmentShape(b, x1 - r, y1 - r, x1 - r, y2 + r, r));
		shapes.add(new SegmentShape(b, x1 - r, y2 + r, x2 + r, y2 + r, r));
	}
}

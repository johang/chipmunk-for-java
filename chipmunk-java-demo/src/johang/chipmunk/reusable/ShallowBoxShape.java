/*
 * Chipmunk for Java
 * Java bindings for the Chipmunk 2D physics library
 *
 * http://github.com/johang/chipmunk-for-java
 *
 * Copyright 2010, Johan Gunnarsson, johan.gunnarsson@gmail.com
 *
 * Chipmunk for Java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Chipmunk for Java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Chipmunk for Java.  If not, see <http://www.gnu.org/licenses/>.
 */

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

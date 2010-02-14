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

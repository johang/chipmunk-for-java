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

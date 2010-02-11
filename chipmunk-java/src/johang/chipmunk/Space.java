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

package johang.chipmunk;

import java.util.ArrayList;

public class Space {
	protected long cpSpacePtr;

	private ArrayList<Shape> staticShapes;

	private ArrayList<Shape> shapes;

	private ArrayList<Body> bodies;

	public Space() {
		cpSpacePtr = create();
		staticShapes = new ArrayList<Shape>();
		shapes = new ArrayList<Shape>();
		bodies = new ArrayList<Body>();
	}

	private native static void initialize();

	private native long create();

	public native void free();

	public void freeChildren() {
		staticShapes.clear();
		shapes.clear();
		bodies.clear();
		nativeFreeChildren();
	}

	private native void nativeFreeChildren();

	public Body addBody(Body body) {
		nativeAddBody(body);
		bodies.add(body);
		return body;
	}

	private native void nativeAddBody(Body body);

	public Shape addShape(Shape shape) {
		nativeAddShape(shape);
		shapes.add(shape);
		return shape;
	}

	private native void nativeAddShape(Shape shape);

	public Shape addStaticShape(Shape shape) {
		nativeAddStaticShape(shape);
		staticShapes.add(shape);
		return shape;
	}

	private native void nativeAddStaticShape(Shape shape);

	public void removeBody(Body body) {
		nativeRemoveBody(body);
		bodies.remove(body);
	}

	private native void nativeRemoveBody(Body body);

	public void removeShape(Shape shape) {
		nativeRemoveShape(shape);
		shapes.remove(shape);
	}

	private native void nativeRemoveShape(Shape shape);

	public void removeStaticShape(Shape shape) {
		nativeRemoveStaticShape(shape);
		staticShapes.remove(shape);
	}

	private native void nativeRemoveStaticShape(Shape shape);

	public native void step(float dt);

	public native void resizeActiveHash(float dim, int count);

	public native void resizeStaticHash(float dim, int count);

	public native void setIterations(int iterations);

	public native void setGravity(float x, float y);

	protected void finalize() {
		free();
		freeChildren();
	}

	static {
		initialize();
	}
}

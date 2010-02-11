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

abstract public class Shape {
	protected long cpShapePtr;

	protected Body body;

	public Shape(Body b) {
		body = b;
	}

	public Body getBody() {
		return body;
	}

	public native void setE(float e);

	public native float getE();

	public native void setU(float u);

	public native float getU();

	public native int getLayers();

	public native void setLayers(int layers);

	public native void free();

	protected void finalize() {
		free();
	}
}

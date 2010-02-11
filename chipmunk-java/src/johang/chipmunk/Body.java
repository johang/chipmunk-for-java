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

public class Body {
	protected long cpBodyPtr;

	public Body(float mass, float inertia) {
		cpBodyPtr = create(mass, inertia);
	}

	private native static void initialize();

	private native long create(float mass, float inertia);

	public native void free();

	public native void setPosition(float x, float y);

	public native void setVelocity(float x, float y);

	public native float getPositionX();

	public native float getPositionY();

	public native float getAngle();

	protected void finalize() {
		free();
	}

	static {
		initialize();
	}
}

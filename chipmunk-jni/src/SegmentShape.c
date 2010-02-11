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

#include <jni.h>
#include <stdio.h>

#include "common.h"

#include "chipmunk.h"

JNIEXPORT jlong JNICALL Java_johang_chipmunk_SegmentShape_create(JNIEnv *env,
		jobject self, jobject body, jfloat aX, jfloat aY, jfloat bX, jfloat bY,
		jfloat r) {
	cpBody *ptrBody = jgGetCpBodyPtr(env, body);
	return (jlong) cpSegmentShapeNew(ptrBody, cpv(aX, aY), cpv(bX, bY), r);
}

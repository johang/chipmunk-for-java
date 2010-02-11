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

JNIEXPORT void JNICALL Java_johang_chipmunk_Shape_setE(JNIEnv *env,
		jobject self, jfloat e) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	shape->e = e;
}

JNIEXPORT jfloat JNICALL Java_johang_chipmunk_Shape_getE(JNIEnv *env,
		jobject self) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	return shape->e;
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Shape_setU(JNIEnv *env,
		jobject self, jfloat u) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	shape->u = u;
}

JNIEXPORT jfloat JNICALL Java_johang_chipmunk_Shape_getU(JNIEnv *env,
		jobject self) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	return shape->u;
}

JNIEXPORT jint JNICALL Java_johang_chipmunk_Shape_getLayers(JNIEnv *env,
		jobject self) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	return shape->layers;
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Shape_setLayers(JNIEnv *env,
		jobject self, jint layers) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	shape->layers = layers;
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Shape_free(JNIEnv *env,
		jobject self) {
	cpShape *shape = jgGetCpShapePtr(env, self);
	cpShapeFree(shape);
}

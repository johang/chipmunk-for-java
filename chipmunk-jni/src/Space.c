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

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_initialize(JNIEnv *env,
		jclass self) {

}

JNIEXPORT jlong JNICALL Java_johang_chipmunk_Space_create(JNIEnv *env,
		jobject self) {
	return (jlong) cpSpaceNew();
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_free(JNIEnv *env,
		jobject self) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpSpaceFree(space);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeFreeChildren(
		JNIEnv *env, jobject self) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpSpaceFreeChildren(space);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeAddBody(JNIEnv *env,
		jobject self, jobject body) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpBody *ptrBody = jgGetCpBodyPtr(env, body);
	cpSpaceAddBody(space, ptrBody);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeAddShape(JNIEnv *env,
		jobject self, jobject shape) {
	cpSpace *ptrSpace = jgGetCpSpacePtr(env, self);
	cpShape *ptrShape = jgGetCpShapePtr(env, shape);
	cpSpaceAddShape(ptrSpace, ptrShape);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeAddStaticShape(
		JNIEnv *env, jobject self, jobject shape) {
	cpSpace *ptrSpace = jgGetCpSpacePtr(env, self);
	cpShape *ptrShape = jgGetCpShapePtr(env, shape);
	cpSpaceAddStaticShape(ptrSpace, ptrShape);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeRemoveBody(JNIEnv *env,
		jobject self, jobject body) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpBody *ptrBody = jgGetCpBodyPtr(env, body);
	cpSpaceRemoveBody(space, ptrBody);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeRemoveShape(
		JNIEnv *env, jobject self, jobject shape) {
	cpSpace *ptrSpace = jgGetCpSpacePtr(env, self);
	cpShape *ptrShape = jgGetCpShapePtr(env, shape);
	cpSpaceRemoveShape(ptrSpace, ptrShape);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_nativeRemoveStaticShape(
		JNIEnv *env, jobject self, jobject shape) {
	cpSpace *ptrSpace = jgGetCpSpacePtr(env, self);
	cpShape *ptrShape = jgGetCpShapePtr(env, shape);
	cpSpaceRemoveStaticShape(ptrSpace, ptrShape);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_step(JNIEnv *env,
		jobject self, jfloat dt) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpSpaceStep(space, dt);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_resizeActiveHash(JNIEnv *env,
		jobject self, jfloat dim, jint count) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpSpaceResizeActiveHash(space, dim, count);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_resizeStaticHash(JNIEnv *env,
		jobject self, jfloat dim, jint count) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	cpSpaceResizeStaticHash(space, dim, count);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_setIterations(JNIEnv *env,
		jobject self, jint iterations) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	space->iterations = iterations;
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Space_setGravity(JNIEnv *env,
		jobject self, jfloat x, jfloat y) {
	cpSpace *space = jgGetCpSpacePtr(env, self);
	space->gravity = cpv(x, y);
}

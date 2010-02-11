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

JNIEXPORT void JNICALL Java_johang_chipmunk_Body_initialize(JNIEnv *env,
		jclass clazz) {
}

JNIEXPORT jlong JNICALL Java_johang_chipmunk_Body_create(JNIEnv *env,
		jobject self, jfloat mass, jfloat inertia) {
	return (jlong) cpBodyNew(mass, inertia);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Body_free(JNIEnv *env, jobject self) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	cpBodyFree(body);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Body_setPosition(JNIEnv *env,
		jobject self, jfloat x, jfloat y) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	body->p = cpv(x, y);
}

JNIEXPORT void JNICALL Java_johang_chipmunk_Body_setVelocity(JNIEnv *env,
		jobject self, jfloat x, jfloat y) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	body->v = cpv(x, y);
}

JNIEXPORT jfloat JNICALL Java_johang_chipmunk_Body_getPositionX(JNIEnv *env,
		jobject self) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	return body->p.x;
}

JNIEXPORT jfloat JNICALL Java_johang_chipmunk_Body_getPositionY(JNIEnv *env,
		jobject self) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	return body->p.y;
}

JNIEXPORT jfloat JNICALL Java_johang_chipmunk_Body_getAngle(JNIEnv *env,
		jobject self) {
	cpBody* body = jgGetCpBodyPtr(env, self);
	return cpBodyGetAngle(body);
}

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

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *jvm, void *reserved) {
	JNIEnv *env;

	if ((*jvm)->GetEnv(jvm, (void**) &env, JNI_VERSION_1_4) != JNI_OK)
		return -1;

	cpInitChipmunk();

	return JNI_VERSION_1_4;
}

cpSpace* jgGetCpSpacePtr(JNIEnv *env, jobject self) {
	jclass class_Space = (*env)->FindClass(env, "johang/chipmunk/Space");
	jfieldID field_cpSpacePtr = (*env)->GetFieldID(env, class_Space,
			"cpSpacePtr", "J");
	return (cpSpace *) (*env)->GetLongField(env, self, field_cpSpacePtr);
}

cpBody* jgGetCpBodyPtr(JNIEnv *env, jobject self) {
	jclass class_Body = (*env)->FindClass(env, "johang/chipmunk/Body");
	jfieldID field_cpBodyPtr = (*env)->GetFieldID(env, class_Body, "cpBodyPtr",
			"J");
	return (cpBody *) (*env)->GetLongField(env, self, field_cpBodyPtr);
}

cpShape* jgGetCpShapePtr(JNIEnv *env, jobject self) {
	jclass class_Shape = (*env)->FindClass(env, "johang/chipmunk/Shape");
	jfieldID field_cpShapePtr = (*env)->GetFieldID(env, class_Shape,
			"cpShapePtr", "J");
	return (cpShape*) (*env)->GetLongField(env, self, field_cpShapePtr);
}

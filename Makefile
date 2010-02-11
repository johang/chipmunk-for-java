# Chipmunk for Java
# Java bindings for the Chipmunk 2D physics library
# 
# http://github.com/johang/chipmunk-for-java
# 
# Copyright 2010, Johan Gunnarsson, johan.gunnarsson@gmail.com
# 
# Chipmunk for Java is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
# 
# Chipmunk for Java is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
# 
# You should have received a copy of the GNU General Public License
# along with Chipmunk for Java.  If not, see <http://www.gnu.org/licenses/>.

.PHONY: all clean

all: libchipmunk-jni.so chipmunk.jar

clean:
	rm -f libchipmunk-jni.so libchipmunk.a chipmunk.jar chipmunk-demo.jar
	$(MAKE) -C chipmunk clean
	$(MAKE) -C chipmunk-jni clean
	$(MAKE) -C chipmunk-java clean

libchipmunk-jni.so: libchipmunk.a
	$(MAKE) -C chipmunk-jni
	cp chipmunk-jni/libchipmunk-jni.so .

libchipmunk.a:
	$(MAKE) -C chipmunk
	cp chipmunk/libchipmunk.a .

chipmunk.jar:
	$(MAKE) -C chipmunk-java
	cp chipmunk-java/chipmunk.jar .

chipmunk-demo.jar:
	$(MAKE) -C chipmunk-java-demo

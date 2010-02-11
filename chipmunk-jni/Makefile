# Chipmunk for Java
# Java bindings for Chipmunk, the 2D physics library
# http://github.com/johang/chipmunk-for-java

# Copyright 2010, Johan Gunnarsson, johan.gunnarsson@gmail.com

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

JAVA_HOME = /usr/lib/jvm/java-6-sun

CPPFLAGS = \
	-I"$(JAVA_HOME)/include" \
	-I"$(JAVA_HOME)/include/linux" \
	-I"../chipmunk/include/chipmunk" \
	-I"./src" \
	-MMD \
	-MP \
	-MF"$(@:%.o=%.d)" \
	-MT"$(@:%.o=%.d)" \

LDFLAGS = \
	-L".." \
	-lchipmunk \
	-L"$(JAVA_HOME)/jre/lib/i386/client" \
	-ljvm \
	-shared \

CHIPMUNKJNI_SRC_FILES := $(wildcard src/*.cpp)

.PHONY: all clean

all: libchipmunk-jni.so

-include $(CHIPMUNKJNI_SRC_FILES:.cpp=.d)

libchipmunk-jni.so: $(CHIPMUNKJNI_SRC_FILES:.cpp=.o)
	$(CXX) -o "$@" $^ $(LDFLAGS)

clean:
	rm -f src/*.o
	rm -f src/*.d
	rm -f libchipmunk-jni.so


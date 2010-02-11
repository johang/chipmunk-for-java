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

CPPFLAGS = \
	-I"./include/chipmunk" \
	-MMD \
	-MP \
	-MF"$(@:%.o=%.d)" \
	-MT"$(@:%.o=%.d)" \

CFLAGS := \
	-std=gnu99 \
	-Wall \
	#-ffast-math \
	#-O3 \

CHIPMUNK_SRC_FILES := \
	$(wildcard src/*.c) \
	$(wildcard src/constraints/*.c) \

.PHONY: all clean

all: libchipmunk.a

-include $(CHIPMUNK_SRC_FILES:.c=.d)

libchipmunk.a: $(CHIPMUNK_SRC_FILES:.c=.o)
	ar -r libchipmunk.a $^

clean:
	rm -f src/*.o src/constraints/*.o
	rm -f src/*.d src/constraints/*.d
	rm -f libchipmunk.a

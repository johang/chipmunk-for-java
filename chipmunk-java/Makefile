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

SRCPATH := ./src
BINPATH := ./bin
HEADERPATH := ./include
JARFILE := chipmunk.jar

CHIPMUNKJAVA_JAVA_FILES := \
	$(SRCPATH)/johang/chipmunk/Space.java \
	$(SRCPATH)/johang/chipmunk/Chipmunk.java \
	$(SRCPATH)/johang/chipmunk/CircleShape.java \
	$(SRCPATH)/johang/chipmunk/Body.java \
	$(SRCPATH)/johang/chipmunk/Shape.java \
	$(SRCPATH)/johang/chipmunk/SegmentShape.java \

CHIPMUNKJAVA_CLASS_NAMES := \
	johang.chipmunk.Space \
	johang.chipmunk.Chipmunk \
	johang.chipmunk.CircleShape \
	johang.chipmunk.Body \
	johang.chipmunk.Shape \
	johang.chipmunk.SegmentShape \

.PHONY: all clean

all: $(JARFILE)

$(JARFILE): $(CHIPMUNKJAVA_JAVA_FILES)
	mkdir -p $(BINPATH) $(HEADERPATH)
	javac -d $(BINPATH) -sourcepath $(SRCPATH) $(CHIPMUNKJAVA_JAVA_FILES)
	jar cf $@ -C $(BINPATH) .
	javah -classpath $(BINPATH) -d $(HEADERPATH) $(CHIPMUNKJAVA_CLASS_NAMES)

clean:
	rm -rf $(BINPATH) $(HEADERPATH)
	rm -f $(JARFILE)


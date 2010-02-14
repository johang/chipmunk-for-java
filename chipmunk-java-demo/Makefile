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

SRCPATH := ./src
BINPATH := ./bin
JARFILE := chipmunk-demo.jar
CHIPMUNKJAR := ../chipmunk.jar

CHIPMUNKJAVADEMO_JAVA_FILES := \
	$(SRCPATH)/johang/chipmunk/demo1/Ball.java \
	$(SRCPATH)/johang/chipmunk/demo1/Panel.java \
	$(SRCPATH)/johang/chipmunk/demo1/Border.java \
	$(SRCPATH)/johang/chipmunk/demo1/Balls.java \
	$(SRCPATH)/johang/chipmunk/demo1/Drawable.java \
	$(SRCPATH)/johang/chipmunk/reusable/CompositeShape.java \
	$(SRCPATH)/johang/chipmunk/reusable/ShallowBoxShape.java \
	$(SRCPATH)/johang/chipmunk/reusable/SuperSpace.java \

.PHONY: all clean

all: $(JARFILE)

$(JARFILE): $(CHIPMUNKJAVADEMO_JAVA_FILES)
	mkdir -p $(BINPATH)
	javac -cp $(CHIPMUNKJAR) -d $(BINPATH) -sourcepath $(SRCPATH) $(CHIPMUNKJAVADEMO_JAVA_FILES)
	jar cf $@ -C $(BINPATH) .

clean:
	rm -rf $(BINPATH)
	rm -f $(JARFILE)

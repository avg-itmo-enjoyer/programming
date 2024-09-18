EXECUTABLE_NAME=lab2

.PHONY: build run clean

build: clean
	javac -cp ./build/lib/Pokemon.jar ./src/*.java ./src/*/*.java -d ./build/classes
	jar --create --file ./build/${EXECUTABLE_NAME}.jar --manifest ./build/MANIFEST.MF -C ./build/classes .

run:
	java -jar ./build/${EXECUTABLE_NAME}.jar

clean:
	rm -rf ./build/${EXECUTABLE_NAME}.jar ./build/classes/

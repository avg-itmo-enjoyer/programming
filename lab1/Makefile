CLASS_PATH=./class
SRC_FILE=./Main.java
ENTRY_POINT=main.Main
EXECUTABLE_NAME=1st_lab.jar

.PHONY: build run clean

build: clean
	javac $(SRC_FILE) -d $(CLASS_PATH)
	jar --create --file $(EXECUTABLE_NAME) --main-class $(ENTRY_POINT) -C $(CLASS_PATH) .

run:
	java -jar

clean:
	rm -rf $(CLASS_PATH)
	rm -F $(EXECUTABLE_NAME)

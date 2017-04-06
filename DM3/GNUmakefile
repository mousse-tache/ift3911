SRC_DIR = src
BUILD_DIR = build/

SRC_FILES = $(shell find $(SRC_DIR) -name "*.java")

all: clean run

clean:
	rm -rdf $(BUILD_DIR)

init:
	mkdir -p $(BUILD_DIR)

build: init
	javac -verbose -d $(BUILD_DIR) $(SRC_FILES)

run: build
	java -cp $(BUILD_DIR) Main

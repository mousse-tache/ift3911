SRC_DIR = src/
BUILD_DIR = build/

SRC_FILES = $(shell find $(SRC_DIR) -name "*.java")

all: build

clean:
	rm -rdf $(BUILD_DIR)

init:
	mkdir -p $(BUILD_DIR)

build: init
	javac -d $(BUILD_DIR) $(SRC_FILES)

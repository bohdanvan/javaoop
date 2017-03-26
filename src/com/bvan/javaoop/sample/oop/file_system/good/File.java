package com.bvan.javaoop.sample.oop.file_system.good;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public File(int size) {
        this.size = size;
    }

    public File setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}

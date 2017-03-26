package com.bvan.javaoop.sample.oop.file_system.good;

/**
 * @author bvanchuhov
 */
public class Symlink extends NamedFSItem {

    private FSItem item;

    public Symlink(String name, FSItem item) {
        super(name);
        this.item = item;
    }

    public Symlink(FSItem item) {
        this.item = item;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s->" + item;
    }
}

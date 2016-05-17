package com.bvan.javaoop.sample.oop.file_system.bad;

/**
 * @author bvanchuhov
 */
@Deprecated
public class Symlink {

    private File file;

    public Symlink() {
    }

    public Symlink(File file) {
        this.file = file;
    }

    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s->" + file;
    }
}

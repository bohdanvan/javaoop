package com.bvan.javaoop.sample.oop.file_system.bad;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
@Deprecated
public class File {

    private int size;

    public File(int size) {
        Args.notNegative(size, "size");

        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public File setSize(int size) {
        Args.notNegative(size, "size");

        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}

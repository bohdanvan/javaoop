package com.bvan.javaoop.sample.oop.file_system.good;

/**
 * @author bvanchuhov
 */
public abstract class NamedFSItem implements FSItem {

    private String name;

    public NamedFSItem() {
    }

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract int getSize();
}

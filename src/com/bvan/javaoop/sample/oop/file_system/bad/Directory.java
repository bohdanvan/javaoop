package com.bvan.javaoop.sample.oop.file_system.bad;

import com.bvan.common.Args;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Deprecated
public class Directory {

    private List<File> files = new ArrayList<>();
    private List<Directory> directories = new ArrayList<>();
    private List<Symlink> symlinks = new ArrayList<>();

    public Directory add(File file) {
        Args.notNull(file, "file");

        files.add(file);
        return this;
    }

    public Directory add(Directory directory) {
        Args.notNull(directory, "directory");

        directories.add(directory);
        return this;
    }

    public Directory add(Symlink symlink) {
        Args.notNull(symlink, "symlink");

        symlinks.add(symlink);
        return this;
    }

    public int getSize() {
        int sizeSum = 0;

        for (File file : files) {
            sizeSum += file.getSize();
        }
        for (Directory directory : directories) {
            sizeSum += directory.getSize();
        }
        for (Symlink symlink : symlinks) {
            sizeSum += symlink.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        return "d{" + files + ", " + directories + ", " + symlinks + "}";
    }
}

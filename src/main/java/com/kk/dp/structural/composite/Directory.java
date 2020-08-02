package com.kk.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private final List<File> children;

    public Directory(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach(File::ls);
    }

    @Override
    public File[] getFiles() {
        return this.children.toArray(new File[children.size()]);
    }

    @Override
    public void addFile(File file) {
        this.children.add(file);
    }

    @Override
    public void removeFile(File file) {
        this.children.remove(file);
    }
}

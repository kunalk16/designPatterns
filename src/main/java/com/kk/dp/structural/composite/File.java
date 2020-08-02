package com.kk.dp.structural.composite;

public abstract class File {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void ls();

    public abstract File[] getFiles();

    public abstract void addFile(File file);

    public abstract void removeFile(File file);
}

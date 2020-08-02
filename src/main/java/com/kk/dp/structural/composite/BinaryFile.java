package com.kk.dp.structural.composite;

public class BinaryFile extends File {
    private final int size;

    public BinaryFile(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + this.size);
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Cannot get files from Binary File!");
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Cannot add file to Binary File!");
    }

    @Override
    public void removeFile(File file) {
        throw new UnsupportedOperationException("Cannot remove file from Binary File!");
    }
}

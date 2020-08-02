package com.kk.dp.structural.composite;

public class Client {
    public static void main(String[] args) {
        File binaryFile = getBinaryFile();
        binaryFile.ls();

        File directory = getDirectory();
        directory.ls();

        directory.removeFile(directory.getFiles()[1]);
        directory.ls();
    }

    private static File getDirectory() {
        File directory = new Directory("dir1");
        directory.addFile(new BinaryFile("file2", 2000));
        directory.addFile(new BinaryFile("file3", 3000));
        directory.addFile(new BinaryFile("file4", 4000));
        directory.addFile(new BinaryFile("file5", 5000));

        return directory;
    }

    private static File getBinaryFile() {
        return new BinaryFile("file1", 1000);
    }
}

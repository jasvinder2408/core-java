package com.coding.java.designpattern.factory;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
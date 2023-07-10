package com.examples.list;

public enum TestEnu {
    commentsFile1("commetsFile1","Section1"),
    commentsFile2("commetsFile2","Section2");
    String  eclName;
    String pdgDisplayName;

    TestEnu(String eclName, String pdgDisplayName) {
        this.eclName = eclName;
        this.pdgDisplayName = pdgDisplayName;
    }
}

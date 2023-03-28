package com.example.courseworkthree.service;

import java.io.File;
import java.nio.file.Path;

public interface SocksFileService {

    boolean saveSocksToFile(String json);

    String readSocksFromFile();

    boolean cleanSocksDataFile();

    File getDataSocksFile();

    Path createTempFile(String suffix);
}
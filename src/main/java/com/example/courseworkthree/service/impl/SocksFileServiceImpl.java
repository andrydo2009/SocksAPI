package com.example.courseworkthree.service.impl;

import com.example.courseworkthree.service.SocksFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


    @Service
    public class SocksFileServiceImpl implements SocksFileService {

        @Value("${path.to.data.files}")
        private String socksFilePath;

        @Value("${name.of.socks.file}")
        private String socksFileName;


        @Override
        public boolean saveSocksToFile(String json) {
            try {
                cleanSocksDataFile ();//подготавливаем файл
                Files.writeString ( Path.of ( socksFileName ,socksFilePath  ) , json ); // записывает файл в строку
                return true;
            } catch (IOException e) {
                e.printStackTrace ();
                return false;
            }
        }

        @Override
        public String readSocksFromFile() {
            try {
                return Files.readString ( Path.of ( socksFileName ,socksFilePath  ) ); // метод читает файл, в скобках указано имя и путь
            } catch (IOException e) {
                throw new RuntimeException ( e );
            }
        }

        @Override
        public boolean cleanSocksDataFile() { //метод удаляет/обновляет файл
            try {
                Path path = Path.of ( socksFilePath , socksFileName); // class Path предназначен для работы с файлами, в скобках имя файла затем путь
                Files.deleteIfExists ( path );// удаляем старый файл если он есть
                Files.createFile ( path );// создаем новый файл
                return true;
            } catch (IOException e) {
                e.printStackTrace ();
                return false;
            }
        }

        @Override
        public File getDataSocksFile() {
            return new File ( socksFilePath+ "/" + socksFileName );
        }


        @Override
        public Path createTempFile(String suffix) {
            try {
                return Files.createTempFile ( Path.of ( socksFilePath ) , "tempFile" , suffix ); //генерируем временный файл
            } catch (IOException e) {
                throw new RuntimeException ( e );
            }
        }

    }



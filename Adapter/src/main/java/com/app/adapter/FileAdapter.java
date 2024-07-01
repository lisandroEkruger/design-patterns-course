package com.app.adapter;

import java.io.InputStream;
import java.util.List;

import com.app.model.Person;

public class FileAdapter {

    private InputFile inputFile;

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream){
        return this.inputFile.readFile(inputStream);
    }
}

package com.app;

import com.app.adapter.FileAdapter;
import com.app.adapter.InputFile;
import com.app.adapter.json.JsonFileAdapter;
import com.app.model.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    private static final String path =
            "src" + File.separator +
                    "main" + File.separator +
                    "resources" + File.separator +
                    "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {
        // Read Excel
        /*
        InputFile excelFileAdapter = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoExcel.xlsx");
        */

        // Read CSV
        /*
        InputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoCSV.txt");
        */

        // Read XML
        /*
        InputFile csvFileAdapter = new XmlFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoXML.xml");
         */

        // Read JSON
        InputFile csvFileAdapter = new JsonFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter);
        InputStream inputStream = new FileInputStream(path + "ArchivoJSON.json");

        List<Person> personList = fileAdapter.readFile(inputStream);
        System.out.println(personList);
    }
}
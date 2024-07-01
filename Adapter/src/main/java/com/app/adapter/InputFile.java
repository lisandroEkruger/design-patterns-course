package com.app.adapter;

import java.io.InputStream;
import java.util.List;

import com.app.model.Person;

public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}

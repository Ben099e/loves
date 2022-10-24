package hu.target.shooting.model.service;

import hu.target.shooting.model.domain.ShoutResult;

import java.util.List;

public class DataApi {

    private final FileReader reader;
    private final DataParser parser;

    public DataApi(FileReader reader, DataParser parser) {
        this.reader = reader;
        this.parser = parser;
    }

    public List<ShoutResult> getData() {
        return  parser.parse(reader.read());
    }
}

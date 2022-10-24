package hu.target.shooting.model.service;

import hu.target.shooting.model.domain.ShoutResult;

import java.util.List;
import java.util.stream.Collectors;

public class DataParser {

    private int id;

    public List<ShoutResult> parse(List<String> lines) {
        lines.remove(0);
        return lines.stream()
                .map(this::crateShoutResult)
                .collect(Collectors.toList());
    }

    private ShoutResult crateShoutResult(String line) {
        return new ShoutResult(++id, line);
    }

}

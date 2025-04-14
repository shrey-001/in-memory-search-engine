package com.example.demo.SearchEngine;

import java.util.HashMap;
import java.util.Map;

public class DatabaseEngineServiceImpl implements DatabaseEngineService {

    Map<String, DatasetService> datasets = new HashMap<>();

    @Override
    public void addDataBase(String databaseName) {
        datasets.put(databaseName, new DatasetService());
    }

    @Override
    public void addDocument(String databaseName, DocumentDTO documentDTO) {
        DatasetService datasetDTO = datasets.get(databaseName);
        if (datasetDTO == null) {
            throw new IllegalArgumentException("Database not found: " + databaseName);
        }
        datasetDTO.addDocument(documentDTO);
    }

    @Override
    public void deleteDocument(String databaseName, Long documentId) {
        DatasetService datasetDTO = datasets.get(databaseName);
        if (datasetDTO == null) {
            throw new IllegalArgumentException("Database not found: " + databaseName);
        }
        datasetDTO.deleteDocument(documentId);
    }

    @Override
    public void search(String databaseName, String query) {
        DatasetService datasetDTO = datasets.get(databaseName);
        if (datasetDTO == null) {
            throw new IllegalArgumentException("Database not found: " + databaseName);
        }
        datasetDTO.searchDocument(query);
    }
}

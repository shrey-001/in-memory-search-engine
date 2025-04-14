package com.example.demo.SearchEngine;

public interface DatabaseEngineService {

    void addDataBase(String databaseName);
    void addDocument(String databaseName, DocumentDTO documentDTO);
    void deleteDocument(String databaseName, Long documentId);
    void search(String databaseName, String query);

}

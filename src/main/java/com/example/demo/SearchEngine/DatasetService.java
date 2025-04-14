package com.example.demo.SearchEngine;

import java.util.HashMap;
import java.util.Map;

public class DatasetService {
    // contains the documents
    Map<Long, DocumentDTO> documents = new HashMap<>();

    void addDocument(DocumentDTO documentDTO) {
        // add document to the dataset
        documents.put(documentDTO.getDocumentId(), documentDTO);
    }

    void deleteDocument(Long documentId) {
        // delete document from the dataset
        documents.remove(documentId);
    }

    void searchDocument(String query){

    }



}

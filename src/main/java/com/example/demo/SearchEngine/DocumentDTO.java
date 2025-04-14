package com.example.demo.SearchEngine;

import java.util.Date;


public class DocumentDTO {
    //represents a document in the dataset
    private Long documentId;
    private String content;
    private Date time;


    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}

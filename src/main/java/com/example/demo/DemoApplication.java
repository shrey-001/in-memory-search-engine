package com.example.demo;

import com.example.demo.SearchEngine.DatabaseEngineService;
import com.example.demo.SearchEngine.DatabaseEngineServiceImpl;
import com.example.demo.SearchEngine.DocumentDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Create an instance of DatabaseEngineService
		DatabaseEngineService databaseEngineService = new DatabaseEngineServiceImpl();

		// Add a new database
		databaseEngineService.addDataBase("myDatabase");

		// Create a new document
		DocumentDTO documentDTO = new DocumentDTO();
		documentDTO.setDocumentId(1L);
		documentDTO.setContent("This is a sample document.");
		documentDTO.setTime(new Date());

		// Add the document to the database
		databaseEngineService.addDocument("myDatabase", documentDTO);

		// Delete the document from the database
		databaseEngineService.deleteDocument("myDatabase", 1L);

		// Search for a document in the database
		databaseEngineService.search("myDatabase", "sample");

	}

}

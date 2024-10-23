package com.example.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@PostMapping("/single-file-upload")
	public ResponseEntity<Map<String, String>> handleFileUploadUsingCurl(
	  @RequestParam("file") MultipartFile file) throws IOException {
	    Map<String, String> map = new HashMap<>();
	    // Populate the map with file details
	    map.put("fileName", file.getOriginalFilename());
	    map.put("fileSize", file.getSize()+"");
	    map.put("fileContentType", file.getContentType());
	    // File upload is successful
	    map.put("message", "File upload done");
	    return ResponseEntity.ok(map);
	  }
	}
	


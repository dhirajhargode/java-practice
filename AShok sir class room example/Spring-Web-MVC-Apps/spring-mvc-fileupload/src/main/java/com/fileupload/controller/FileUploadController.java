package com.fileupload.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@GetMapping("/")
	public String fileUploadForm(Model model) {

		return "fileUploadForm";
	}

	// Handling single file upload request
	@PostMapping("/singleFileUpload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws IOException {

		// Save file on system
		if (!file.getOriginalFilename().isEmpty()) {
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(
					"C:\\Users\\akumarbollepalli\\Desktop\\File\\SingleFileUpload", file.getOriginalFilename())));
			outputStream.write(file.getBytes());
			outputStream.flush();
			outputStream.close();

			model.addAttribute("smsg", "File uploaded successfully.");
		} else {
			model.addAttribute("smsg", "Please select a valid file..");
		}

		return "fileUploadForm";
	}

	// Handling multiple files upload request
	@PostMapping("/multipleFileUpload")
	public String multipleFileUpload(@RequestParam("file") MultipartFile[] files, Model model) throws IOException {

		// Save file on system
		for (MultipartFile file : files) {
			if (!file.getOriginalFilename().isEmpty()) {
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(
						"C:\\Users\\akumarbollepalli\\Desktop\\File\\MultiFileUpload", file.getOriginalFilename())));
				outputStream.write(file.getBytes());
				outputStream.flush();
				outputStream.close();
			} else {
				model.addAttribute("mmsg", "Please select at least one file..");
				return "fileUploadForm";
			}
		}
		model.addAttribute("mmsg", "Multiple files uploaded successfully.");
		return "fileUploadForm";
	}
}

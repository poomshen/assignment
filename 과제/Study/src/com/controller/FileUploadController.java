package com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(value="fileupload.htm", method=RequestMethod.GET)
	public String upload(){
		return "emp.fileupload";
	}
	
	@RequestMapping(value="fileupload.htm", method=RequestMethod.POST)
	public String fileupload(MultipartFile file, String title, Model model) throws IllegalStateException, IOException{
		
		
		if(!file.isEmpty()){
			String filename = file.getName();
			String uploadPath = "C:\\Kosta129\\Spring\\Spring_Labs_STS\\SpringMVC_Team03_FileUpload\\src\\main\\webapp\\WEB-INF\\images"; 
			String originfilename = file.getOriginalFilename();
			
			File f = new File(uploadPath + "\\" + originfilename);
			file.transferTo(f);
			String uploadpath = f.getAbsolutePath();
			
			model.addAttribute("uploadPath", uploadPath);
			model.addAttribute("originfilename", originfilename);
			model.addAttribute("uploadpath", uploadpath);
			return "emp.success";
		}
		
		return "emp.success";
	}
}

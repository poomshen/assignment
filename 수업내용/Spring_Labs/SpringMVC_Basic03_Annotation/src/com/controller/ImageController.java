package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.model.Photo;



@Controller
@RequestMapping("/image/upload.do")
public class ImageController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		System.out.println("image.jsp 출력");
		
		return "image/image";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Photo photo , HttpServletRequest request) 
			throws IOException{
		//Photo photo  
		//전제조건 : <Form 전송한 자원 자동 ...) input 태그 name == Photo memberfield 동일
		//Photo photo = new Photo() 
		//photo.setName("홍길동")...
		
		//System.out.println(photo.getName());
		//System.out.println(photo.getAge());
		//System.out.println(photo.getFile().getName());
		
		CommonsMultipartFile imagefile = photo.getFile();
		//System.out.println(imagefile.getName());
		//System.out.println(imagefile.getBytes());
		//System.out.println(imagefile.getSize());
		
		String filename = imagefile.getOriginalFilename();
		String path = request.getServletContext().getRealPath("/upload");
		
		String fpath = path + "\\" + filename;
		
		FileOutputStream fs = new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
		return "image/image";

	}
}


/*
파일 업로드
1.fileupload.jar
  commons.io.jar 추가

2. IOC 컨테이너 안에 (bean 객체)
   CommonsMultipartResolver 객체

3. DTO 사용 :
   file 을 담을 수 있는 memberfield 생성
   CommonsMultipartFile (setter , getter ) 구현

4. UI > <input type="file" name="file" 


5. Controller 객체를 (DTO paramter)로

*/





package spring.web.ch06.ex01;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/ch06/ex01/upload")
public class UpController {
	@Value("${uploadDir}")
	private String uploadDir;

	@RequestMapping(method = RequestMethod.GET)
	public String upload(){
		return "ch06/ex01/uploadIn";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String upload(String title, MultipartFile uploadFile,
			Model model, HttpServletRequest request){
		String dir = request.getServletContext().getRealPath(uploadDir);
		System.out.println("dir:" + dir);
		String fileName = uploadFile.getOriginalFilename();
		save(dir + "/" + fileName, uploadFile);
		model.addAttribute("fileName", fileName);
		return "ch06/ex01/uploadOut";
	}

	private void save(String fileFullName, MultipartFile uploadFile) {
		try{
			uploadFile.transferTo(new File(fileFullName));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

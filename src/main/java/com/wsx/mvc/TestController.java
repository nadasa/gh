package com.wsx.mvc;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wsx.domain.DemoObj;

@Controller
public class TestController {
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	@RequestMapping("/error")
	public String error(@ModelAttribute("addAttribute") String msg,DemoObj obj){
		throw new IllegalArgumentException("异常!来自"+msg);
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public String upload(MultipartFile file){
		try {
			FileUtils.writeByteArrayToFile(new File("D:/"+file.getOriginalFilename()), file.getBytes());
			return "ok";
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
		}
	}
}

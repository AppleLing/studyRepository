package com.study.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @GetMapping("/upload")
    public String upload(){
        return "upload/upload";
    }

    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        ServletContext context = session.getServletContext();
        String upLoadPath = context.getRealPath("/files");
        File uploadFile = new File(upLoadPath);
        if(!uploadFile.exists()){
            uploadFile.mkdirs();
        }
        String fileName = file.getOriginalFilename();
        try {
            file.transferTo(new File(uploadFile,fileName));
            model.addAttribute("msg","文件上传成功");
        } catch (IOException e) {
            model.addAttribute("msg","文件上传失败");
            e.printStackTrace();
        }
        return "upload/upload";
    }
}

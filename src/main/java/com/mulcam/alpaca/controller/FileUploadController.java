package com.mulcam.alpaca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.mulcam.alpaca.service.FileUploadService;
import com.mulcam.alpaca.vo.FileVO;

@Controller
public class FileUploadController {

  @Autowired
  FileUploadService fileUploadService;

  @GetMapping("/upload")
  public String home() {
    return "/upload/form";
  }

  @PostMapping("/upload/new")
  public String uploadFile(@RequestParam MultipartFile file, RedirectAttributes redirectAttrs) {
    // System.out.println("aa");
    try {
      if (file != null && !file.isEmpty()) {
        FileVO newFile = new FileVO();
        newFile.setFileName(file.getOriginalFilename());
        newFile.setFileSize(file.getSize());
        newFile.setFileContentType(file.getContentType());
        newFile.setFileData(file.getBytes());
        fileUploadService.fileUpload(newFile);
      }
    } catch (Exception e) {
      e.printStackTrace();
      redirectAttrs.addFlashAttribute("message", e.getMessage());

    }
    return "redirect:/review/board_write";

  }
}

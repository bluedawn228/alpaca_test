package com.mulcam.alpaca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mulcam.alpaca.dao.FileUploadDAO;
import com.mulcam.alpaca.vo.FileVO;

@Service
public class FileUploadService {

  @Autowired
  FileUploadDAO fileUploadDAO;

  public void fileUpload(FileVO file) {
    fileUploadDAO.uploadFile(file);
  }

}

package com.mulcam.alpaca.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.mulcam.alpaca.vo.FileVO;

@Repository
@Mapper
public interface FileUploadDAO {
  void uploadFile(FileVO FileVO);
}

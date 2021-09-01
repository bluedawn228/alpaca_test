package com.mulcam.alpaca.service;

import java.util.List;
import com.mulcam.alpaca.vo.FileVO;
import com.mulcam.alpaca.vo.PageInfo;
import com.mulcam.alpaca.vo.RCommVO;
import com.mulcam.alpaca.vo.ReviewVO;

public interface ReviewService {

  void writeReview(FileVO rImg, ReviewVO review) throws Exception;

  List<ReviewVO> getBoardList(int page, PageInfo pageInfo) throws Exception;

  List<ReviewVO> getBoardKeyList(int page, PageInfo pageInfo, String keyword) throws Exception;

  ReviewVO getBoard(int reviewId) throws Exception;

  ReviewVO getBoardPre(int reviewId) throws Exception;

  ReviewVO getBoardNext(int reviewId) throws Exception;

  FileVO getFile(int fileId) throws Exception;

  FileVO getPfImg(String email) throws Exception;

  int getLikeCount(String reviewId) throws Exception;

  void updateLikeCount(String reviewId) throws Exception;


  void removeBoard(int reviewId) throws Exception;

  // 댓글

  void addRComm(RCommVO rComm) throws Exception;

  void addRCommChild(RCommVO rComm) throws Exception;

  // void regReply(ReviewVO review) throws Exception;
  //
  // void modifyBoard(ReviewVO review) throws Exception;

  // List<Map<String, ReviewVO>> getNameList(List<ReviewVO> articleList) throws Exception;

}

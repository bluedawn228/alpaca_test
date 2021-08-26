package com.mulcam.alpaca.service;

import com.mulcam.alpaca.vo.FileVO;
import com.mulcam.alpaca.vo.ReviewVO;

public interface ReviewService {

  void writeReview(FileVO rImg, ReviewVO review) throws Exception;
  //
  // List<ReviewVO> getBoardList(int page, PageInfo pageInfo) throws Exception;
  //
  // ReviewVO getBoard(int board_num) throws Exception;
  //
  // void regReply(ReviewVO review) throws Exception;
  //
  // void modifyBoard(ReviewVO review) throws Exception;
  //
  // void removeBoard(int board_num, String password) throws Exception;

}

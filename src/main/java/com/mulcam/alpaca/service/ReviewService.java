package com.mulcam.alpaca.service;

import java.util.List;
import com.mulcam.alpaca.vo.PageInfo;
import com.mulcam.alpaca.vo.Review;

public interface ReviewService {
  void regBoard(Review review) throws Exception;

  List<Review> getBoardList(int page, PageInfo pageInfo) throws Exception;

  Review getBoard(int board_num) throws Exception;

  void regReply(Review review) throws Exception;

  void modifyBoard(Review review) throws Exception;

  void removeBoard(int board_num, String password) throws Exception;

}

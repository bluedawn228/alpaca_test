package com.mulcam.alpaca.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.mulcam.alpaca.vo.Review;

@Mapper
@Repository("reviewDAO")
public interface ReviewDAO {
  int selectMaxBoardNum() throws Exception;

  void insertBoard(Review review) throws Exception;

  int selectBoardCount() throws Exception;

  List<Review> selectBoardList(int startrow) throws Exception;

  Review selectBoard(int board_num) throws Exception;

  void updateReadCount(int board_num) throws Exception;

  void updateBoardReSeq(Review review) throws Exception;

  String selectPassword(int board_num) throws Exception;

  void updateBoard(Review review) throws Exception;

  void deleteBoard(int board_num) throws Exception;


}

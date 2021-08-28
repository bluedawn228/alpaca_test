package com.mulcam.alpaca.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.mulcam.alpaca.vo.FileVO;
import com.mulcam.alpaca.vo.ReviewVO;

@Mapper
@Repository("reviewDAO")
public interface ReviewDAO {

  // 글쓰기
  int selectRImgNextval() throws Exception;

  void insertRImg(FileVO rImg) throws Exception;

  void insertReview(ReviewVO review) throws Exception;

  void insertReviewTemp(ReviewVO reviewTemp) throws Exception;


  // 게시판 리스트
  int selectReviewCount() throws Exception;

  List<ReviewVO> selectReviewList(int startrow) throws Exception;

  String selectNameByE(String email) throws Exception; // 안씀


  // 키워드 게시판 리스트
  int selectReviewKeyCount(String keyword) throws Exception;

  List<ReviewVO> selectReviewKeyList(@Param("startrow") int startrow,
      @Param("keyword") String keyword) throws Exception;


  // 임시저장 게시판 리스트
  int selectRTempCount(ReviewVO review) throws Exception;

  List<ReviewVO> selectRTempList(@Param("startrow") int startrow, @Param("reviewId") int reviewId,
      @Param("email") String email) throws Exception;


  // 게시글 상세
  ReviewVO selectReview(int reviewId) throws Exception;

  ReviewVO selectReviewPre(int reviewId) throws Exception;

  ReviewVO selectReviewNext(int reviewId) throws Exception;

  void updateLikeCount(int reviewId) throws Exception;

  void updateViewCount(int reviewId) throws Exception;

  // 게시글 상세 - 첨부파일

  FileVO getFile(int fileId);

  void deleteFile(int fileId);


  // 게시글 수정
  void updateReview(ReviewVO review) throws Exception;

  void updateRImg(FileVO rImg) throws Exception;



  // 게시글 삭제
  void deleteReview(int reviewId) throws Exception;


}

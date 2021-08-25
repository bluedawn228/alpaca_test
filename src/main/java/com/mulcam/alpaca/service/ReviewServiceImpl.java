package com.mulcam.alpaca.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mulcam.alpaca.dao.ReviewDAO;
import com.mulcam.alpaca.vo.PageInfo;
import com.mulcam.alpaca.vo.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
  @Autowired
  private ReviewDAO reviewDAO;

  @Override
  public void regBoard(Review review) throws Exception {
    int board_num = reviewDAO.selectMaxBoardNum() + 1;
    review.setBOARD_NUM(board_num);
    review.setBOARD_RE_REF(board_num);
    review.setBOARD_RE_LEV(0); // null값이면 시스템 죽음 세팅해줘야
    review.setBOARD_RE_SEQ(0);
    review.setBOARD_READCOUNT(0);
    reviewDAO.insertBoard(review);
  }

  @Override
  public List<Review> getBoardList(int page, PageInfo pageInfo) throws Exception {
    int listCount = reviewDAO.selectBoardCount(); // 총 게시글 수
    // 총 페이지 수 (올림처리 ex)게시글 95개, 페이지수 10개)
    int maxPage = (int) Math.ceil((double) listCount / 10); // ceil:올림처리
    // 현재 페이지에 보여줄 시작 페이지 수
    int startPage = (((int) ((double) page / 10 + 0.9)) - 1) * 10 + 1; // 현재페이지 기준 계산법
    // 현재 페이지에 보여줄 마지막 페이지 수
    int endPage = startPage + 10 - 1;
    if (endPage > maxPage) // 총 95페이지 인데 endPage 100페이지 일 수 없으므로
      endPage = maxPage;
    pageInfo.setEndPage(endPage); // 현재 페이지 기준(18)으로 시작페이지(11) 끝페이지(20)
    pageInfo.setListCount(listCount);
    pageInfo.setMaxPage(maxPage);
    pageInfo.setPage(page);
    pageInfo.setStartPage(startPage);
    int startrow = (page - 1) * 10 + 1;

    return reviewDAO.selectBoardList(startrow);
  }

  @Override
  public Review getBoard(int board_num) throws Exception {
    reviewDAO.updateReadCount(board_num); // 조회수 증가
    return reviewDAO.selectBoard(board_num);
  }

  @Override
  public void regReply(Review review) throws Exception {
    reviewDAO.updateBoardReSeq(review);
    int boardNum = reviewDAO.selectMaxBoardNum() + 1;
    review.setBOARD_NUM(boardNum);
    review.setBOARD_RE_LEV(review.getBOARD_RE_LEV() + 1);
    review.setBOARD_RE_SEQ(review.getBOARD_RE_SEQ() + 1);
    reviewDAO.insertBoard(review);

  }

  // String selectPassword(int board_num) throws Exception;
  // void updateBoard(Board board) throws Exception;
  @Override
  public void modifyBoard(Review review) throws Exception {
    String pass = reviewDAO.selectPassword(review.getBOARD_NUM());
    if (!pass.equals(review.getBOARD_PASS()))
      throw new Exception("비밀번호 틀림. 수정권한 없음");
    reviewDAO.updateBoard(review);
  }

  @Override
  public void removeBoard(int board_num, String password) throws Exception {
    String pass = reviewDAO.selectPassword(board_num);
    if (!pass.equals(password))
      throw new Exception("삭제 권한 없음");
    reviewDAO.deleteBoard(board_num);
  }
}

package com.mulcam.alpaca.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.mulcam.alpaca.vo.RCommVO;
import com.mulcam.alpaca.vo.ReviewVO;

public interface ReviewController {
  ModelAndView writeReview();

  ModelAndView writeReview(@ModelAttribute ReviewVO review, @RequestParam MultipartFile file,
      RedirectAttributes redirectAttrs);

  ModelAndView boardList(
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardKeyList(
      @RequestParam(value = "page", required = false, defaultValue = "1") int page,
      @RequestParam(defaultValue = "") String keyword);

  ModelAndView boardDetail(@RequestParam("reviewId") int reviewId,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardDetailPre(@RequestParam("reviewId") int reviewId,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardDetailNext(@RequestParam("reviewId") int reviewId,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ResponseEntity<byte[]> getImageFile(@PathVariable int fileId) throws Exception;

  void reviewLikeCall(@RequestParam(value = "reviewId", required = true) String reviewId,
      HttpServletResponse response) throws Exception;

  ModelAndView removeBoard(@RequestParam("reviewId") int reviewId,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);


  ModelAndView addRComm(@ModelAttribute RCommVO rComm) throws Exception;

  //
  // ModelAndView replyform(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page);
  //
  // ModelAndView boardReply(
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page,
  // @ModelAttribute ReviewVO board);
  //
  // ModelAndView modifyForm(@RequestParam("board_num") int board_num);
  //
  // ModelAndView boardModify(@ModelAttribute ReviewVO board);
  //
  // ModelAndView deleteform(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page);
  //

}

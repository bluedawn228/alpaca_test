package com.mulcam.alpaca.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.mulcam.alpaca.vo.Review;

public interface ReviewController {
  ModelAndView writeform();

  ModelAndView boardWrite(@ModelAttribute Review review, MultipartHttpServletRequest multi);

  ModelAndView boardList(
      // required = false, defaultValue = "1" : 처음페이지 부를때 특정 페이지목록 url 짚어 부르지 않으므로 그때는 1페이지보여주자
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardDetail(@RequestParam("board_num") int board_num,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView replyform(@RequestParam("board_num") int board_num,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardReply(
      @RequestParam(value = "page", required = false, defaultValue = "1") int page,
      @ModelAttribute Review board);

  ModelAndView modifyForm(@RequestParam("board_num") int board_num);

  ModelAndView boardModify(@ModelAttribute Review board);

  ModelAndView deleteform(@RequestParam("board_num") int board_num,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  ModelAndView boardDelete(@RequestParam("board_num") int board_num,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page,
      @RequestParam("BOARD_PASS") String password);
}

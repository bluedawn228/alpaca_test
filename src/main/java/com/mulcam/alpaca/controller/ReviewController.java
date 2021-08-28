package com.mulcam.alpaca.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.mulcam.alpaca.vo.ReviewVO;

public interface ReviewController {
  ModelAndView writeReview();

  ModelAndView writeReview(@ModelAttribute ReviewVO review, @RequestParam MultipartFile file,
      RedirectAttributes redirectAttrs);

  ModelAndView boardList(
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);



  ModelAndView boardDetail(@RequestParam("reviewId") int reviewId,
      @RequestParam(value = "page", required = false, defaultValue = "1") int page);

  // @GetMapping(value = {"/img/{fileId}", "/pds/{fileId}"})
  // ResponseEntity<byte[]> getImageFile(@PathVariable int fileId);


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
  // ModelAndView boardDelete(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page,
  // @RequestParam("BOARD_PASS") String password);
}

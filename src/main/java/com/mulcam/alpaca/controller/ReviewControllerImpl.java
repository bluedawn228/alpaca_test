package com.mulcam.alpaca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.mulcam.alpaca.service.ReviewService;
import com.mulcam.alpaca.vo.FileVO;
import com.mulcam.alpaca.vo.ReviewVO;

@Controller
@RequestMapping("/review")
public class ReviewControllerImpl implements ReviewController {
  @Autowired
  private ReviewService reviewService;

  @Override
  @GetMapping("/write_review")
  public ModelAndView writeReview() {
    ModelAndView mav = new ModelAndView("main");
    mav.addObject("page", "review/board_write");
    return mav;
  }

  @Override
  @PostMapping("/write_review")
  public ModelAndView writeReview(@ModelAttribute ReviewVO review, @RequestParam MultipartFile rImg,
      RedirectAttributes redirectAttrs) {
    ModelAndView mv = new ModelAndView();
    System.out.println("aa");
    try {
      FileVO newFile = null;
      if (rImg != null && !rImg.isEmpty()) { // &&button name='1'
        newFile = new FileVO();
        newFile.setFileName(rImg.getOriginalFilename());
        newFile.setFileSize(rImg.getSize());
        newFile.setFileContentType(rImg.getContentType());
        newFile.setFileData(rImg.getBytes());
      }
      reviewService.writeReview(newFile, review);
      mv.setViewName("redirect:/review/boardlist");
    } catch (Exception e) {
      e.printStackTrace();
      mv.addObject("err", "새 글 등록 실패");
      mv.setViewName("/review/err");
    }
    return mv;
  }



  // @Override
  // @RequestMapping(value = "boardlist", method = {RequestMethod.GET, RequestMethod.POST})
  // public ModelAndView boardList(
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
  // PageInfo pageInfo = new PageInfo();
  // ModelAndView mv = new ModelAndView();
  // try {
  // List<Review> articleList = reviewService.getBoardList(page, pageInfo); // pageInfo 출력해야해. 붕어빵틀
  // // 줄테니 page값으로 만들어와
  // mv.addObject("pageInfo", pageInfo); // 하단 start end page값 넘길게
  // mv.addObject("articleList", articleList); // 게시글10개 리스트 넘길게
  // mv.setViewName("/review/listform"); // 화면에 이걸 띄워줘
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", e.getMessage());
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  //
  // @GetMapping("/fileview/{filename}") // 서버->브라우저 불러오기 매소드 / getRealPath("/uploadBoard/"); 폴더에
  // // 클라이언트가 업로드한파일저장
  // public void fileview(@PathVariable String filename, HttpServletRequest request,
  // HttpServletResponse response) {
  // String path = request.getServletContext().getRealPath("/uploadBoard/");
  // File file = new File(path + filename);
  //
  // String sfilename = null;
  // FileInputStream fis = null;
  // try {
  // // 한글 파일명 깨지지 않게 인코딩
  // if (request.getHeader("User-Agent").indexOf("MSIE") > -1) { // ie
  // sfilename = URLEncoder.encode(file.getName(), "utf-8");
  // } else { // 나머지 브라우저
  // sfilename = new String(file.getName().getBytes("utf-8"), "ISO-8859-1");
  // }
  // response.setCharacterEncoding("utf-8");
  // response.setContentType("application/octet-stream;charset=utf-8");
  // response.setHeader("Content-Disposition", "attachment; filename=\"" + sfilename + "\";");
  // OutputStream out = response.getOutputStream();
  // fis = new FileInputStream(file);
  // FileCopyUtils.copy(fis, out);
  // out.flush();
  // } catch (Exception e) {
  // e.printStackTrace();
  // } finally {
  // if (fis != null) {
  // try {
  // fis.close();
  // } catch (Exception e) {
  // }
  // }
  // }
  // }
  //
  //
  // @Override
  // @GetMapping("/boarddetail")
  // public ModelAndView boardDetail(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
  // ModelAndView mv = new ModelAndView();
  // try {
  // Review board = reviewService.getBoard(board_num);
  // mv.addObject("article", board);
  // mv.addObject("page", page);
  // mv.setViewName("/review/viewform");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", "글 조회 실패");
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  // @Override
  // @GetMapping("/replyform")
  // public ModelAndView replyform(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
  // ModelAndView mv = new ModelAndView();
  // try {
  // Review board = reviewService.getBoard(board_num);
  // mv.addObject("article", board);
  // mv.addObject("page", page);
  // mv.setViewName("/review/replyform");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", "조회 실패");
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  // @Override
  // @PostMapping("boardreply")
  // public ModelAndView boardReply(
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page,
  // @ModelAttribute Review review) {
  // ModelAndView mv = new ModelAndView();
  // review.setBOARD_FILE("");
  // try {
  // reviewService.regReply(review);
  // mv.addObject("page", page);
  // mv.setViewName("redirect:/review/boardlist");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", "답글 등록 실패");
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  // @Override
  // @GetMapping("/modifyform")
  // public ModelAndView modifyForm(@RequestParam("board_num") int board_num) {
  // ModelAndView mv = new ModelAndView();
  // try {
  // Review review = reviewService.getBoard(board_num);
  // mv.addObject("article", review);
  // mv.setViewName("/review/modifyform");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", "조회 실패");
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  // @Override
  // @PostMapping("boardmodify")
  // public ModelAndView boardModify(@ModelAttribute Review review) {
  // ModelAndView mv = new ModelAndView();
  // try {
  // reviewService.modifyBoard(review);
  // mv.addObject("board_num", review.getBOARD_NUM());
  // mv.setViewName("redirect:/review/boarddetail");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", e.getMessage());
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
  //
  // @Override
  // @GetMapping("/deleteform")
  // public ModelAndView deleteform(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
  // ModelAndView mv = new ModelAndView();
  // mv.addObject("page", page);
  // mv.addObject("board_num", board_num);
  // mv.setViewName("/review/deleteform");
  // return mv;
  // }
  //
  // @Override
  // @PostMapping("/boarddelete")
  // public ModelAndView boardDelete(@RequestParam("board_num") int board_num,
  // @RequestParam(value = "page", required = false, defaultValue = "1") int page,
  // @RequestParam("BOARD_PASS") String password) {
  // ModelAndView mv = new ModelAndView();
  // try {
  // reviewService.removeBoard(board_num, password);
  // mv.addObject("page", page);
  // mv.setViewName("redirect:/review/boardlist");
  // } catch (Exception e) {
  // e.printStackTrace();
  // mv.addObject("err", e.getMessage());
  // mv.setViewName("/review/err");
  // }
  // return mv;
  // }
}

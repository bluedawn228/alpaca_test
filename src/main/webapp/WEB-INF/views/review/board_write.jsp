<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mr. Alpaca</title>
    <link rel="shortcut icon" href="favicon/favicon1.ico">

    <!-- font awesome CDN -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous">

    <!-- bootstrap
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous"> -->

    <!-- custom styles -->
    <link rel="stylesheet" href="/style/main.css">
    <link rel="stylesheet" href="/style/board_write.css">
    <link rel="stylesheet" href="/style/board_detail.css">
    <link rel="stylesheet" href="/style/mypage.css">

    <!-- java script -->
    <script defer src="js/index.js"></script>
</head>
<body>
    <!-- 머리말 시작 -->
    <header>
        <nav class="nav">
            <!-- my page 링크 -->
            <a href="mypage-profile.html" class="my-page-link">M</a>

            <!-- 사이트 명 -->
            <ul class="nav-sub nav-title">
                <a href="main.html">
                    <li class="nav-sub-li">
                        <span class="nav-title-mr">Mr.</span>
                        <span class="nav-title-alpaca">
                            Alpaca
                        </span>
                        <div class="line"></div>
                    </li>
                </a>
            </ul>

            <!-- 네비게이션 메뉴 -->
            <ul class="nav-sub nav-menu">
                <a href="main.html">
                    <li>홈</li>
                </a>
                <a href="interview_main.html">
                    <li class="nav-sub-box">면접하기
                        <ul class="nav-sub-sub">
                            <!-- test class needs to be deleted -->
                            <a href="interview_normal.html"><li>일반면접모드</li></a>
                            <a href="interview_recruit.html"><li>채용공고모드</li></a>
                            <li class="keyword-popup btn">맞춤모드</li>
                            <a href="interview_mentor.html"><li class="sub-last-item">멘토모드</li></a>
                        </ul>
                    </li>
                </a>
                <a href="board_total.html">
                    <li class="nav-sub-box">커뮤니티
                        <ul class="nav-sub-sub">
                            <a href="board_write.html"><li>후기 작성하기</li></a>
                            <a href="board_interview_review.html"><li>인터뷰 후기보기</li></a>
                            <a href="board_free.html"><li>자유게시판보기</li></a>
                            <a href="board_recommend.html"><li>제안 질문보기</li></a>
                            <a href="board_best_answers.html"><li>모범 답안보기</li></a>
                            <a href="board_total.html"><li class="sub-last-item">질문 답변보기</li></a>
                        </ul>
                    </li>
                </a>
                <a href="recruit_list.html">
                    <li class="nav-sub-box">채용공고</li>
                </a>
                <a href="login_person.html">
                    <li class="nav-sub-box">로그인
                        <ul class="nav-sub-sub">
                            <a href="login_person.html"><li>일반회원</li></a>
                            <a href="login_business.html"><li class="sub-last-item">기업회원</li></a>
                        </ul>
                    </li>
                </a>
                <a href="join_person.html">
                    <li class="nav-sub-box">회원가입
                        <ul class="nav-sub-sub">
                            <a href="join_person.html"><li>일반회원</li></a>
                            <a href="join_business.html"><li class="sub-last-item">기업회원</li></a>
                        </ul>
                    </li>
                </a>
            </ul>
        </nav>
    </header>

    <!-- 본문 시작 -> 여기서 작업하세요 -->
    <main>
        <!-- 타이틀 더미 -->
        <div class="dummy"></div>

        <!-- 글쓰기 폼 -->
        <div class="board-total mypage">
            <div class="board-container mypage-left">
                <!-- 게시판 메뉴 -->
                <div class="mypage-left-bottom">
                    <ul>
                        <a href="board_review.html"><li>면접후기게시판</li></a>
                        <a href="board_free.html"><li>자유게시판</li></a>
                        <a href="board_total.html"><li>전체질문</li></a>
                        <a href="board_recommend.html"><li>면접질문</li></a>
                        <a href="board_best_answers.html"><li>모범답안</li></a>
                    </ul>
                </div>
            </div>
            <div class="board mypage-right">
                <!-- 페이지 타이틀 -->
                <h1 class="page-title-left">글쓰기</h1>

                <!-- 구분선 -->
                <div class="line"></div>
                
                <form action="/review/write_review" method="post" class="write" enctype="multipart/form-data" name="write_review">
                    <div class="detail-row">
                        <div>
                            <label for="">포지션</label> 
                            <input type="text" name="pos"
						id="pos" required="required" />
                        </div>
                    </div>
                
                    <div class="detail-row">
                        <div>
                            <label for="">회사명</label>
                            <input type="text" name="company"
						id="company" required="required" />
                        </div>             
                    </div>
                
                    <div class="detail-row">
                        <div>
                            <label for="title">제목</label>
                            <input type="text" name="title"
						id="title" required="required" />
                        </div>
                    </div>
                
                    <label for="content">내용</label>
                    <textarea name="content" id="content" cols="30" rows="10" required="required"></textarea>
                
                    <div class="detail-row">
                        <input type="file" name="rImg">
                		<button type="reset" class="btn write-btn">다시쓰기</button>
                        <button type="submit" id="1" name="1" class="btn write-btn">임시저장</button>
                        <button type="submit" id="0" name="0" class="btn write-btn">등록</button>
                    </div>
                </form>
            </div>
        </div>

    </main>

    <!-- 꼬리 시작 -->
    <footer>
        <!-- 깃 허브 링크 -->
        <div class="developers">
            <a class="hayoon" href="https://github.com/orgs/Team-HANOI/dashboard">
                <i class="fab fa-github-square fa-4x"></i>
                <p class="developers-id">Team-HANOI</p>
            </a>
            <a class="hayoon" href="https://github.com/HAYOON26">
                <i class="fab fa-github-square fa-4x developers-git"></i>
                <p class="developers-id">HAYOON26</p>
            </a>
            <a class="hayoon" href="https://github.com/AngryPig123">
                <i class="fab fa-github-square fa-4x developers-git"></i>
                <p class="developers-id">AngryPig123</p>
            </a>
            <a class="hayoon" href="https://github.com/hs95blue">
                <i class="fab fa-github-square fa-4x developers-git"></i>
                <p class="developers-id">hs95blue</p>
            </a>
            <a class="hayoon" href="https://github.com/jin-co">
                <i class="fab fa-github-square fa-4x developers-git"></i>
                <p class="developers-id">jin-co</p>
            </a>
        </div>

        <!-- copyright, 소개글 -->
        <div class="footer-text">
            <p>
                &copy;2021
            </p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos earum odit similique ratione ipsam quisquam nam architecto veritatis expedita porro pariatur nemo modi neque officia eligendi reprehenderit doloribus, optio blanditiis.</p>
        </div>
    </footer>
</body>
</html>


    
    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>footer</title>
<link rel="icon" type="image/png" href="imgs/favicon.png" />
<link
  href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700&display=swap"
  rel="stylesheet"
/>

<link rel="stylesheet" href="${contextPath}/resources/css/home.css">
<script src="${contextPath}/resources/js/main.js" defer></script>
<script
  src="https://kit.fontawesome.com/9eb162ac0d.js"
  crossorigin="anonymous"
></script>

</head>


<body>

    <!-- Home -->
    <section id="home">
      <div class="home__container">
        <!-- <h2 class="home__description">
         국제 NLP코칭 사관학교
        </h2>
        <h1 class="home__title">소책자 배포 이벤트<br /></h1> -->
        <button class="home__btn" onclick = "location.href = 'https://www.naver.com/' ">나도 받아보기</button>
      </div>
    </section>

    <!-- Intro -->
    <section id="intro" class="section section__container">
      <h1>NLP란</h1>
      <br>
        NLP는 인식테스트를 거치고 나면, 우리는 각자의 버전을 구성하며 살아간다는 사실을 깨닫게 됩니다. </br>그 버전을 당신이 상상할 수 있는 최고의 현실 버전으로 만들기 위한 도구들을 배우는 과정이 바로 NLP입니다.</br>
        여러분이 상상할 수 있는 최고의 존재로 정교한 최적화 작업을 진행해 봅시다!
      </p>
      <div class="about__majors">
        <div class="major">
          <div class="major__icon">
            <i class="far fa-file-alt"></i>
          </div>
          <h2 class="major__title">인식 테스트</h2>
          <div class="major__description">
            우리가 진짜라고 인식하는 것,
            <br />무의식의 힘을 알아봅니다
          </div>
        </div>
        <div class="major">
          <div class="major__icon">
            <i class="fas fa-user"></i>
          </div>
          <h2 class="major__title">인간사용설명서</h2>
          <p class="major__description">
            NLP는 긍정적인 결과를 이끄는 마인드 셋,
            <br />그 이상의 훈련과정 입니다
          </p>
        </div>
        <div class="major">
          <div class="major__icon">
            <i class="fas fa-server"></i>
          </div>
          <h2 class="major__title">수강생 후기</h2>
          <p class="major__description">
            국제공인 자격과정을 수료한
            <br />수강생들의 리얼 후기를 만나보세요
          </p>
        </div>
      </div>
    </section>


    <!-- lecture -->
    <section id="lecture" class="section">
     <div class="section__container">
      <h1>강의 리스트</h1>
      <h3>7월 인기 있는 강의</h3>
      <div class="work__categories">
        <button class="category__btn selected" data-filter="*">
          전체보기 <span class="category__count">8</span>
        </button>
        <button class="category__btn" data-filter="front-end">
          NLP자격과정 <span class="category__count">3</span>
        </button>
        <button class="category__btn" data-filter="back-end">
          심리/마인드 <span class="category__count">3</span>
        </button>
        <button class="category__btn" data-filter="mobile">
          성공학 <span class="category__count">2</span>
        </button>
      </div>

      <div class="work__projects">
        <a href="/lecture/lecIntro" class="project" target="blank" data-type="front-end">
          <img
            src="/fileview/thumbnail01.jpg"
            alt="Youtube"
            class="project__img"
          />
          <div class="project__description">
            <h3>국제공인 자격과정</h3>
            <span>NLP프랙티셔너1</span>
          </div>
        </a>

        <a
          href="/lecture/lecIntro"
          class="project"
          data-type="front-end"
          target="blank"
        >
          <img
            class="project__img"
            src="/fileview/thumbnail01.jpg"
            alt="navbar"
          />
          <div class="project__description">
            <h3>국제공인 자격과정</h3>
            <span>NLP 마스터 프랙티셔너2</span>
          </div>
        </a>

        <a
          href="/lecture/lecIntro"
          class="project"
          data-type="front-end"
          target="blank"
        >
          <img class="project__img" src="/fileview/thumbnail01.jpg" alt="navbar" />
          <div class="project__description">
            <h3>국제공인 자격과정</h3>
            <span>MBST 프랙티셔너3</span>
          </div>
        </a>

        <a href="/lecture/lecIntro" class="project" data-type="back-end">
          <img class="project__img" src="/fileview/thumbnail11.jpg" alt="" />
          <div class="project__description">
            <h3>Project</h3>
            <span>Explanation</span>
          </div>
        </a>
        <a href="" class="project" data-type="back-end">
          <img class="project__img" src="/fileview/thumbnail12.jpg" alt="" />
          <div class="project__description">
            <h3>Project</h3>
            <span>Explanation</span>
          </div>
        </a>
        <a href="/lecture/lecIntro" class="project" data-type="mobile">
          <img class="project__img" src="/fileview/thumbnail13.jpg" alt="" />
          <div class="project__description">
            <h3>Project</h3>
            <span>Explanation</span>
          </div>
        </a>
        <a href="/lecture/lecIntro" class="project" data-type="mobile">
          <img class="project__img" src="/fileview/thumbnail14.jpg" alt="" />
          <div class="project__description">
            <h3>Project</h3>
            <span>Explanation</span>
          </div>
        </a>
        <a href="/lecture/lecIntro" class="project" data-type="mobile">
          <img class="project__img" src="/fileview/thumbnail11.jpg" alt="" />
          <div class="project__description">
            <h3>Project</h3>
            <span>Explanation</span>
          </div>
        </a>
      </div>
     </div>
    </section>

    <!-- Testimonials -->
    <section id="testimonials" class="section">
   <div class="section__container">
    <h1>추천사</h1>
    <h3>국제공인 자격과정을 수료한 리더들의 후기</h3>
    <div class="testimonials">
      <div class="testimonial">
        <img
          src="/fileview/임종복1.jpg"
          alt="People"
          class="testimonial__avatar"
        />
        <div class="testimonial__speech-bubble">
          <p>
            국제공인 NLP프랙티셔너 자격과정은 제 인생을 송두리째 바꿔 놓았습니다! 이 코스는 매우 디테일하게 설계되어 있고 이론 뿐만 아니라 실습 과정도 있습니다. 약간의 시간과 노력을 기울인다면  정말 파워풀한 결과를 삶 속에서 만들어 낼 것입니다. 
          </p>
          <p class="name"><a href="">임종복 교수</a> / 상명대학교 지도교수</p>
        </div>
      </div>
      <div class="testimonial">
        <div class="testimonial__speech-bubble">
          <p>
            루크 박사님의 강의는 매우 교육적이고, 명확하며, 가치 있는 강의입니다! 이 과정을 정말 즐겁게 수강했어요. 이론적인 기술 지식 뿐만 아니라 삶 속에 녹여내는 경험을 통해 흥미진진한 형식으로 풀어나갑니다. 정말 감사합니다^^
          </p>
          <p class="name"><a href="">김주회 교수</a> / 한국대학발명협회 IP전문교수</p>
        </div>
        <img
        src="/fileview/김주회교수님.jpg"
        alt="People"
        class="testimonial__avatar"
      />
      </div>
      <button class="testimonial__btn" onclick="location='/board/boardlist'">수강생 후기 더보기</button>

    </div>
   </div>
    </section>


</body>
</html>
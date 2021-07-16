# 1. PREVIEW & 개요
[KH]스마트 콘텐츠 융합 응용SW 엔지니어 양성과정 중 파이널프로젝트 이며 "와디즈 " 라는사이트 클론코딩으로 구현한 사이트입니다 
구현기간:2021/ 06/03 ~ 2021/07/08 입니다.

### `구현한 사이트 주소 입니다.` (http://interact-funding.kro.kr/)  

## 2. 프로젝트 요구사항

### - 프로젝트 전반

벤치마킹 크라우드 펀딩 와디즈를 웹 어플리케이션을 구현하였고,

자금조달의 문제로 인해 실행되지 못하는 아이디어 와 자금이 충분하지만

투자하고 싶은 상품이 없어서 곤란한 것들을 빛나는 아이디어를 가진 다양햔제품들 실현을 돕기위한 Interact Funding 애플리케이션 구현합니다.

## 3.역할 및 담당기능

※역할

팀내에 팀원

※담당기능

펀딩하기, 오픈예정 기능구현

회원조회, 블랙리스트 기능구현

## 4. 개발 목표 및 설계 주안점

1.Spring Framework, MVC 패턴, JQuery의 활용 능력 습 득

2.Bootstrap Framework   프레임워크 활용능력 습득

3.Gson 사용법 활용 능력 습득

4.JSTL 동적변수를 활용능력습득

## 5. 핵심 구현 기술 설명

**펀딩하기**

기본적으로 리스트와 이미지 슬라이드는 펀딩 중인 것과 종료된 펀딩을 펀딩이 올라온 순서로 조회(이미지 슬라이드는 올라온 순서 5개 무작위)

여러 개의 이미지를 버튼을 통해 슬라이드 효과를 넘길 수가 있으며, 해당 이미지 클릭 시 이에 맞는 상세페이지로 이동

각 카테고리마다 이미지를 하나씩 부여하여 클릭시 이에 맞는 카테고리 조건을 넣어 제공

최근 생성일 기준으로 리스트를 제공하고, 이미지 또는 제목을 클릭시 상세페이지로 이동

설정한 검색 조건에 따라 다른 리스트를 제공

검색 초기화는 카테고리를 제외한 모든 검색 조건을 모두 초기화

**오픈예정**

기본적으로 리스트와 이미지 슬라이드는 펀딩이 시작이 되지 않은 것을 펀딩이 올라온 순서로 조회(이미지 슬라이드는 올라온 순서 5개 무작위)

검색기능없고, 카테고리별로 없는 것을 제외하면 펀딩하기와 비슷함

상세페이지는 오픈상세페이지로 이동

**회원관리, 블랙리스트**

현재 가입한 회원은 가입한 순서로 조회

이메일, 이름을 조건으로 하여 회원 검색

사용권한을 사용자, 관리자로 변경가능

회원추방은 블랙리스트로 이동하고 블랙리스트 해제할 때 까지 회원가입 불가

블랙리스트 해제시 다시 회원가입 가능

## 6. 구현 기간

### - 프로젝트 기획 기간

2021.06.03~2021.06.10

### - 프로젝트 구현 기간

2021.06.03~2021.07.08

## 7. 사용 언어 및 도구

   ### O/S : Windows 10
   
   Server : Tomcat 9.0
   
   DBMS : Oracle 11g
   
   개발 언어 : JAVA, JSP, JavaScript, SQL, HTML5, CSS3
   
   개발 툴 : STS4, SQL Developer, Visual Studio Code
   
   Framework/library
   
   Spring, MyBatis, Bootstrap, CoolSMS , Mail-1.4.7, ojdbc6, summerNote, ImPort, taglibs, spring-webmvc
   
   카카오 지도/로컬, Scheduler (자동 알림), 카카오 OAUTH2.0

## 8.프로젝트 참여소감

** 협업의 경험과 실력이 향상 되었음을 느꼈습니다. **

세미프로젝트와 마찬가지로 처음에는 어렵고 막막하기도 했었지만 그래도 자신의 역할은 끝마치고 협업을 할 수 있어서 좋았습니다. 이번에는 JSP에서 JSTL로 바꾸는 것부터 시작하여 스프링과 MyBatis까지 공부를 하면서, 프로젝트와 함께 병행을 하는 것은 쉽지 않았습니다. 세미 때는 사용하지 않은 Bootstrap을 사용하면서 확장된 느낌인 만큼 배워야 할 것은 많았지만, 일반적인 CSS로 사용하는 것보단 좋았던 것 같았습니다. 파이널을 진행하면서 역할분담과 소통이 잘 되었던 부분이 즐겁게 파이널을 진행했다는 것이 느꼈습니다. 이런 의미로 세미때와 마찬가지로 유익한 시간이었지만, 아쉬운 부분도 있었습니다. 팀장과 팀원들이라면 다른 점이 아쉽다고 하겠지만, 저 같은 경우는 타 API 사용기회와 DB와 스프링을 활용한 **더보기** 구현을 이루질 못했다는 부분이었습니다. 미흡한 부분은 이보다 더 열심히 공부하여 기술을 향상할 수 있도록 노력하겠습니다.

## 9.별첨

https://drive.google.com/file/d/1bBDhJRyEOEmOvfDoq3FTsed1bVCF8qG8/view

# Contributors
[<img src="https://user-images.githubusercontent.com/62824389/124744204-7ac8de80-df59-11eb-86ff-28b65ca19886.jpg" width="120">](https://github.com/kimdia200)
[<img src="https://user-images.githubusercontent.com/62824389/124744203-7ac8de80-df59-11eb-8ca8-db42233b9833.jpg" width="120">](https://github.com/hohyuncheon)
[<img src="https://user-images.githubusercontent.com/62824389/124744193-78668480-df59-11eb-9eae-8e0c67a20689.jpg" width="120">](https://github.com/KIMJOOYEON97)
[<img src="https://user-images.githubusercontent.com/62824389/124744198-7997b180-df59-11eb-9aab-48a4b4939e28.jpg" width="120">](https://github.com/dygksqkr12)
[<img src="https://user-images.githubusercontent.com/62824389/124744201-7a304800-df59-11eb-89ec-e78f9cc84800.jpg" width="120">](https://github.com/onreverse01)
[<img src="https://user-images.githubusercontent.com/62824389/124744200-7a304800-df59-11eb-9ec3-537d0ab215ac.jpg" width="120">](https://github.com/rlwi440)

package com.min.app03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // 나는 요청과 응답을 처리하는 컨트롤러 입니다.
public class MvcController1 {

  /* 메소드 == 하나의 요청과 응답을 처리하는 단위 */
  /*
   * 반환타입
   *   1) String       : 사용자에게 보여 줄 (응답할) JSP 의 경로와 이름을 작성합니다.
   *   2) void
   *   3) ModelAndView
   *   4) ...
   * 
   * 메소드명
   *   아무런 의미가 없다.
   * 
   * 매개변수
   *   1) 요청과 응답을 처리하기 위한 각종 클래스나 변수를 선언한다.
   *   2) 주요 매개변수
   *     (1) HttpServletRequest 인터페이스  : 요청을 처리할 수 있는 인터페이스입니다.
   *     (2) HttpServletResponse 인터페이스 : 응답을 처리할 수 있는 인터페이스입니다.
   *     (3) Model 인터페이스               : 응답 데이터를 저장할 수 있는 인터페이스입니다.
   *     (4) HttpSession 인터페이스         : 세션을 처리할 수 있는 인터페이스입니다.
   */
  
  
  /*
   * @RequestMapping
   * 
   * 1. 요청 주소와 요청 메소드를 작성하는 Annotation 입니다.
   * 2. 요청 주소 (value)
   *   1) value="/"     : Context Path 요청을 의미합니다.              http://127.0.0.1:8080/app03
   *   2) value="/list" : /list 요청을 의미합니다.                     http://127.0.0.1:8080/app03/list
   *   3) value={"/list", "/list.do"} : 2개 이상의 요청을 의미합니다.  http://127.0.0.1:8080/app03/list
   *                                                                   http://127.0.0.1:8080/app03/list.do
   * 3. 요청 메소드 (method)
   *   1) method=RequestMethod.GET  : GET 방식을 의미합니다.
   *   2) method=RequestMethod.POST : POST 방식을 의미합니다.
   */
  
  @RequestMapping(value="/", method=RequestMethod.GET)
  public String welcome() {
    return "webdir1/index";  // return "/webdir1/index" 로 작성해도 스프링이 올바르게 해석해 줍니다.
    /*
     * return "webdir1/index"; 해석해 보기
     * 
     * 1. 리턴 값 "webdir1/index" 는 ViewResolver 에게 전달됩니다.
     *    (DispatcherServlet : servlet-context.xml 에 ViewResolver 가 정의되어 있습니다.)
     * 2. ViewResolver 는 "webdir1/index" 앞에 "/WEB-INF/views/" 문자열을 추가합니다. (prefix)
     * 3. ViewResolver 는 "webdir1/index" 뒤에 ".jsp" 문자열을 추가합니다. (suffix)
     * 4. ViewResolver 는 완성된 최종 View 로 이동합니다.
     *    (최종 View 의 모습 : "/WEB-INF/views/webdir1/index.jsp") 
     */
  }
  
  
  
  
  
  
  
}
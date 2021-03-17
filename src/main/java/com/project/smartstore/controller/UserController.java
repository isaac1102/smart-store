package com.project.smartstore.controller;

import com.project.smartstore.dto.UserDto;
import com.project.smartstore.service.UserService;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 *
 *
 * @RestController : @Controller와 @ResponseBody가 합쳐진 기능의 어노테이션입니다.
 *     또한 @RequestMapping 메서드가 @ResponseBody를 수행한다는 의미도 있습니다.
 *
 * @RequiredArgsConstructor :이 어노테이션은 초기화 되지않은 final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성해 줍니다.
 *     주로 의존성 주입(Dependency Injection) 편의성을 위해서 사용되곤 합니다.
 *
 * @RequestBody 어노테이션과  @ResponseBody 어노테이션은 각각 HTTP 요청 몸체를 자바 객체로 변환하는 데 사용된다.
 *     이 어노테이션을 이용하면 HTTP 요청 몸체를 자바 객체로 전달받을 수 있다.
 *     비슷하게 @ResponseBody 어노테이션을 이용하면 자바 객체를 HTTP 응답 몸체로 전송할 수 있다.
 *
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  /**
   * 회원가입 메서드.
   */
  @PostMapping("/join")
  public HttpStatus joinUser(@RequestBody UserDto user) {

    userService.joinUser(user);

    return HttpStatus.CREATED;
  }

  /**
   * 로그인 메서드.
   */
  @PostMapping("/login")
  public HttpStatus loginUser(@RequestBody UserDto user, HttpSession session) {

    if (!userService.loginUser(user, session)) {
      return HttpStatus.NOT_FOUND;
    }

    return HttpStatus.OK;
  }
}

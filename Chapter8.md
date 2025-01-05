# Chapater 8

### 스프링 시큐리티
- 스프링 시큐리티 : 스프링 기반의 애플리케이션 보안(인증, 인가 , 권한)을 담당하는 스프링 하위 프레임 워크로 개발자가 보안 관련 개발을  해야 한느 부담을 크게 줄여준다 . 
  - 인증 : 사용자의 신원을 입증하는 과정
  - 인가 : 사이트의 특정 부분에 접근할 수 있는지 권한을 확인하는 작업
- CSRF 공격, 세션 고정 공격을 방어 해주고, 요청 헤더도 보안 처리를 해준다
  - CSRF 공격 : 사용자의 권한을 가지고 특정 동작을 수행하도록 유도하는 공격
  - 세션 고정 공격 : 사용자의 인증 정보를 탈취하거나 변조하는 공격
<br><br>

requestMatchers() : 특정 요청과 일치하는 url에 대한 엑세스를 설정합니다 <br>
permitAll() : 누구나 접근이 가능하게 설정합니다. 즉,"/login","/signup","/user"로 요청이 오면 인증/인가 없이도 접근할 수 있습니다.<br>
anyRequest() : 위에서 설정한 url 이외에 요청에 대해서 설정합니다.<br>
authenticated() : 별도의 인가는 필요하지 않지만 인증이 성공된 상태여야 접근할 수 있습니다. <br><br>
loginPage() : 로그인 페이지 경로를 설정합니다. <br>
defaultSuccessUrl() : 로그인이 완료되었을 때 이동할 경로를 설정합니다. <br><br>
logoutSuccessUrl() : 로그아웃이 완료되었을 때 이동할 경로를 설정합니다. <br>
invalidateHttpSession() : 로그아웃 이후에 세션을 전체 삭제할 지 여부를 결정합니다.<br><br>
csrf(AbstractHttpConfigurer::disable) : CSRF 설정을 비활성화 합니다.<br><br>
UserDetailsService() : 사용자 정보를 가져올 서비스를 설정합니다. 이때 설정하는 서비스 클래스는 반드시 UserDeatailsService를 상속받은 클래스여야 합니다.<br>
passwordEncoder() : 비밀번호를 암호화하기 위한 인코더를 설정합니다.
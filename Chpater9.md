# Chapter9

### 토큰 기반 인증
 - 토큰 기반 인증 : 서버가 토큰을 생성해서 클라이언트에게 제공 -> <br>클라이언트는 이 토큰을 갖고 있다가 여러 요청을 이 토큰과 함께 신청 -><br> 서버는 토큰만 보고 유효한 사용자인지 검증
   - 토큰 : 서버에서 클라이언트를 구분하기 위한 유일한 값
     <br>


- 토큰 기반 인증의 특징 :
  - 무상태성 : 토큰이 서버가 아닌 클라이언트에 저장되어 있으므로 서버에 저장할 필요가 없다.
  - 확장성 : 무상태성으로 인해 서버를 상태 관리를 신경 쓸 필요가 없으니 서버 확장에도 용이하다 
  - 무결성 : 토큰을 발급한 이후에는 토큰 정보를 변경하는 행위를 할 수 없습니다.


- JWT 
  - 구조 : 'aaaa.bbbbb.ccccc' .을 기준으로 헤더 내용 서명 으로 이루어져있다.
    - 헤더 : 토큰의 타입과 해생 알고리즘을 지정하는 정보를 담는다
    - 내용 : 토큰과 관련된 정보를 담는다. 내용의 한 덩어리를 클레임 이라고 부르며, 클레임은 키값의 한 쌍으로 이루어져 있다.
      - 클레임의 구성 요소 : <br>
      - |이름| 설명                  |
        |:---|:--------------------|
        |iss| 토큰발급자               |
        |sub| 토큰제목                |
        |aud| 토큰 대상자              |
        |exp| 토큰의 만료 시간           |
        |nbf| 토큰의 활성 날짜와 비슷한 개념   |
        |iat| 토큰이 발급된 시간          |
        |jti| JWT의 고유 식별자         |
    - 서명 : 해당 토큰이 조작되었거나 변경되지 않았음을 확인하는 용도로 사용
  - 토큰의 유효기간 : 토큰을 주고받는 환경이 취약해서 노출되는 경우를 대비해 새로운 액세스 토큰을 발급하기 위해 사용\
  - 
# Chapter 2

### 스프링과 스프링부트의 차이점
- 첫번째 : 스프링은 개발의 환경을 수동으로 설정해야 하지만 스프링부트는 자동으로 로드함
- 두번째 : 스프링 애플리케이션은 일반적으로 WAS에서 배포되지만 스프링 부트는 WAS를 자체적으로 가지고있음

### IoC (Inversion of Control) : 제어의 역전
- 객체의 생성과 관리를 개발자가 하는 것이 아닌 프레임워크가 대신하는 것

예시

    public class A {
        private B b;
    }

### DI (Dependency Injection) : 의존성 주입
- 외부에서 객체를 주입받아 사용하는 것

예시 
    
    public class A{
    //A에서 B를 주입받음
    @Autowired
    B b;
    }

### 스프링 컨테이너
- 빈을 생성하고 관리하는 것

### 빈
- 스프링에서 제공해주고 관리해주는 객체

클래스를 빈으로 등록하는 법 예시)
    
    @Component
    public class MyBean{
    }

### AOP (Aspect Oriented Programming) : 관점 지향 프로그래밍
- 프로그래밍에 대한 관심을 핵심 관점, 부가 관점으로 나누어 설명하는 것

### PSA (Portable Service Abstraction) : 이식 가능한 서비스 추상화
- 스프링에서 제공하는 다양한 기술들을 추상화해 개발자가 쉽게 사용하는 인터페이스
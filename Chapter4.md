# Chapter4

### 테스트코드 패턴
- given-when-then : '실행준비-진행-결과 검증'의 단계로 구분해 작성하는 방식
- ex ) 
### JUnit 특징
- @Test 애너테이션으로 메소드 호출할 때마다 새 인스턴스를 생성, 독립 테스트 가능
- 예상 결과를 검증하는 어설션 메서드 제공
- 사용 방법이 단순, 테스트 코드 작성 시간 적음
- 자동 실행, 자체 결과를 확인하고 즉각적인 피드백을 제공


### AssertJ 가독성 높이는 법

| **메서드 이름**          | **설명**            |
|:----------------|:--------------|
| isEqualTo(A)    | A값과 같은지 검증|    
| isNotEqualTo(A) | A 값과 다른지 검증  | 
| contains(A)     | A 값을 포함하는지 검증 |
| doesNotContains(A)| A 값을 포함하지 않는지 검증 | 
| startsWith(A)| 접두사가 A인지 검증|
| endsWith(A)| 접미사가 A인지 검증|
| isEmpty()| 비어있는 값인지 검증|
| isNotEmpty()| 비어있지 않은 값인지 검증|
| isPositive()| 양수인지 검증|
| isNegatice()| 음수인지 검증|
| isGreaterThan(1)| 1보다 큰 값인지 검증|
| isLessThan(1)| 1보다 작은 값인지 검증|
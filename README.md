# SpringStudy

# 1) 배워서 바로 쓰는 스프링 프레임워크

## 스프링 IoC 컨테이너
- 객체가 다른 객체와 상호 작용하는 경우를 객체의 의존관계 라고 한다. 예를 들어 X 객체가 Y, Z 객체와 상호 작용한다면 X 객체는 Y, Z 객체와 의존관계이다.
- DI 는 객체 간의 의존 관계를 생성자 인수 나 세터 메서드 인수 로 명시하고 객체를 생성할 때 생성자나 세터를 콩해서 의존 관계를 주입하는 방식을 따르는 디자인 패턴이다.
- 스프링 IoC 컨테이너는 스프링 어플리케이션 에서 애플리케이션에 존재한느 객체를 생성하고 의존 관계를 주입하는 일을 담당한다.
- 스프링 컨테이너가 생성하고 관리하는 애플리케이션 객체들을 빈 (Bean) 이라고 부른다.
- 스프링 컨테이너는 애플리케이션 객체를 한꺼번에 책임지므로 애플리케이션을 조합하기 위해서 팩토리나 서비스 로케이터 등의 디자인 패턴을 직접 구현할 필요가 없다. 의존 관계를 만들고 주입하는 책임은 애플리케이션의 객체가 아닌 스프링 컨테이너에 있어 DI 를 제어의 역전 (IoC) 이라고도 부른다.
- 스프링 컨테이너가 애플리케이션 객체를 생성하고 관리하므로, 스프링 컨테이너를 통해 애플리케이션 객체에 추가 기능을 부여하고 애플리케이션 객체를 평범한 자바객체 (POJO 객체) 로 모델링할 수 있다.
- 선언적 트랜잭션 관리 : @Transactional 애너테이션을 설정하면 스프링이 트랜잭션을 관리한다.

### JMX
- 애플리케이션에 자바 관리 확장 지원 기능인 스프링의 JMX 를 쉽게 사용할 수 있다.
- 해당 기능을 사용하면 API 를 이용해 원격으로 해당 인스턴스와 상호작용 할 수 있다.

### JMS
- 자바 메시지 서비스를 사용하면 JMS 제공자에게 메시지를 받거나 보낼 수 있다.
- JmsTemplate 타입의 변수를 정의하고 @Autowired 애너테이션을 설정하여 메시지를 전달할 수 있다.

### 캐싱
- 스프링의 캐시 추상화를 사용하면 애플리케이션에서 일관성 있게 캐시를 사용할 수 있다.

## 스프링 5 변경사항
- 스프링 5 는 자바 9와 호환되며 스프링 JAR 를 모듈 경로나 클래스 경로에 추가할 수 있다.
- 비동기와 넌블로킹 애플리케이션 개발에 사용하는 반응형 프로그래밍 패러다임을 포함한다. 리액터 3.1과 RxJava 1.3 이나 2.1 라이브러리에 정의된 반응형 타입을 지원한다.
- 스프링 5의 소스 코드는 이제 자바 8 으로 되어있다.
- 스프링 5 에서는 포틀릿, 벨로서티 템플릿, 자스퍼레포트 지원이 중단됐다.
- Nullable, .. 애너테이션을 사용해 Null 안전성을 도입할 수 있다.
- AnnotationConfigApplicationContext 클래스에 새로 도입된 메서드를 통해 함수형으로 빈 등록과 커스텀화가 가능하다.
- 애플리케이션을 더 빠르게 시작하기 위해 파일에서 스프링 컴포넌트의 인덱스를 만들거나 읽을 수 있다.
- 서블릿 4.0 에 javax.servlet.http.PushBuilder 를 스프링 웹 MVC 애플리케이션에서 컨트롤러 메서드 인수로 사용할 수 있다.
- 새 웹 모듈인 spring-webflux 를 도입했다. 이를 사용하면 RxJava 나 리액터 라이브러리를 통해 반응형 웹 애플리케이션과 반응형 RESTful 웹 서비스를 개발할 수 있다.
- AsyncRestTemplate 지원은 사용을 금지하고 대신 반응형 WebClient 를 사용한다.

## 스프링 프레임워크 기초
- 자바 인터페이스는 구현 클래스가 준수해야 하는 계약을 정의한다. 따라서 클래스가 의존 관계를 구현하는 인터페이스에 의존한다면 해당 의존 관계의 구현을 변경하더라도 의존 중인 클래스를 변경할 필요가 없다. 이런 식으로 의존 중인 클래스가 의존 관계가 구현하는 인스턴스로 의존성을 만드는 설계 원칙을 '인터페이스를 사용하는 프로그래밍'이라고 한다. [의존 관계 인터페이스]
- 이러한 인터페이스를 사용하는 프로그래밍을 하면 특정 Dao 클래스에 IbatisDao, JdbcDao, HibernateDao 등 어떤 것이든 주입 가능하다.
- 

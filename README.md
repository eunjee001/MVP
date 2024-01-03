## MVP (1:1)

* MVC 패턴의 단점인 view와 model 사이의 의존성 문제를 보완하여 만들어진 디자인 패턴

  - View : UI 단으로 실질적인 User의 Event가 발생. (Activity, fragment)
  - Model : Data와 관련된 비즈니스 로직 담당. Data 컨트롤
  - Presenter : UI의 비즈니스 로직을 담당하고, 필요에 따라 Model 에 Data 요청하여 Data를 토대로 View단의 UI 갱신하도록 요청

Presenter은 그냥 다리 역할이라고 볼수 있다 !
둘 사이를 연결해주기 위해 interface 사용하고, interface는 어떤 기능이 있는지 한눈에 파악할 수 있도록 명시 해주는 역할 ~!

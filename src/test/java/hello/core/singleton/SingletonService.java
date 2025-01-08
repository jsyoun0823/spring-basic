package hello.core.singleton;

public class SingletonService {

    // class 레벨에 올라가기 때문에 딱 하나만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    // 해당 메소드를 통해서만 인스턴스를 얻을 수 있다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 생성자로 생성하는 것을 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
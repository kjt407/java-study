package day3;

public class Utility2 {

    // 기본 생성자 private 설정
    private Utility2() {
        throw new UnsupportedOperationException("인스턴스화 금지.");
    }

    // 정적 팩토리 메서드로 private 생성자에 접근이 가능함
    public static Utility2 newInstance() {
        return new Utility2();
    }

    public static void utilFunction1() {}
    public static void utilFunction2() {}
    public static void utilFunction3() {}
    public static void utilFunction4() {}
}

package day1;

// 함수형 인터페이스를 목적으로 작성되었지만 깨져버린 코드
// @FunctionalInterface
public interface CalculatorErr {
    int calculate(int a, int b);
    String toString(int a, int b);
}

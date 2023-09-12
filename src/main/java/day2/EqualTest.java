package day2;

import java.util.Objects;

public class EqualTest {
    public static void main(String[] args) {
        Long num1 = null;
        Long num2 = null;
        Long num3 = new Long(10L);
        Long num4 = new Long(10L);

        // CASE.1 : num1의 equals 메서드 상용
        if (num1.equals(num2)) System.out.println("num1 과 num2는 같습니다."); // error
        if (num3.equals(num4)) System.out.println("num3 과 num4는 같습니다."); // true

        // CASE.2 : == 연산 동일 비교
        if (num1 == num2) System.out.println("num1 과 num2는 같습니다."); // true
        if (num3 == num4) System.out.println("num3 과 num4는 같습니다."); // false

        // CASE.3 : Objects.equals 사용
        if (Objects.equals(num1, num2)) System.out.println("num1 과 num2는 같습니다."); // true
        if (Objects.equals(num3, num4)) System.out.println("num3 과 num4는 같습니다."); // true
    }
}

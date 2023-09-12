package day1;

public class Calculate {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        // 더하기 계산
        System.out.println("더하기 결과: " + calculate(num1, num2, (a, b) -> a + b));
        // 더하기 계산
        System.out.println("빼기 결과: " + calculate(num1, num2, (a, b) -> a - b));
        // 곱하기 계산
        System.out.println("곱하기 결과: " + calculate(num1, num2, (a, b) -> a * b));
        // 나누기 계산
        System.out.println("빼기 결과: " + calculate(num1, num2, (a, b) -> a / b));
    }

    /**
     * 계산 결과 출력
     *
     * @param a      정수 a
     * @param b      정수 b
     * @param lambda 계산식
     * @return 계산결과
     */
    private static int calculate(int a, int b, Calculator lambda) {
        return lambda.calculate(a, b);
    }

}

package annotation;

public class OverrideErr {
    
    // 정상적으로 재정의된 메서드
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // 잘못 재정의된 메서드 (아래의 @Override 주석 해제시 컴파일 에러 발생)
    // @Override
    public boolean equals(OverrideErr obj) {
        return super.equals(obj);
    }

}

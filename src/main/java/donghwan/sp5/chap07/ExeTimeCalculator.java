package donghwan.sp5.chap07;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExeTimeCalculator implements Calculator {

    private Calculator delegate;

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.printf("%s.factorial(%d) 실행 시간 = '%d'\n", delegate.getClass().getSimpleName(), num, (end - start));
        return result;
    }
}

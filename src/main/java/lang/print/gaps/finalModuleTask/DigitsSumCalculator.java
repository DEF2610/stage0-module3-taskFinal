package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number/1000;
        int b = ((number/100*100)-a*1000)/100;
        int c = number/10-(a*100+b*10);
        int d = number-(a*1000+b*100+c*10);
        System.out.println(a+b+c+d);
    }
}

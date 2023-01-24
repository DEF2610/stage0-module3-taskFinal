package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int third = number-number/10*10;
        int second = ((number-number/100*100)-third)/10;
        int first = number/100;
        System.out.println(third+""+second+""+first);
    }
}

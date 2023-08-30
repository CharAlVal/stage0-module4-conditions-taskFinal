package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int value;
        value = dividend/divider;
        value *= divider;

        if (dividend == 0 || divider == 0){
            System.out.println("by zero");
        }else if (value == dividend){
            System.out.println("can be divided completely");
        }else{
            System.out.println("cannot be divided completely");
        }
    }
}

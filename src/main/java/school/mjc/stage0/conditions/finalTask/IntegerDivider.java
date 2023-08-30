package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {


        if (dividend != 0 && divider != 0){
            int value;
            value = dividend/divider;
            value *= divider;
            System.out.println(value == dividend ? "can be divided completely":"cannot be divided completely");
        }else{
            System.out.println("division by zero");

        }
    }
}

package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
      second = first ^ second;
      first ^= second;
      second ^= first;
      System.out.println(first);
      System.out.println(second);

    }
}

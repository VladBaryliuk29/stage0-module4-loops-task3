package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        int sum = 0;
        if (t < 0) {
            t /= -1;
        }
        String number = t + "";
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);
    }
}

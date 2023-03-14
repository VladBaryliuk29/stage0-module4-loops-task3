package school.mjc.stage0.loops.task3;

public class NinesSum {
    public int stringCreation(int length) {
        String toCreate = "";
        for(int i = 0; i < length; i++) {
            toCreate += "9";
        }
        return Integer.parseInt(toCreate);
    }
    public void calculateSum(int lengthOfLastNumber) {
        int sumOfNines = 0;
        if(lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sumOfNines += stringCreation(i);
            }
            System.out.println(sumOfNines);
        }
    }
}

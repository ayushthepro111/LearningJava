public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myNum = 12;
        int myNum1 = 24;
        float myFloatNum = 12.6f;
        double myNum2 = 100;
        int myInt = (int) myNum2;
        long mySystemMemoryCount = 15000000000000000l;
        byte maxCubicalSolveCounts = 20;
        short maxSeconds = 100;
        boolean isMyServerDown = true;
        String name = "John";
        String lastName = "Doe";
        String fullName = name + lastName;
        char myLetter = 'X';

        System.out.println(myNum +  myNum1 + myFloatNum + myNum2 + mySystemMemoryCount + maxCubicalSolveCounts + maxSeconds
        );
        System.out.println("Hello, " + fullName + myInt + myLetter);
    }
}
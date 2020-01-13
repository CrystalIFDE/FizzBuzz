public class FizzBuzz {

    private static ContainsStrategy[] divisibleStrategies = new ContainsStrategy[]{
            new ContainsOfSeven(), new ContainsOfFive(), new ContainsOfThree()
    };


    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        for (ContainsStrategy containsStrategy : divisibleStrategies) {
            if (containsStrategy.accept(index)) {
                return containsStrategy.catchphrase();
            }
        }
        return FizzBuzzAlgorithm.getCatchphraseByDivisible(index);
    }

}

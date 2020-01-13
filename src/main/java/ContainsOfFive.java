public class ContainsOfFive implements ContainsStrategy {
    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("5");
    }

    @Override
    public String catchphrase() {
        return FizzBuzzAlgorithm.getCatchphraseByDivisible(5, FizzBuzzAlgorithm.quickFilter(3));
    }
}

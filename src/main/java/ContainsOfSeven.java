public class ContainsOfSeven implements ContainsStrategy {
    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("7");
    }

    @Override
    public String catchphrase() {
        return FizzBuzzAlgorithm.getCatchphraseByDivisible(7, FizzBuzzAlgorithm.quickFilter(5));
    }

}

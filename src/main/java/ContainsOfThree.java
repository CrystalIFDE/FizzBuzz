public class ContainsOfThree implements ContainsStrategy {
    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("3");
    }

    @Override
    public String catchphrase() {
        return FizzBuzzAlgorithm.getCatchphraseContentByIndex(3);
    }
}

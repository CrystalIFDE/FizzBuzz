public class FizzBuzz {

    private interface Filter<T> {
        boolean shouldFilter(T t);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        String stringIndex = String.valueOf(index);
        if (stringIndex.contains("7")) {
            return getCatchphraseByDivisible(index, filterNumber -> filterNumber == 5);
        }
        if (stringIndex.contains("5")) {
            return getCatchphraseByDivisible(index, filterNumber -> filterNumber == 3);
        }
        if (stringIndex.contains("3")) {
            return "Fizz";
        }
        return getCatchphraseByDivisible(index);
    }

    private static String getCatchphraseByDivisible(int number) {
        return getCatchphraseByDivisible(number, null);
    }

    private static String getCatchphraseByDivisible(int number, Filter<Integer> filter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (CatchPhrase catchPhraseValue : CatchPhrase.values()) {
            if (filter != null && filter.shouldFilter(catchPhraseValue.index)) {
                continue;
            }
            if (isMultipleOf(number, catchPhraseValue.index)) {
                stringBuilder.append(catchPhraseValue.code);
            }
        }
        return stringBuilder.length() == 0 ? String.valueOf(number) : stringBuilder.toString();
    }

    private static boolean isMultipleOf(int number, int target) {
        return number % target == 0;
    }

    private enum CatchPhrase {
        Fizz(3, "Fizz"),
        Buzz(5, "Buzz"),
        Whizz(7, "Whizz");

        private int index;
        private String code;

        CatchPhrase(int index, String phrase) {
            this.index = index;
            this.code = phrase;
        }

    }

}

package basics;

public class Replace {
    public static void main(String[] args) {
        String s = "gdhdj4hh789-*gg";
        String result = s.replaceAll("[^\\d]", "");
        System.out.println(result);

        String result1 = s.chars()
                .filter(Character::isAlphabetic)
                .peek(a-> System.out.println(a))
                .map(a->a=='g'?'r':a)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(result1);
    }
}

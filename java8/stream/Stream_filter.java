public class Stream_filter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {
            {
                add("test1");
                add("test2");
                add("test3");
                add("test4");
            }
        };
        strings.stream()
                .filter(s->s.charAt(0)=='t')
                .forEach(s->System.out.print(s+" "));

    }
}
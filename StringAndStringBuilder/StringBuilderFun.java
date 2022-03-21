package StringAndStringBuilder;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John Baugh");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Phillips ");
        System.out.println(sb);

        sb.replace(23,30,"amazing");
        System.out.println(sb);

        sb.delete(5,14);
        System.out.println(sb);

        sb.replace(0,4,"Dr.");
        System.out.println(sb);
    }



}

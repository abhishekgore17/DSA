package Strings;

public class StringBuilder {
    public StringBuilder(String space) {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }

    private void append(char ch) {
    }
}

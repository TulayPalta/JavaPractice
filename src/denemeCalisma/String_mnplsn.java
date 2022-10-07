package denemeCalisma;

public class String_mnplsn {
    public static void main(String[] args) {
        String harfDeposu="ABCÇDEFGĞHIJKLMNOÖPRSŞTUVYZ";

        char B=harfDeposu.charAt(harfDeposu.indexOf("B"));
        char U=harfDeposu.charAt(harfDeposu.indexOf("U"));
        char N=harfDeposu.charAt(harfDeposu.indexOf("N"));
        char Y=harfDeposu.charAt(harfDeposu.indexOf("Y"));
        char A=harfDeposu.charAt(harfDeposu.indexOf("A"));
        char M=harfDeposu.charAt(harfDeposu.indexOf("M"));
        char I=harfDeposu.charAt(harfDeposu.indexOf("I"));
        char n=harfDeposu.charAt(harfDeposu.lastIndexOf("N"));
        System.out.println(""+B+U+N+Y+A+M+I+N);

        for (int i = 1; i <harfDeposu.length(); i++) {


        }
    }
}

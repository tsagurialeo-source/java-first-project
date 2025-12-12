public class FindMaxOfFour {
    public static void main(String[] args) {
        int a = 15;
        int b = 42;
        int c = 7;
        int d = 89;
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Максимальное число : " + max);
    }
}
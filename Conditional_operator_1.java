public class Conditional_operator_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        int c = 30; 
        int result = (((a>b)?a:b)>c)?((a>b)?a:b):c;
        System.out.println(result);
    }
}

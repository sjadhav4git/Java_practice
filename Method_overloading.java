public class Method_overloading {
    public static void main(String[] args) {
        System.out.println(add(4,4));
        System.out.println(add(4.5f,4.5f));
        
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a, float b){
        return a+b;
    }

}

/*
 * method overlaoding
 */

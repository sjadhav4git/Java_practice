public class Switch_case {
    public static void main(String[] args) {
        switch(1)
        {
            case(2):{
                    System.out.println("From first case block");
                    break;
                }
            case(3):{
                    System.out.println("From second case block");
                    break;
                }
            case(1):{
                    System.out.println("From third case block");
                    break;
                }
            default:{
                System.out.println("From default block");
                }
        }
    }
}

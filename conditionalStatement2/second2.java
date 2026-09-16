package conditionalStatement2;

public class second2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z = 14;

        if(x > y && x >z){
            System.out.println("x");
        }
        else if (y>x && y>z){
            System.out.println("y");
        }
        else{
            System.out.println("z");
        }
    }
}

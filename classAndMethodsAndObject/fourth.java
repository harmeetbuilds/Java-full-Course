package classAndMethodsAndObject;

//In this class we have two methods with the same name but different parameters and this concept in java called method overloading
class calculator{
    public int add(int num1,int num2){
        int r1 = num1+num2;
        System.out.println("Your answer is ..");
        return r1;
    }
    public int add(int num1,int num2,int num3){
        int r1 = num1+num2+num3;
        System.out.println("Your answer is..");
        return r1;
    }
    public double add(double num1,int num2,int num3){
        double r1 = num1+num2+num3;
        System.out.println("Your answer is..");
        return r1;
    }
}
public class fourth{
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        calculator calc = new calculator();
        int result = calc.add(a,b,c);
        System.out.println(result);

    }
    
}

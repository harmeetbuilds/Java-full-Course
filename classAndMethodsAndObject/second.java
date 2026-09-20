package classAndMethodsAndObject;

class calculator                   //this is a class made for the 
{
    public int add(int n1,int n2){                             //this is called a method 
        int r = n1 + n2;
        System.out.println("Hi");
        return r;
    }
}


public class second {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;

        calculator calc = new calculator();             //this is how we create the object 
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}


package classAndMethodsAndObject;

class Computer{
    public void playmusic(){
        System.out.println("music is playing");
    }

    public String getmepen(int cost){
        if(cost>=10){
            return "Your pen is here";
        }
        else{
            return "You can't get the pen";
        }
        
    }
}
public class third {
    public static void main(String[] args) {
        Computer cum = new Computer();
        cum.playmusic();
        String str = cum.getmepen(2);
        System.out.println(str);
    
    }
}

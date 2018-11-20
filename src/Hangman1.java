public class Hangman1 {

public static void main(String[]args){
    String[]phrase = {"Hello", "World"};
    //repeatPrint("-", 2);

}



    public static void repeatPrint(String message, int maxValue){
    for(int potato=0;potato<maxValue;potato++){
        System.out.println(message);
        for(int innerLoop = 0; innerLoop<5; innerLoop++){
            System.out.println(message);
        }
    }
}
}

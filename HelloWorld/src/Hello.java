public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 99;
        if(topScore != 100){
            System.out.println("You got the high score!");
        }
        // To use logical and (&&) and logical or (||)
        int secondTopScore = 80;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}

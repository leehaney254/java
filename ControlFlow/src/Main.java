public class Main {

    public static void main (String[] args) {
//        int switchValue = 1;
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2: case 3: case 4:
//                System.out.println("Was a 3, a or a 2");
//                break;
//            default:
//                System.out.println("Number out of range");
//                break;
//        }
//        // Enhanced switch statement
//        switch (switchValue) {
//            case 1 -> System.out.println("Value was 1");
//            case 2, 3, 4 -> System.out.println("Was a 3, a or a 2");
//            default -> System.out.println("Number out of range");
//        }
       // looping();
       // inputOutput();
        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static void looping(){
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        int j=1;
        while(j <= 5){
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
            j++;
        } while(j <= 5);
    }

    public static void inputOutput(){
        String currentYear = "2022";
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        int currentYears = Integer.parseInt(currentYear);

        System.out.println("Age = " + (currentYears - dateOfBirth));
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("Hi, What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return  "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        return  "";
    }
}

public class Operators {
    public static void main(String[] args){
        double firstVal = 20.00d;
        double secondVal = 80.00d;
        double thirdVal = (firstVal + secondVal) * 100.00d;
        double remainder = thirdVal % 40.00d;
        boolean boolenanVal = (remainder == 0) ? true : false;

        if(boolenanVal){
            System.out.println(boolenanVal);
        }
    }
}

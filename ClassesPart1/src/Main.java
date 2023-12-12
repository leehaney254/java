public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setMake("BMW");
        System.out.println("make = " + car.getMake());
        car.setColor("Black");
        car.describeCar();
    }
}

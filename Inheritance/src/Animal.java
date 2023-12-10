public class Animal {
    protected String type;
    private String size;
    private int weight;

    public Animal() {

    }
    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Main{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noice");
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }
}

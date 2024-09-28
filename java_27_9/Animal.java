package java_27_9;

public class Animal {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    private String name;
    private String sound;
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    public void MakeSound(){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", "Meow");
        cat.MakeSound();

        Animal dog = new Animal("Dog", "Woof");
        dog.MakeSound();
    }
}

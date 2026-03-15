// Shows simple inheritance where Dog extends AnimalSoundDemo.
public class AnimalSoundDemo {
    void sound(){
        System.out.println("some sounds");
    }
    static class Dog extends AnimalSoundDemo {
        void barking(){
            System.out.println("barking");
        }

    }
}

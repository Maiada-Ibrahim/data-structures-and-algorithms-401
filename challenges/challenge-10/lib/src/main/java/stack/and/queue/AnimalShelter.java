package stack.and.queue;

import java.util.Locale;

public class AnimalShelter {
    private  Queue<String> dogs=new Queue<>();
    private  Queue<String> cats=new Queue<>();

//----------------------
    public boolean enqueue(Animal animal) {
        String className = animal.getClass().getSimpleName();
        if (className.equals("Cat")) {
            cats.enQueue(animal.getName());
        } else if (className.equals("Dog")) {
            dogs.enQueue(animal.getName());
        } else {
            return false;
        }
        return true;
    }
    //------------------------------------------------
    public String dequeue(String pref ) {
//    String className = animal.getClass().getSimpleName();
        if (pref .toLowerCase(Locale.ROOT).equals("cat")) {
            return cats.deQueue().toString();
        } else if (pref .toLowerCase(Locale.ROOT).equals("dog")) {
            return dogs.deQueue().toString();
        } else {
            return null;
        }
    }
//----------------------------------------------------------
    public Queue<String> getDogs() {
        return dogs;
    }

    public Queue<String> getCats() {
        return cats;
    }

    public void setDogs(Queue<String> dogs) {
        this.dogs = dogs;
    }

    public void setCats(Queue<String> cats) {
        this.cats = cats;
    }

    //--------------------------------------------------------
    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}
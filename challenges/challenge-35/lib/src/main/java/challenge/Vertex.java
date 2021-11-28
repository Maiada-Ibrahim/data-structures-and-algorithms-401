package challenge;

import java.util.Objects;

public class Vertex<T> {

    private T key;

    public Vertex(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "key=" + key +
                '}';
    }
}
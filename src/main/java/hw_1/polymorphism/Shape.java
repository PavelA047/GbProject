package hw_1.polymorphism;

public interface Shape {
    default String drawShape() {
        return getClass().getSimpleName() + " is drown";
    }
}

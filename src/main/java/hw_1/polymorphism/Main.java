package hw_1.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape cirShape = new Circle();
        Shape sqShape = new Square();
        Shape trShape = new Triangle();

        Polymorphism.drawSomething(cirShape);
        Polymorphism.drawSomething(sqShape);
        Polymorphism.drawSomething(trShape);
    }
}

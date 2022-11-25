package module8;

public class GraphicShapeTest {
    public static void main(String[] args) {
        PrintFigure printFigure = new PrintFigure();

        Shape circle = new Circle("Circle");
        printFigure.printFiguraName(circle);

        Shape quad = new Quad("Quad");
        printFigure.printFiguraName(quad);

        Shape square = new Square("Square");
        printFigure.printFiguraName(square);

        Shape triangle = new Triangle("Triangle");
        printFigure.printFiguraName(triangle);

        Shape parallelogram = new Parallelogram("Parallelogram");
        printFigure.printFiguraName(parallelogram);

    }
}

interface Printable {
}

interface Drawable {
}

abstract class Shape implements Drawable {
    public abstract String printName();
}

class PrintFigure {
    void printFiguraName(Shape shape) {
        System.out.println(shape.printName());
    }
}

class Circle extends Shape {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "I'm a " + name + " figure";
    }
}

class Quad extends Shape {
    private String name;

    public Quad(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "I'm a " + name + " figure";
    }
}

class Square extends Shape {
    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "I'm a " + name + " figure";
    }
}

class Triangle extends Shape {
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "I'm a " + name + " figure";
    }
}

class Parallelogram extends Shape {
    private String name;

    public Parallelogram(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "I'm a " + name + " figure";
    }
}

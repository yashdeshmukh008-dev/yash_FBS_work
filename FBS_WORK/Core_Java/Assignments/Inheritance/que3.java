class Shape {
    protected double area;

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public void displayCircle() {
        System.out.println("Radius: " + radius);
        displayArea();
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = 0.5 * base * height;
    }

    public void displayTriangle() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        displayArea();
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    public void displayRectangle() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        displayArea();
    }
}

class Shape {
    protected double area;

    public void calculateArea() {
        System.out.println("Calculating area of shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Rectangle {
    private int length;
    private int breadth;
    Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea() {
        return length * breadth;
    }
}
class Main3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();  // uses default values 4 & 5
        Rectangle r2 = new Rectangle(10, 20); // custom values
        System.out.println("Area (default constructor): " + r1.getArea());
        System.out.println("Area (custom constructor): " + r2.getArea());
    }
}

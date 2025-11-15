class Cylinder {
    private double radius;
    private double height;
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}
class Main1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Volume: " + c.getVolume());
        System.out.println("Surface Area: " + c.getSurfaceArea());
    }
}

class Cylinder2 {
    private double radius;
    private double height;
    public Cylinder2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}
class Main2 {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2(7, 14);

        System.out.println("Volume (Constructor): " + c.getVolume());
        System.out.println("Surface Area (Constructor): " + c.getSurfaceArea());
    }
}

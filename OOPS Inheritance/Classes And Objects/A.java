class A{
    double width;
    double height;
    double depth;

    // Parameterized Constructor
    A(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        A box = new A(5.0, 4.0, 3.0);

        System.out.println("Width  : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth  : " + box.depth);
        System.out.println("Volume : " + box.getVolume());
    }
}

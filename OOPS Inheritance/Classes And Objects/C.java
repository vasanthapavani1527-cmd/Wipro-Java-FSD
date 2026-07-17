class C {

    String patientName;
    double height;
    double weight;

    // Parameterized Constructor
    C(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    // Method to compute BMI
    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {

        C patient = new C("Siva", 1.65, 60);

        System.out.println("Patient Name : " + patient.patientName);
        System.out.println("Height       : " + patient.height + " m");
        System.out.println("Weight       : " + patient.weight + " kg");
        System.out.printf("BMI          : %.2f%n", patient.computeBMI());
    }
}

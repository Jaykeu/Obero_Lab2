import java.util.Scanner;

// Base class to represent a Cylinder
class Cylinder {
    double radius;
    double height;
    double area;

    // Method to get input for radius and height
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Please enter the height of the cylinder: ");
        height = scanner.nextDouble();
        scanner.close(); // Closing the scanner
    }

    // Method to calculate the surface area of the cylinder
    void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        System.out.println("Area of the cylinder: " + area);
    }
}

// Derived class to calculate the volume of the cylinder
class CylinderVol extends Cylinder {

    // Method to calculate the volume of the cylinder
    void volume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an instance of CylinderVol
        CylinderVol cylinderVol = new CylinderVol();

        // Get user input for radius and height
        cylinderVol.getInput();

        // Calculate and display the area of the cylinder
        cylinderVol.area();

        // Calculate and display the volume of the cylinder
        cylinderVol.volume();
    }
}

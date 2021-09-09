public class Main {
    public static void main(String[] args){
        // The Car Task
        ElectricalCar c1=new ElectricalCar("Sedan",5000,7000000,2021,"Tesla");
        System.out.println(c1.getFuelType());
        GasCar c2=new GasCar(92,3000000,2019,"Lanos");
        System.out.println(c2.getFuelType());
        GasCar c3=new GasCar("Race Car",95,1700000,2020,"Lightning mqueen");
        System.out.println(c3.getFuelType());
        System.out.println("The amount of cars is now "+Car.getNumberOfCars());
        // Car task completed above
        System.out.println(" ------- ");
        Shape c=new Circle(6);
        Shape s=new Square(6);
        displayShape(c);
        displayShape(s);
        // Shape task completed above
    }
    public static void displayShape(Shape shape){
        System.out.println("This shape is "+shape.getShapeName()+" and its area is equal to " +shape.getArea());
    }
}
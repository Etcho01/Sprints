public class Main {
    public static void main(String[] args){
        ElectricalCar c1=new ElectricalCar("Off road",7000,4000000,2021,"Tesla");
        GasCar c2=new GasCar("Sedan",92,8000000,2020,"Daewoo Lanos");
        GasCar c3=new GasCar("Cabriolet",95,1200000,2020,"BMW 320i");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
    }
}
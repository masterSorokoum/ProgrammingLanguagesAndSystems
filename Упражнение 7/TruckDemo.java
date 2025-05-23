/*
   Упражнение 7.1.
   Построение подкласса Vehicle для представления грузовиков.
   Sorokoumov
*/
class Vehicle {
    private int passengers; 
    private int fuelcap; 
    private int mpg; 

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; 

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Полуприцеп может перевезти " + semi.getCargo() +
                " фунтов.");
        System.out.println("Для поездки на расстояние " + dist +
                " миль полуприцепу требуется " + gallons +
                " галлонов топлива.\n");

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargo() +
                " фунтов.");
        System.out.println("Для поездки на расстояние " + dist +
                " миль пикапу требуется " + gallons +
                " галлонов топлива.");
    }
}

package cn.itcast;

public class example_9 {
    public static void main(String[] args) {
        RadarCar radarCar = new RadarCar();
        radarCar.show();

    }
}

class Car{
    void show(){
        System.out.println("hello");
    }
}

class RadarCar extends Car{


    void show() {
        super.show();
    }
}
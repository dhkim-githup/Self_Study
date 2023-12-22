package org.example._60_인터페이스1;

public class Sample05 {
    public static void main(String[] args) {
        System.out.println(iCompute.pyung);

        iCompute iCompute = new Apartment();
        System.out.println(iCompute.compute(34));
        System.out.println(iCompute.toPyung(112));

        System.out.println("-----------------------------------");

        iCompute iCompute2 = new Apartment();
        System.out.println(iCompute2.compute(34));
        System.out.println(iCompute2.toPyung(112));
    }
}

interface iCompute{
    float pyung = 3.3f; // static final float yung = 3.3f
    float compute(int area);
    default float toPyung(int area){
        return area/pyung;
    }
}

class Apartment implements iCompute{
    @Override
    public float compute(int area) {
        //pyung++;
        return area * pyung;
    }
}

class Apartment2 implements iCompute{
    @Override
    public float compute(int area) {
        //pyung++;
        return area * pyung;
    }
}

class Apartment3 implements iCompute{
    @Override
    public float compute(int area) {
        //pyung++;
        return area * pyung;
    }
}
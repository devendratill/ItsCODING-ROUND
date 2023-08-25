class aeroplane1 {
    void fly() {
        System.out.println("Plane is flying");
    }

    void takeof() {
        System.out.println("Plane is taking off");
    }
}

class cargo extends aeroplane1 {
    void fly() {
        System.out.println("cargoplane requires long runway");
    }

    void takeof() {
        System.out.println("cargoplane flying at high");
    }
}

class passenger extends aeroplane1 {
    void fly() {
        System.out.println("passenger plane requiers medium runway");
    }

    void takeof() {
        System.out.println("Passenger plane flying at medium hight ");
    }
}

class fighter extends aeroplane1 {
    void fly() {
        System.out.println("fighter plane requiers medium runway");
    }

    void takeof() {
        System.out.println("fighter plane flying at medium hight ");
    }
}

class airport {
    void poly(aeroplane1 ref) {
        ref.fly();
        ref.takeof();
        System.out.println();

    }
}

public class inheritance2 {
    public static void main(String[] args) {
        fighter fp = new fighter();
        passenger pp = new passenger();
        cargo cp = new cargo();

        airport a = new airport();
        a.poly(cp);
        a.poly(fp);
        a.poly(pp);



        // fp.fly();
        // fp.takeof();

        // pp.fly();
        // pp.takeof();

        // cp.fly();
        // cp.takeof();

    }
}

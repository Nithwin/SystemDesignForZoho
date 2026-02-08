
package phase1.topic1;

class SmartPhone {
    String brand;
    String model;
    int batteryLevel;

    void makeCall() {
        System.out.println("Calling...");
        batteryLevel -= 10;
    }

    void charge() {
        System.out.println("Charging...");
        batteryLevel += 100;
    }

}


class SmartPhoneSimulation {
    public static void main(String[] args) {
        SmartPhone sp1 = new SmartPhone();
        sp1.charge();
        sp1.makeCall();
        sp1.model = "GT 6T";
        sp1.brand = "Realme";
        
        SmartPhone sp2 = new SmartPhone();
        sp2.charge();
        sp2.makeCall();
        sp2.makeCall();
        sp2.makeCall();
        sp2.model = "17 Pro Max";
        sp2.brand = "Iphone";

        System.out.println(sp1.batteryLevel);
        System.out.println(sp2.batteryLevel);

    }
}
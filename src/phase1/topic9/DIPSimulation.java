package phase1.topic9;

interface SwitchableDevice  {
    void turnOn();
    void turnOff();
}

class LightBulb implements SwitchableDevice {
    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Light turned Off");
    }
    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Light turned On");
    }
}

class Fan implements SwitchableDevice {
    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Fan turned Off");
    }
    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Fan turned On");
    }
}

class SmartHomeHub {
    SwitchableDevice device;
    private boolean isOn;
    SmartHomeHub(SwitchableDevice device){
        this.device = device;
        isOn = false;
    }

    void pressButton(){
        if(isOn){
            this.device.turnOff();
        } else this.device.turnOn();
        isOn = !isOn;
    }

}

public class DIPSimulation {
    public static void main(String[] args) {
        SmartHomeHub sl = new SmartHomeHub(new LightBulb());
        sl.pressButton();
        sl.pressButton();
        SmartHomeHub sf = new SmartHomeHub(new Fan());
        sf.pressButton();
        sf.pressButton();
    }
}

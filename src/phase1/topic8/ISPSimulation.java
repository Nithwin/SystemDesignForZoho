package phase1.topic8;

interface SmartDevice {
    void print();
    void scan();
    void fax();
}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class BasicPrinter implements Printer{
    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
}


class ElitePhotocopier implements Printer, Scanner {
    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void scan() {
        // TODO Auto-generated method stub
        
    }
}

class SuperMachine implements Printer, Scanner, Fax {
    @Override
    public void fax() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void scan() {
        // TODO Auto-generated method stub
        
    }
}

// class CanonPrinter implements SmartDevice {
//     // Only prints and scans, can't fax!
// }

public class ISPSimulation {
    
}

package phase1.topic6;

class NotificationService {
    void send(NotificationTopic nt, String message) {
        nt.send(message);
    }
}

interface NotificationTopic {
    void send(String message);
}

class EmailNotification implements NotificationTopic {
    @Override
    public void send(String message) {
        
        System.out.println("Sending Email: " + message);
    }
}


class SMSNotification implements NotificationTopic {
    @Override
    public void send(String message) {
        
        System.out.println("Sending SMS: " + message);
    }
}

class WhatsappNotification implements NotificationTopic {
    @Override
    public void send(String message) {
        
        System.out.println("Sending Whatsapp: " + message);
    }
}



public class OCPSimulation {
    public static void main(String[] args) {
        NotificationService ns = new NotificationService();
        ns.send(new EmailNotification(), "Hi This is Email Message");
        ns.send(new SMSNotification(), "Hi This is SMS Message");
        ns.send(new WhatsappNotification(), "Hi This is Whatsapp Message");
    }
    
}

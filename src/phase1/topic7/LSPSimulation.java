package phase1.topic7;



interface chatWithFriend {
    void chatWithFriends();
}

interface Postable {
    void postStatus(String message);
}

class RegisteredUser implements chatWithFriend, Postable {

    @Override
    public void postStatus(String m) { 
        System.out.println("Posted: " + m); 
    }

    @Override
    public void chatWithFriends() { 
        System.out.println("Chatting..."); 
    }
}

class GuestUser implements chatWithFriend {

    @Override
    public void chatWithFriends() { System.out.println("Guest Chatting..."); }
}

public class LSPSimulation {
    
}

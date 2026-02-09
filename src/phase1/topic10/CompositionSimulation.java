package phase1.topic10;
import java.util.*;
interface AttackBehaviour {
    void attack();
}

interface MovementBehaviour {
    void move();
}

class SwordAttack implements AttackBehaviour{
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("Sword Attack");
    }
}

class MagicAttack implements AttackBehaviour {
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("Magic Attack");
    }
}

class WalkMovement implements MovementBehaviour{
    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Walk movement");
    }
}

class Flymovement implements MovementBehaviour {
    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Fly movement");
    }
}

class GameCharacter {
    AttackBehaviour attack;
    MovementBehaviour movebe;
    GameCharacter(AttackBehaviour attack,MovementBehaviour movebe){
        this.attack = attack;
        this.movebe = movebe;
    }
}

public class CompositionSimulation {
    public static void main(String[] args) {
        GameCharacter g1;
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        int Ultraplus;
        while(isRunning){

            System.out.println("\n 0.Normal Power.\n 1.Ultra Plus.\n 2.exit()\n");
            System.out.println("Enter your choice");
            Ultraplus = input.nextInt();
            switch(Ultraplus){
                case 0:
                    g1 = new GameCharacter(new SwordAttack(),new WalkMovement());
                    g1.attack.attack();
                    g1.movebe.move();
                    break;
                case 1:
                    g1 = new GameCharacter(new MagicAttack(),new Flymovement());
                    g1.attack.attack();
                    g1.movebe.move();
                    break;
                default:
                    isRunning = false;
                    break;
            }

        }

    }   
}

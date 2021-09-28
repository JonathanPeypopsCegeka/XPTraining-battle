package be.cegeka.battle;


import java.util.LinkedList;
public class Army {

    private LinkedList<Soldier> army;
    public Army() {
        army = new LinkedList<>();
    }

    public void enlist(Soldier soldier){
        army.add(soldier);
    }

    public Soldier getFrontMan(){
        return army.getFirst();
    }
}

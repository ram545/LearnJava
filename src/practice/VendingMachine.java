package practice;

public class VendingMachine {
    private State machineState;

    VendingMachine(){
        machineState = new Select(this);
    }

    State getState(){
        return machineState;
    }

    void setState(State state){
        machineState = state;
    }

}



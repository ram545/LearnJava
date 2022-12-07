package practice;

abstract class State {
    private static VendingMachine machine;

    State(VendingMachine machine){
        this.machine = machine;
    }
    abstract String choose();
    abstract String addMoney();
    abstract String Dispense();
    abstract String Cancel();
}


class Select extends State{
    Select(VendingMachine machine){
        super(machine);
    }

    String choose(){
        return  "Thanks for selecting";
    }
    String addMoney(){
        return  "Select an Item First";
    }

    String Dispense(){
        return "Select an Item First";
    }

    String Cancel(){
        return "Welcome";
    }
}

class AddMoney extends State{
    AddMoney(VendingMachine machine){
        super(machine);
    }

    String choose(){
        return  "Choice has been made already ! please cancel to redo the change";
    }
    String addMoney(){
        return  "Amount Added ! Moving to Dispensing";
    }

    String Dispense(){
        return "Enter the required money first";
    }

    String Cancel(){
        return "Welcome";
    }
}

class Dispense extends State{
    Dispense(VendingMachine machine){
        super(machine);
    }

    String choose(){
        return  "The requested item is being dispensed  ! please wait";
    }
    String addMoney(){
        return  "THe requested item is being dispensed ! please wait";
    }

    String Dispense(){
        return "Selected item is being dispensed";
    }

    String Cancel(){
        return "Cannot cancel order during dispensing";
    }
}

class Cancel extends State{
    Cancel(VendingMachine machine){
        super(machine);
    }

    String choose(){
        return  "Please wait cancel in progress";
    }
    String addMoney(){
        return  "Please wait cancel in progress";
    }

    String Dispense(){
        return "Please wait cancel in progress";
    }

    String Cancel(){
        return "Operation cancel started";
    }
}

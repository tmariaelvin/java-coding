package main.inheritance;

public class UIControler {
    public boolean isEnabled = true;

    public void disable(){
        isEnabled = false;
    }
    public void enable(){
        isEnabled = true;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}

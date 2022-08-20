package inheritance;

public class TextBox extends UIControler {

    TextBox(){
    }
    private String text = "";
    public void setText(String text1){
        this.text = text1;
    }

    @Override
    public String toString(){
        return text;
    }
}

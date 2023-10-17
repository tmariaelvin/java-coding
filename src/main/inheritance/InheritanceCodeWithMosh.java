package main.inheritance;

public class InheritanceCodeWithMosh {
    public static void main(String[] args){
      var uiControler = new TextBox();
      uiControler.disable();
        System.out.println(uiControler.isEnabled());
        uiControler.setText("hlo elvin");
        System.out.println(uiControler.toString());
        UIControler ui = new TextBox();
        TextBox textBox = (TextBox)ui;
        textBox.setText("working Fine");
        textBox.enable();
        System.out.println(textBox.isEnabled());
        System.out.println(textBox.toString());
       TextBox tb = (TextBox)ui;
       tb.setText("elvinnnnnnn");

    }
}

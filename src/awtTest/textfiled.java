package awtTest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class event extends Frame{
    TextField tf;
    event(){
        tf=new TextField();
        Button b=new Button("Clicked");
        tf.setBounds(60,50,170,20);
        b.setBounds(50,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("WelCome to my wold");
            }
        });
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
}
public class textfiled {
    public static void main(String[] args)
    {
        new event();
    }
}

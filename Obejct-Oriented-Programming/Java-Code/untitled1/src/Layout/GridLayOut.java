package Layout;


import javax.swing.*;
import java.awt.*;

class gui extends JFrame{
    gui()
    {
        setTitle("GRID LAYOUT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        GridLayout layout=new GridLayout(3,3);
        setLayout(layout);

        add(new JButton("0"));

        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));

        add(new JButton("6"));
        add(new JButton("7"));
        add(new JButton("8"));

       // add(new JButton("9"));
       // add(new JButton("null"));





        setVisible(true);
    }
}
class GridLayOut {
    public static void main(String[] args) {

        new gui();
    }
}

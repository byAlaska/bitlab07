package bitlab.askar.module2.lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {

    private MainFrame parent;

    private JButton back;

    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JComboBox comboBox;
    private Integer[] ages = new Integer[100];
    private JTextArea area;

    public SecondPage(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        back = new JButton("Back");
        back.setSize(300, 30);
        back.setLocation(100, 420);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });


        setSize(500,500);
        setLayout(null);

        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }

        label = new JLabel("HELLO laskdkflaskldf");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        textField = new JTextField("askjdgjsadljgklsdkg");
        textField.setSize(300,30);
        textField.setLocation(100,150);
        add(textField);

        button = new JButton("PRESS");
        button.setSize(300,30);
        button.setLocation(100,250);

        comboBox = new JComboBox(ages);
        comboBox.setSize(300,30);
        comboBox.setLocation(100,200);
        add(comboBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
                textField.setText("");
                Integer selectedInt = (Integer) comboBox.getSelectedItem();

                area.append(text +", " + selectedInt + "\n");
//                textField.setVisible(false);
//                button.setVisible(false);
//                label.setVisible(false);
            }
        });
        add(button);


    }

}

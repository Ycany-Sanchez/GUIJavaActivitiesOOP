import javax.swing.*;
import java.awt.*;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Food Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);

        JLabel label = new  JLabel("Foods                             Discount");
        label.setBounds(100, 50, 300, 40);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);

        JCheckBox cPizza = new JCheckBox("Pizza             Php 100");
        cPizza.setBounds(50, 100, 200, 20);

        JCheckBox cBurger = new JCheckBox("Burger           Php 80");
        cBurger.setBounds(50, 125, 200, 20);

        JCheckBox cFries = new JCheckBox("Fries             Php 65");
        cFries.setBounds(50, 150, 200, 20);

        JCheckBox cSoftDrinks = new JCheckBox("Soft Drinks   Php 55");
        cSoftDrinks.setBounds(50, 175, 200, 20);

        JCheckBox cTea = new JCheckBox("Tea               Php 50");
        cTea.setBounds(50, 200, 200, 20);

        JCheckBox cSundae = new JCheckBox("Sundae         Php 40");
        cSundae.setBounds(50, 225, 200, 20);


        JRadioButton rbNone = new JRadioButton("None");
        rbNone.setBounds(300, 100, 200, 20);

        JRadioButton rb5 = new JRadioButton("5% Off");
        rb5.setBounds(300, 125, 200, 20);

        JRadioButton rb10 = new JRadioButton("10% off");
        rb10.setBounds(300, 150, 200, 20);

        JRadioButton rb15 = new JRadioButton("15% off");
        rb15.setBounds(300, 175, 200, 20);

        JButton btnOrder = new JButton("Order");
        btnOrder.setBounds(200, 275, 100, 50);

        rbNone.setSelected(true);

        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(rbNone);
        discountGroup.add(rb5);
        discountGroup.add(rb10);
        discountGroup.add(rb15);


        btnOrder.addActionListener(e ->{
            double price = 0;
            if(cPizza.isSelected())
                price += 100;

            if(cBurger.isSelected())
                price += 80;

            if(cFries.isSelected())
                price += 65;

            if(cSoftDrinks.isSelected())
                price += 55;

            if(cTea.isSelected())
                price += 50;

            if(cSundae.isSelected())
                price += 40;

            double discount = 0;

            if(rb5.isSelected()){
                discount = 0.05;
            }else if(rb10.isSelected()){
                discount = 0.1;
            }else if(rb15.isSelected()){
                discount = 0.15;
            }

            discount = discount * price;
            price = price - discount;
            String temp = String.format("The total price is Php %.2f", price);

            JOptionPane.showMessageDialog(frame, temp);
        });










        frame.add(cPizza);
        frame.add(cBurger);
        frame.add(cFries);
        frame.add(cSoftDrinks);
        frame.add(cTea);
        frame.add(cSundae);
        frame.add(rbNone);
        frame.add(rb5);
        frame.add(rb10);
        frame.add(rb15);
        frame.add(btnOrder);
        frame.setVisible(true);

    }
}

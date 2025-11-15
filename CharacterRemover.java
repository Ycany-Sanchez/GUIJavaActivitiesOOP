import javax.swing.*;


public class CharacterRemover {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Character remover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);
        JLabel label = new JLabel("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        label.setBounds(90, 30, 300, 30);

        String res = label.getText();

        JCheckBox vowelCheckbox = new JCheckBox("Vowels");
        vowelCheckbox.setBounds(70, 100, 100, 30);
        vowelCheckbox.setName("vowelCheckbox");


        JCheckBox consonantCheckbox = new JCheckBox("Consonant");
        consonantCheckbox.setBounds(187, 100, 100, 30);
        consonantCheckbox.setName("consonantCheckbox");


        JCheckBox numberCheckbox = new JCheckBox("Numbers");
        numberCheckbox.setBounds(320, 100, 100, 30);
        numberCheckbox.setName("numberCheckbox");


        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(200, 150, 100, 30);
        removeButton.setName("removeButton");


        JButton restoreButton = new JButton("Restore");
        restoreButton.setBounds(200, 200, 100, 30);
        restoreButton.setName("restoreButton");


            removeButton.addActionListener(e ->  {
                String temp =label.getText();
            if(consonantCheckbox.isSelected()) {
                temp = temp.replaceAll("[BCDFGHJKLMNPQRSTVWXYZ]", "");
            }

            if(numberCheckbox.isSelected()) {
                temp = temp.replaceAll("[0123456789]", "");
            }

            if(vowelCheckbox.isSelected()) {
                temp = temp.replaceAll("[AEIOU]", "");
            }

            label.setText(temp);

        });


        restoreButton.addActionListener(e ->  {
            label.setText(res);
        });




        frame.add(label);
        frame.add(vowelCheckbox);
        frame.add(consonantCheckbox);
        frame.add(numberCheckbox);
        frame.add(removeButton);
        frame.add(restoreButton);



        frame.setVisible(true);

    }
}
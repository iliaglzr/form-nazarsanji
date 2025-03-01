package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.yellow);

        // Question 1

            JLabel question1 = new JLabel("How attractive do you find the software's user interface?");

            JRadioButton radio1_1 = new JRadioButton("1");

            JRadioButton radio1_2 = new JRadioButton("2");

            JRadioButton radio1_3 = new JRadioButton("3");

            JRadioButton radio1_4 = new JRadioButton("4");

            JRadioButton radio1_5 = new JRadioButton("5");
        question1.setPreferredSize(new Dimension(200,10));
        radio1_1.setPreferredSize(new Dimension(50,10));
        radio1_2.setPreferredSize(new Dimension(50,10));
        radio1_3.setPreferredSize(new Dimension(50,10));
        radio1_4.setPreferredSize(new Dimension(50,10));
        radio1_5.setPreferredSize(new Dimension(50,10));

        ButtonGroup group1 = new ButtonGroup();

        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);
        // Question 2

            JLabel question2 = new JLabel("Is it easy for you to access the various features of the software?");
            JRadioButton radio2_1 = new JRadioButton("1");
            JRadioButton radio2_2 = new JRadioButton("2");
            JRadioButton radio2_3 = new JRadioButton("3");
            JRadioButton radio2_4 = new JRadioButton("4");
            JRadioButton radio2_5 = new JRadioButton("5");


            question2.setPreferredSize(new Dimension(200,10));
        radio2_1.setPreferredSize(new Dimension(50,10));
        radio2_2.setPreferredSize(new Dimension(50,10));
        radio2_3.setPreferredSize(new Dimension(50,10));
        radio2_4.setPreferredSize(new Dimension(50,10));
        radio2_5.setPreferredSize(new Dimension(50,10));

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        // Question 3

            JLabel question3 = new JLabel("How simple and user-friendly is the software's page design?");
            JRadioButton radio3_1 = new JRadioButton("1");
            JRadioButton radio3_2 = new JRadioButton("2");
            JRadioButton radio3_3 = new JRadioButton("3");
            JRadioButton radio3_4 = new JRadioButton("4");
            JRadioButton radio3_5 = new JRadioButton("5");
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        question3.setPreferredSize(new Dimension(200,10));
        radio3_1.setPreferredSize(new Dimension(50,10));
        radio3_2.setPreferredSize(new Dimension(50,10));
        radio3_3.setPreferredSize(new Dimension(50,10));
        radio3_4.setPreferredSize(new Dimension(50,10));
        radio3_5.setPreferredSize(new Dimension(50,10));


        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        // Question 4




        JLabel question4 = new JLabel("Are the colors and fonts used in the software appropriate?");
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JRadioButton radio4_1 = new JRadioButton("1");

        JRadioButton radio4_2 = new JRadioButton("2");

        JRadioButton radio4_3 = new JRadioButton("3");

        JRadioButton radio4_4 = new JRadioButton("4");

        JRadioButton radio4_5 = new JRadioButton("5");

        question4.setPreferredSize(new Dimension(200,10));
        radio4_1.setPreferredSize(new Dimension(50,10));
        radio4_2.setPreferredSize(new Dimension(50,10));
        radio4_3.setPreferredSize(new Dimension(50,10));
        radio4_4.setPreferredSize(new Dimension(50,10));
        radio4_5.setPreferredSize(new Dimension(50,10));
        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        // Next button to go to Page3

        JButton nextButton = new JButton("Next Page");

        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        question1.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio1_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio1_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio1_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio1_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio1_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        question2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio2_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio2_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio2_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio2_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio2_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        question3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio3_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio3_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio3_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio3_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio3_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        question4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio4_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio4_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio4_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio4_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radio4_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);





        // Add components to the panel
        panel.add(question1);
        panel.add(radio1_1);
        panel.add(radio1_2);
        panel.add(radio1_3);
        panel.add(radio1_4);
        panel.add(radio1_5);
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        panel.add(question2);
        panel.add(radio2_1);
        panel.add(radio2_2);
        panel.add(radio2_3);
        panel.add(radio2_4);
        panel.add(radio2_5);
        panel.add(question3);
        panel.add(radio3_1);
        panel.add(radio3_2);
        panel.add(radio3_3);
        panel.add(radio3_4);
        panel.add(radio3_5);

        panel.add(question4);
        panel.add(radio4_1);
        panel.add(radio4_2);
        panel.add(radio4_3);
        panel.add(radio4_4);
        panel.add(radio4_5);

        nextButton.setPreferredSize(new Dimension(200,50));
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}

package packages;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.yellow);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        // Name Label and Text Field

            JLabel nameLabel = new JLabel("Name");
        Font myFont = new Font("Arial", Font.PLAIN, 16);
        nameLabel.setFont(myFont);
        nameLabel.setMaximumSize(new Dimension(500,50));

        JTextField nameField = new JTextField(15);
        nameField.setMaximumSize(new Dimension(500,50));

        // Age Label and Text Field

            JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(myFont);
        ageLabel.setMaximumSize(new Dimension(500,50));

        JTextField ageField = new JTextField(15);
        ageField.setMaximumSize(new Dimension(500,50));
        // Email Label and Text Field

            JLabel emailLabel = new JLabel("Gmail");
        emailLabel.setFont(myFont);
        emailLabel.setMaximumSize(new Dimension(500,50));

        JTextField emailField = new JTextField(15);
        emailField.setMaximumSize(new Dimension(500,50));

        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        // Software Familiarity Level

            JLabel levelLabel = new JLabel("Level of Familiarity with Similar Software ");
            levelLabel.setFont(myFont);
            JRadioButton level1 = new JRadioButton("Beginner");
            level1.setFont(myFont);
            JRadioButton level2 = new JRadioButton("Intermediate");
            level2.setFont(myFont);
            JRadioButton level3 = new JRadioButton("Advanced");
            level3.setFont(myFont);
            JRadioButton level4 = new JRadioButton("No Familiarity");
            level4.setFont(myFont);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button

        panel.add(Box.createRigidArea(new Dimension(0, 20)));
            JButton nextButton = new JButton("Next Page");
        nextButton.setFont(myFont);

        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);

        ageLabel.setHorizontalAlignment(JLabel.CENTER);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);

        emailLabel.setHorizontalAlignment(JLabel.CENTER);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);

        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);
        level4.setAlignmentX(Component.CENTER_ALIGNMENT);

        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);



        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(ageLabel);
        panel.add(ageField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}

package packages;
import java.awt.Font;
import javax.swing.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(null);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        Font myFont = new Font("Arial", Font.PLAIN, 16);
        nameLabel.setFont(myFont);
        nameLabel.setBounds(10, 10, 100, 20);
        JTextField nameField = new JTextField(15);
        nameField.setBounds(50, 10, 100, 20);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        ageLabel.setFont(myFont);
        ageLabel.setBounds(10, 50, 100, 20);
        JTextField ageField = new JTextField(15);
        ageField.setBounds(50, 50, 100, 20);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        emailLabel.setFont(myFont);
        emailLabel.setBounds(10, 90, 100, 20);
        JTextField emailField = new JTextField(15);
        emailField.setBounds(50, 90, 100, 20);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        levelLabel.setFont(myFont);
        levelLabel.setBounds(10, 130, 250, 20);

        JRadioButton level1 = new JRadioButton("مبتدی");
        level1.setFont(myFont);
        level1.setBounds(10, 160, 100, 20);
        JRadioButton level2 = new JRadioButton("متوسط");
        level2.setFont(myFont);
        level2.setBounds(100, 160, 100, 20);
        JRadioButton level3 = new JRadioButton("پیشرفته");
        level3.setFont(myFont);
        level3.setBounds(190, 160, 100, 20);
        JRadioButton level4 = new JRadioButton("بدون آشنایی");
        level4.setFont(myFont);
        level4.setBounds(280, 160, 150, 20);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setFont(myFont);
        nextButton.setBounds(10, 200, 100, 20);
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

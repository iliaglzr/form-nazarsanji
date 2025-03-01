package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.yellow);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel,BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}

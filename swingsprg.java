
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

class swingsprg {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                counter c = new counter();
            }
        });
    }
}

class counter extends JFrame implements ActionListener {
    JLabel l;
    JTextField t;
    JButton btn;

    public counter() {

        l = new JLabel("Counter");
        t = new JTextField(15);
        btn = new JButton("count");

        add(l);
        add(t);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t.getText());
        ++num;
        t.setText(num + "");
    }
}
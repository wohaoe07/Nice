package pac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Test {
    private JPanel myPanel=new JPanel();
    private JLabel label_img=new JLabel();
    private JLabel label_background=new JLabel();
    private JLabel label_score=new JLabel();
    int i=0;

    public Test() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),74,74);
                i++;
                label_score.setText("得分："+String.valueOf(i));
            }
        });
    }

    void go(){
        java.net.URL imgURL1 =Test.class.getResource("one.gif");
        label_img.setIcon(new ImageIcon(imgURL1));
        label_img.setBounds(0,0,74,74);

        java.net.URL imgURL2 =Test.class.getResource("back.png");
        label_background.setIcon(new ImageIcon(imgURL2));
        label_background.setBounds(0,0,800,700);

        label_score.setText("得分:0");
        label_score.setBounds(0,0,100,100);
        label_score.setForeground(Color.white);

        myPanel.add(label_img);
        myPanel.add(label_score);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("Test");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,200,800,700);
        frame.setVisible(true);



    }

    public static void main(String[] args) {
        new Test().go();
    }
}


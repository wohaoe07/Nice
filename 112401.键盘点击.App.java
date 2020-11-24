package pac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    JPanel myPanel=new JPanel();
    private JTextField textField1;
    JLabel label_txt=new JLabel();
    JTextArea textArea_a=new JTextArea();
    JTextArea textArea_b=new JTextArea();
    //构造方法
    public Test() {
        textArea_a.setText("点击上↑键输出文字");
        textArea_a.setBounds(100,100,256,128);
        textArea_a.setBackground(Color.pink);
        myPanel.add(textArea_a);
        textArea_b.setBounds(100,300,256,128);
        textArea_b.setBackground(Color.green);
        myPanel.add(textArea_b);

        textArea_a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea_b.append("点击进入上流社会！\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_b.setText("");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Test().go();
    }
}

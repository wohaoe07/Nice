import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_score = new JLabel();
    int score=0,score1=0,score2=0,score3=0;
    //构造方法
    public App() {
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()<210&&e.getY()<330){
                    score=score1;
                    score1=1;
                    label_score.setText("你的得分:"+String.valueOf(score));
                }
              else if (e.getX()<550&&e.getY()<420){
                    score=score1+score2;
                    score2=1;
                    label_score.setText("你的得分:"+String.valueOf(score));
                }
                else  {
                    score=score-score3;
                    score3=1;
                    label_score.setText("你的得分:"+String.valueOf(score));
                }
            }
        });


    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/timg.jpg");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1000,800);
        myPanel.add(label_score);
        myPanel.add(label_background);


        label_score.setText("你的得分：");
        label_score.setBounds(0,0,100,50);
        label_score.setFont(new Font("微软雅黑",0,20));


        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1050,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}

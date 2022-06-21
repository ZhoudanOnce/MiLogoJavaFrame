import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiLogoFrame extends JFrame {

    private int frameWidth;
    private int frameHeight;

    public MiLogoFrame() {
        frameWidth = 500;
        frameHeight = 500;
        init();
    }

    public MiLogoFrame(int side) {
        frameWidth = side;
        frameHeight = side;
        init();
    }

    public MiLogoFrame(int width, int height) {
        frameWidth = width;
        frameHeight = height;
        init();
    }

    /**
     * 窗口初始化
     */
    private void init() {

        setSize(frameWidth, frameHeight);
        setTitle();
        //窗口焦点事件
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
                System.out.println("程序退出");
                MiLogoFrame.this.dispose();
                System.exit(0);
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 绘制logo
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(222,222,22));
    }




    private void setTitle() {
        super.setTitle(AppSettings.AppName + " v" + AppSettings.AppVersion);
    }

    public static void main(String[] args) {
        var mi = new MiLogoFrame();
        mi.setVisible(true);
//        System.out.println(Math.PI);
//        System.out.println(Math.pow(-0.2,3))
        var a = "123";
        a.indexOf("ll");
    }
}

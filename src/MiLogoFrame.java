import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiLogoFrame extends JFrame {

    public static final String AppName = "小米Logo";
    public static final String AppVersion = "21.04.40";
    private int FrameWidth = 500;
    private int FrameHeight = 500;
    private int n = 3;

    public MiLogoFrame() {
        FrameInit();
    }

    public MiLogoFrame(int width, int height) {
        this.FrameWidth = width;
        this.FrameHeight = height;
        FrameInit();

    }

    public MiLogoFrame(int width, int height, int n) {
        this.FrameWidth = width;
        this.FrameHeight = height;
        this.n = n;
        FrameInit();

    }

    /**
     * 窗口初始化
     */
    private void FrameInit() {
        this.setSize(FrameWidth, FrameHeight);
        this.setTitle();
        //窗口焦点事件
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
                System.out.println("程序退出");
                MiLogoFrame.this.dispose();
                System.exit(0);
            }
        });

        //只要是没有显示出来这个方法就会返回空
        //System.out.println(this.getGraphics() == null);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 绘制logo
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        /*//等比例调整窗口大小
        if (this.getWidth() > this.getHeight()) {
            this.setSize(this.getWidth(), this.getWidth());
        } else if (this.getWidth() < this.getHeight()) {
            this.setSize(this.getHeight(), this.getHeight());
        }*/

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.RED);
        //g.fillOval(0, 0, this.getHeight(), this.getHeight());
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(30,30,30,500);

    }

    private void setTitle() {
        super.setTitle(AppName + " v" + AppVersion);
    }

    public static void main(String[] args) {
        var mi = new MiLogoFrame();
        mi.setVisible(true);
    }
}

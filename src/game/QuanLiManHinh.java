package game;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class QuanLiManHinh {
    public int mg = 2;
    public int withMH = 400+3*mg;
    public int heightMH =400+3*mg;
    VeManHinh vMH;
    QuanLiData qlDT;
    public QuanLiManHinh(VeManHinh vMH,QuanLiData qlDT,JFrame frame)
    {
        this.vMH = vMH;
        this.vMH = new VeManHinh();
        this.qlDT = qlDT;
        this.qlDT = new QuanLiData();
        this.vMH.veCacNut(frame,withMH,heightMH, mg);
    }
    
    public void setUp(JFrame frame)
    {   
        frame.setSize(withMH+16+2*mg, heightMH+38+2*mg);
        //Khi ấn nút pause chương trình sẽ dừng
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Game.hex2Rgb("#000000"));
        
        frame.addKeyListener( new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                  qlDT.resetGame();
                }
                if (qlDT.gameOver()){
                    JOptionPane.showMessageDialog(frame, "Game over\n Nhấn ESC để chơi lại");
                }
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        qlDT.moveLeft();
                        break;
                    case KeyEvent.VK_RIGHT:
                        qlDT.moveRight();
                        break;
                    case KeyEvent.VK_DOWN:
                        qlDT.moveDown();
                        break;
                    case KeyEvent.VK_UP:
                        qlDT.moveUp();
                        break;
                }
                //System.out.println(myScore);
                //kiem tra thua roi thong bao
                vMH.upDate();
                if (qlDT.gameOver() && !qlDT.win()){
                    JOptionPane.showMessageDialog(frame, "Game over\n Nhấn ESC để chơi lại");
                }
                //kiem tra win
                if (qlDT.win()){
                    JOptionPane.showMessageDialog(frame, "Win\n Nhấn ESC để chơi lại");
                }
                
            }
        });
        
    }
}

package game;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Game {
    
    JFrame game;
    QuanLiManHinh qlMH;
    VeManHinh vMH;
    QuanLiData qlDT;
    
    private void init()
    {
        game = new JFrame();
        qlMH = new QuanLiManHinh(vMH,qlDT,game);
    }
    
    
    
    public Game() {
        init();
        setUp();
        
    }
    
    
    public void setUp()
    {
        qlMH.setUp(game);
    }
    public void runGame()
    {
        game.setVisible(true);
    }
    public static Color hex2Rgb(String colorStr)
    {
        return new Color(
            Integer.valueOf(colorStr.substring(1,3),16),
            Integer.valueOf(colorStr.substring(3,5),16),
            Integer.valueOf(colorStr.substring(5,7),16)
               
        );     
    }
    public static void main(String[] args) {
        Game gm = new Game();
        gm.runGame();
    }
    
}

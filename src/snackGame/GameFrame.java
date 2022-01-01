package snackGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());                              //mendeklarasikan object class GamePanel
        this.setTitle("Snack Game - Created by : Kelompok 3");  //memberikan judul pada game panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //membuat tombol close untuk game panel
        this.setResizable(false);                               //mengatur ukuran panel tidak dapat di ubah dengan drag kursor
        this.pack();                                            //mengatur tata letak di dalam panel
        this.setVisible(true);                                  //mengatur visibilas panel
        this.setLocationRelativeTo(null);                       //mengatur lokasi jendela panel
    }
}

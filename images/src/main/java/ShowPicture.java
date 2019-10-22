import javax.swing.*;

public class ShowPicture {

    public static void main(String args[]){
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("image.PNG");
        JLabel label = new JLabel();

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

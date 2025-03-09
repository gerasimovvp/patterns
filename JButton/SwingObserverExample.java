import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go()
    {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.add(button); // Добавляем кнопку в окно

        frame.setVisible(true); // Делаем окно видимым
    }

    class AngelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Come on, do it!");
        }
    }
}

package util;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockPanel extends JPanel {
    private final JLabel timeLabel = new JLabel();
    private final Timer timer;

    public ClockPanel() {
        setLayout(new BorderLayout());
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(timeLabel, BorderLayout.CENTER);

        // 每秒自動更新
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                timeLabel.setText(time);
            }
        });
        timer.start();
    }
    
    // 可選: 關閉時釋放資源
    public void stopClock() {
        timer.stop();
    }
}

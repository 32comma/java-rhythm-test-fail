import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		setLayout(null);
		setUndecorated(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 400);
		setLocationRelativeTo(null);
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {

				Thread th = new Thread() {
					@Override
					public void run() {
						System.out.println(e.getKeyCode());
						System.out.println(e.getKeyLocation());
						r(e.getKeyCode(), e.getKeyLocation() == 2 ? true : false);

					}

				};
				th.start();
			}

		});

		setVisible(true);
	}

	public void r(int i, boolean b) {
		new MainPanel(MainFrame.this, i, b);
	}
}

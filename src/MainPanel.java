import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	static Map<Integer, Note> map = new HashMap<Integer, Note>();
	static {
		Note noteA = new Note(0, KeyEvent.VK_A, Color.white, 50, 50, true);
		Note noteS = new Note(50, KeyEvent.VK_S, Color.cyan, 50, 50, true);
		Note noteD = new Note(100, KeyEvent.VK_D, Color.white, 50, 50, true);
		Note noteL = new Note(150, KeyEvent.VK_L, Color.white, 50, 50, false);
		Note noteSemicolon = new Note(200, KeyEvent.VK_SEMICOLON, Color.cyan, 50, 50, false);
		Note noteQuote = new Note(250, KeyEvent.VK_QUOTE, Color.white, 50, 50, false);
		Note noteC = new Note(0, KeyEvent.VK_C, Color.RED, 150, 25, true);
		Note noteComma = new Note(150, KeyEvent.VK_COMMA, Color.RED, 150, 25, false);
		Note noteShift = new Note(0, KeyEvent.VK_SHIFT, Color.BLUE, 150, 25, true);
		map.put(KeyEvent.VK_A, noteA);
		map.put(KeyEvent.VK_S, noteS);
		map.put(KeyEvent.VK_D, noteD);
		map.put(KeyEvent.VK_L, noteL);
		map.put(KeyEvent.VK_SEMICOLON, noteSemicolon);
		map.put(KeyEvent.VK_QUOTE, noteQuote);
		map.put(KeyEvent.VK_C, noteC);
		map.put(KeyEvent.VK_SHIFT, noteShift);
		map.put(KeyEvent.VK_COMMA, noteComma);

	}

	public MainPanel() {

	}

	public MainPanel(MainFrame mainFrame, int keyEvent, boolean isLeft) {
		Note note = map.get(keyEvent);
		this.setBackground(note.color);

		for (int i = 0; i < 400; i++) {
			mainFrame.add(this);
			if (note.keyEvent == KeyEvent.VK_SHIFT) {
				if (!isLeft) {
					this.setBounds(150, i, note.width, note.height);
				} else {
					this.setBounds(0, i, note.width, note.height);
				}
			} else {

				this.setBounds(note.x, i, note.width, note.height);
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			this.validate();
		}
	}

}
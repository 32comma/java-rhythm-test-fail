import java.awt.Color;

class Note {
	public Note(int x, int keyEvent, Color color, int width, int height, boolean isLeft) {
		this.x = x;
		this.keyEvent = keyEvent;
		this.color = color;
		this.width = width;
		this.height = height;
		this.isLeft = true;
	}

	int x;
	int keyEvent;
	Color color = Color.white;
	int width = 50;
	boolean isLeft = false;
	int height = 50;
}
package gdecid.visual.tuple;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class TableNodeItem extends TableVisualItem{
	
	String text;
	double x;
	double y;
	double size = 1.0; //����ͼƬ�����Ŵ�С��
	Font font = new Font("����", Font.PLAIN, 15);;
	Rectangle2D Bounds;
	
	public TableNodeItem(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Rectangle2D getBounds() {
		return Bounds;
	}

	public void setBounds(Rectangle2D bounds) {
		Bounds = bounds;
	}

}

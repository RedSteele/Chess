import java.awt.Color;
import java.awt.Image;

import javax.swing.JFrame;

public abstract class piece {

	private Color color;
	private int[][] position;
	private Image picture;

	public piece(Color color, int[][] position, Image picture) {
    	this.color = color;
    	this.position = position;
    	this.picture = picture;
  }

	/********************************************
   * 
   * Getters and Setters
   * 
   *******************************************/

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int[][] getPosition() {
    return position;
  }

  public void setPosition(int x, int y) {
    this.position = new int[x][y];
  }

  public Image getPicture() {
    return picture;
  }

  public void setPicture(Image picture) {
    this.picture = picture;
  }
	
}
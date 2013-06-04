/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean crayonActif = true;
	
	public Traceur() {
		setTeta();
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		
		if(crayonActif){
			g2d.drawLine(x1,y1,x2,y2);
		}
		
		posx = a;
		posy = b;
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	public void tg(int attValue) {
		// TODO Auto-generated method stub
		angle = (angle + toInt(attValue)) % 360;
		setTeta();
	}

	public void lc() {
		crayonActif = false;
	}
	
	public void bc() {
		crayonActif = true;
	}

	public void ve() {
		g2d.clearRect(0, 0, 15000, 15000);
	}

	public void re(double r) {
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		
		if(crayonActif){
			g2d.drawLine(x1,y1,x2,y2);
		}
		
		posx = a;
		posy = b;		
	}

	public void fpos(int attValue, int attValue2) {
		posx = attValue;
		posy = attValue2;
	}

	public void fcc(int attValue) {
		// TODO Auto-generated method stub
		int mod= attValue % 8;
		switch(mod){
			case 0: //Noir
				g2d.setColor(Color.black);
				break;
			case 1: //Rouge
				g2d.setColor(Color.red);
				break;
			case 2: //Vert
				g2d.setColor(Color.green);
				break;
			case 3: //Jaune
				g2d.setColor(Color.yellow);
				break;
			case 4: //Bleu
				g2d.setColor(Color.blue);
				break;
			case 5: //Violet
				g2d.setColor(Color.magenta);
				break;
			case 6: //Bleu clair
				g2d.setColor(Color.cyan);
				break;
			case 7: //Blanc
				g2d.setColor(Color.white);
				break;
		}
	}
}

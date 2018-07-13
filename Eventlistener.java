package rrassi4;

import java.awt.Font;

import org.resource.ImageResource;
import org.world.World;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.util.awt.TextRenderer;

public class Eventlistener  implements GLEventListener{

	public static float x =30;
	public static GL2 gl =null;


public void display(GLAutoDrawable drawable) {
		 gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
	
	//Graphics.fillRect( x,50,30,50);
	reflection.drawTriangle();
	reflection.rotate();
		//World.render();
	}

	public void dispose(GLAutoDrawable drawable) {
		
		
	}

	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glClearColor(1,1,1,1);
		gl.glEnable(GL2.GL_TEXTURE_2D);
		
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(-320, 320, -180, 180, -1, 1);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		
		
	}
	
	

}

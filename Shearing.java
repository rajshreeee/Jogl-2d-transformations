package rrassi2;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
public class Shearing implements GLEventListener{

		int [] pts1 = {160,180};
		int [] pts2 = {185,130};
		int [] pts3 = {135,130};
		
		int [][] matrix = {{1,2,0},{0,1,0},{0,0,1}};
		private GLU glu;
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			GLProfile glp = GLProfile.get(GLProfile.GL2);
			GLCapabilities cap = new GLCapabilities(glp);
			GLCanvas canvas = new GLCanvas(cap);
			
			Frame frame = new Frame("Assignment1");
			frame.setSize(1200, 800);
			frame.add(canvas);
			frame.setVisible(true);
			
			Shearing l = new Shearing();
		    canvas.addGLEventListener( l);  
		
			frame.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}});

		}

		public void display(GLAutoDrawable drawable) {
			// TODO Auto-generated method stub
			
			
			  final GL2 gl = drawable.getGL().getGL2();
				 
			  gl.glClear (GL2.GL_COLOR_BUFFER_BIT);
			  gl.glColor3f( 1.0f, 0.0f, 0.0f );
		      gl.glBegin( GL2.GL_TRIANGLES );  
		      gl.glVertex2i( 160,180 );    
		      gl.glVertex2i( 185,130 );  
			  gl.glVertex2i( 135,130 );   
			  gl.glEnd(); 
			 
			  scale(gl, pts1,pts2,pts3,matrix);
			  
		}
		
		void scale(GL2 gl,int [] pts1, int [] pts2, int []pts3, int [][]matrix){
			
			int x1 = matrix[0][0]*pts1[0]+matrix[0][1]*pts1[1];
			int y1 = matrix[1][0]*pts1[0]+matrix[1][1]*pts1[1];
			
			int x2 = matrix[0][0]*pts2[0]+matrix[0][1]*pts2[1];
			int y2 = matrix[1][0]*pts2[0]+matrix[1][1]*pts2[1];
			
			int x3 = matrix[0][0]*pts3[0]+matrix[0][1]*pts3[1];
			int y3 = matrix[1][0]*pts3[0]+matrix[1][1]*pts3[1];
		
			
			plot(gl,x1,y1,x2,y2,x3,y3);
			 		
		}

		private void plot(GL2 gl, int x1, int y1, int x2, int y2, int x3, int y3) {
			// TODO Auto-generated method stub
			
			   gl.glBegin( GL2.GL_TRIANGLES );  
			      gl.glVertex2i( x1,y1 );    
			      gl.glVertex2i( x2,y2);  
				  gl.glVertex2i( x3,y3);   
				  gl.glEnd();
		}

		public void dispose(GLAutoDrawable arg0) {
			// TODO Auto-generated method stub
			
		}

		public void init(GLAutoDrawable gld) {
			// TODO Auto-generated method stub
			
			 GL2 gl = gld.getGL().getGL2();
			 glu = new GLU();

			gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
			gl.glColor3f(0.0f, 0.0f, 0.0f);
			gl.glPointSize(4.0f);
			gl.glMatrixMode(GL2.GL_PROJECTION);
			gl.glLoadIdentity();
		glu.gluOrtho2D(0.0, 640.0, 0.0, 480.0);
		}

		public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,
				int arg4) {
			// TODO Auto-generated method stub
			
		}

	}



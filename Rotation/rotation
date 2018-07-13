package rrassi3;

import com.jogamp.opengl.GL2;

public class rotation {
	public static int [] pts1 = {60,80};
	public static int [] pts2 = {85,30};
	public static int [] pts3 = {35,30};
	
	public static double [][] matrix = {{Math.cos(45), Math.sin(-45), 0},{Math.sin(45), Math.cos(45),0},{0,0,1}};

	public static void drawTriangle(){
		
		GL2 gl = eventlistener.gl;
		
		 
		  gl.glClear (GL2.GL_COLOR_BUFFER_BIT);
		  gl.glColor3f( 1.0f, 0.0f, 0.0f );
	      gl.glBegin( GL2.GL_TRIANGLES );  
	      gl.glVertex2i( 60,80 );    
	      gl.glVertex2i( 85,30 );  
		  gl.glVertex2i( 35,30 );   
		  gl.glEnd();
		
	}
	
	public static void rotate(){
		
		int x1 = (int) (matrix[0][0]*pts1[0]+matrix[0][1]*pts1[1]);
		int y1 = (int) (matrix[1][0]*pts1[0]+matrix[1][1]*pts1[1]);
		
		int x2 = (int) (matrix[0][0]*pts2[0]+matrix[0][1]*pts2[1]);
		int y2 = (int) (matrix[1][0]*pts2[0]+matrix[1][1]*pts2[1]);
		
		int x3 = (int) (matrix[0][0]*pts3[0]+matrix[0][1]*pts3[1]);
		int y3 = (int) (matrix[1][0]*pts3[0]+matrix[1][1]*pts3[1]);
	
		
		plot(x1,y1,x2,y2,x3,y3);
		 		
	}

	public static void plot(int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated method stub
		GL2 gl = eventlistener.gl;
		 gl.glBegin( GL2.GL_TRIANGLES );  
	      gl.glVertex2i( x1,y1 );    
	      gl.glVertex2i( x2,y2);  
		  gl.glVertex2i( x3,y3);   
		  gl.glEnd();
	}

	

}

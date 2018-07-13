package rrassi3;

import org.graphics.EventListener;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
public class Central{

private static GLWindow window = null;

private static GLProfile profile =null;
public static void init(){
	GLProfile.initSingleton();
profile = GLProfile.get(GLProfile.GL2);
	GLCapabilities caps = new GLCapabilities(profile);
	
	window = GLWindow.create(caps);
	window.setSize(640,360);
	window.setResizable(true);
	window.addGLEventListener(new eventlistener());

	FPSAnimator animator = new FPSAnimator(window, 40);
	animator.start();
	
	window.setVisible(true);
	
}
public static void render(){
	
	if (window == null){
		
		return;
	}
	window.display();
}

public static GLProfile getProfile(){
	return profile;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	init();


}
}
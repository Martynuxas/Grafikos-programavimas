
package lab1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import javax.swing.JFrame;


public class Lab1 implements GLEventListener {
 private float angle = 0.0f; //for angle of rotation
 @Override
 public void display(GLAutoDrawable drawable) {
 final GL2 gl = drawable.getGL().getGL2();
      gl.glClear (GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT );
      gl.glLoadIdentity(); // Reset The View
      gl.glRotatef( angle, 0.3f, 0.3f, 0.0f ); 
      gl.glBegin(GL2.GL_QUADS); // Start Drawing The Cube

      
      //----------------M RAIDĖ GALAS-----------------
      //Kairiausias stačiakampis
      gl.glColor3f( 1f,0f,0f ); //green color
      gl.glVertex3f( -0.40f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( -0.47f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( -0.47f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( -0.40f, 0.3f, -0.05f ); // Virsus desine
      //Kairiausias vidurys stačiakampis
      gl.glColor3f( 0f,1f,0f ); //green color
      gl.glVertex3f( -0.115f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( -0.185f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( -0.47f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( -0.40f, 0.3f, -0.05f ); // Virsus desine
      //Dešiniausias vidurys stačiakampis
      gl.glColor3f( 1f,1f,0f ); //green color
      gl.glVertex3f( -0.115f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( -0.185f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( 0.10f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( 0.17f, 0.3f, -0.05f ); // Virsus desine
      //Dešiniausias stačiakampis
      gl.glColor3f( 1f,0.5f,0f ); //green color
      gl.glVertex3f( 0.17f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( 0.10f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( 0.10f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( 0.17f, 0.3f, -0.05f ); // Virsus desine
      //----------------M RAIDĖ GALAS-----------------
      //----------------K RAIDĖ GALAS-----------------
      //Kairiausias stačiakampis
      gl.glColor3f( 1f,0f,1f ); //green color
      gl.glVertex3f( 0.37f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( 0.30f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( 0.30f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( 0.37f, 0.3f, -0.05f ); // Virsus desine
      //Virsutinis stačiakampis
      gl.glColor3f( 0f,1f,1f ); //green color
      gl.glVertex3f( 0.37f, 0f, -0.05f ); // Apacia desine
      gl.glVertex3f( 0.30f, 0f, -0.05f ); // Apacia kaire
      gl.glVertex3f( 0.50f, 0.3f, -0.05f ); // Virsus kairė
      gl.glVertex3f( 0.57f, 0.3f, -0.05f ); // Virsus desine
      //Apatinis stačiakampis
      gl.glColor3f( 1f,0f,0f ); //green color
      gl.glVertex3f( 0.57f, -0.3f, -0.05f ); // Apacia desine
      gl.glVertex3f( 0.50f, -0.3f, -0.05f ); // Apacia kaire
      gl.glVertex3f( 0.30f, 0f, -0.05f ); // Virsus kairė
      gl.glVertex3f( 0.37f, 0f, -0.05f ); // Virsus desine
      //----------------K RAIDĖ GALAS-----------------
      //----------------M RAIDĖS TRYS APAČIOS IR DVI VIRŠUNĖS--
      //----------------VIRŠUS---------------------------------
      //kairė viršus
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.40f, 0.3f, 0.05f ); // Desine priekis
      gl.glVertex3f( -0.47f, 0.3f, 0.05f ); // Kaire priekis
      gl.glVertex3f( -0.47f, 0.3f, -0.05f ); // Kaire galas
      gl.glVertex3f( -0.40f, 0.3f, -0.05f ); // Desine galas
      //dešinė viršus
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.17f, 0.3f, 0.05f ); // Desine priekis
      gl.glVertex3f( 0.10f, 0.3f, 0.05f ); // Kaire priekis
      gl.glVertex3f( 0.10f, 0.3f, -0.05f ); // Kaire galas
      gl.glVertex3f( 0.17f, 0.3f, -0.05f ); // Desine galas
      //----------------VIRŠUS---------------------------------
      //----------------APAČIA---------------------------------
      //kairė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.40f, -0.3f, 0.05f ); // Desine priekis
      gl.glVertex3f( -0.47f, -0.3f, 0.05f ); // Kaire priekis
      gl.glVertex3f( -0.47f, -0.3f, -0.05f ); // Kaire galas
      gl.glVertex3f( -0.40f, -0.3f, -0.05f ); // Desine galas
      //vidurys
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.115f, -0.3f, 0.05f ); // Desine priekis
      gl.glVertex3f( -0.185f, -0.3f, 0.05f ); // Kaire priekis
      gl.glVertex3f( -0.185f, -0.3f, -0.05f ); // Kaire galas
      gl.glVertex3f( -0.115f, -0.3f, -0.05f ); // Desine galas
      //dešinė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.17f, -0.3f, 0.05f ); // Desine priekis
      gl.glVertex3f( 0.10f, -0.3f, 0.05f ); // Kaire priekis
      gl.glVertex3f( 0.10f, -0.3f, -0.05f ); // Kaire galas
      gl.glVertex3f( 0.17f, -0.3f, -0.05f ); // Desine galas
      //----------------APAČIA---------------------------------
      //----------------M RAIDĖS TRYS APAČIOS IR DVI VIRŠUNĖS--
      
      //----------------K RAIDĖS ŠONAI----------------
      //----------------STAČIAKAMPIO ŠONAI------------
      //kairė puse
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.30f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( 0.30f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( 0.30f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.30f, 0.3f, -0.05f ); // Virsus galas
      //dešinė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.37f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( 0.37f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( 0.37f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.37f, 0.3f, -0.05f ); // Virsus galas
      //----------------STAČIAKAMPIO ŠONAI------------
      //----------------STAČIAKAMPIO SKERSAI VIRŠUJ ŠONAI-----
      //virsus
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.30f, 0f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.50f, 0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.50f, 0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.30f, 0f, -0.05f ); // kairys galas
      //apacia
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.37f, 0f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.57f, 0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.57f, 0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.37f, 0f, -0.05f ); // kairys galas
      //----------------STAČIAKAMPIO SKERSAI VIRŠUJ ŠONAI-----
      //----------------STAČIAKAMPIO SKERSAI APAČIOJ ŠONAI-----
      //virsus
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.37f, 0f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.57f, -0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.57f, -0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.37f, 0f, -0.05f ); // kairys galas
      //apacia
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.30f, 0f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.50f, -0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.50f, -0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.30f, 0f, -0.05f ); // kairys galas
      //----------------STAČIAKAMPIO SKERSAI APAČIOJ ŠONAI-----
      //----------------K RAIDĖS DVI VIRŠUNĖS---------
      //kairė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.30f, 0.3f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.37f, 0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.37f, 0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.30f, 0.3f, -0.05f ); // kairys galas
      //dešinė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.50f, 0.3f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.57f, 0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.57f, 0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.50f, 0.3f, -0.05f ); // kairys galas
      //----------------K RAIDĖS DVI VIRŠUNĖS---------
      //----------------K RAIDĖS DVI APAČIOS---------
      //kairė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.30f, -0.3f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.37f, -0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.37f, -0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.30f, -0.3f, -0.05f ); // kairys galas
      //dešinė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.50f, -0.3f, 0.05f ); // kairys priekis
      gl.glVertex3f( 0.57f, -0.3f, 0.05f ); // desinys priekis
      gl.glVertex3f( 0.57f, -0.3f, -0.05f ); // desinys galas
      gl.glVertex3f( 0.50f, -0.3f, -0.05f ); // kairys galas
      //----------------K RAIDĖS DVI VIRŠUNĖS---------
      //----------------K RAIDĖS ŠONAI----------------
      
      //----------------M RAIDĖS KAIRIO STAČ ŠONAI----
      //kairė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.47f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.47f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.47f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( -0.47f, 0.3f, -0.05f ); // Virsus galas
      //dešinė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.40f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.40f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.40f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( -0.40f, 0.3f, -0.05f ); // Virsus galas
       //----------------M RAIDĖS KAIRIO STAČ SKERSAI ŠONAI----
      //kairė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.47f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.185f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.185f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( -0.47f, 0.3f, -0.05f ); // Virsus galas
      //dešinė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( -0.40f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.115f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.115f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( -0.40f, 0.3f, -0.05f ); // Virsus galas
      //----------------M RAIDĖS ŠONAI------------------
      //----------------M RAIDĖS DEŠINIO STAČ ŠONAI-----
      //dešinė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.17f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( 0.17f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( 0.17f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.17f, 0.3f, -0.05f ); // Virsus galas
      //kairė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.10f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( 0.10f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( 0.10f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.10f, 0.3f, -0.05f ); // Virsus galas
      //----------------M RAIDĖS DEŠINIO STAČ SKERSAI ŠONAI-----
      //dešinė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.17f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.115f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.115f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.17f, 0.3f, -0.05f ); // Virsus galas
      //kairė pusė
      gl.glColor3f( 1f,0f,0f ); //red color
      gl.glVertex3f( 0.10f, 0.3f, 0.05f ); // Virsus priekis
      gl.glVertex3f( -0.185f, -0.3f, 0.05f ); // Apacia priekis
      gl.glVertex3f( -0.185f, -0.3f, -0.05f ); // Apacia galas
      gl.glVertex3f( 0.10f, 0.3f, -0.05f ); // Virsus galas
      //----------------M RAIDĖS ŠONAI------------------
      //----------------M RAIDĖ PRIEKIS-----------------
      //Kairiausias stačiakampis
      gl.glColor3f( 0f,1f,1f ); //purple color
      gl.glVertex3f( -0.40f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( -0.47f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( -0.47f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( -0.40f, 0.3f, 0.05f ); // Virsus desine
      //Kairiausias vidurys stačiakampis
      gl.glColor3f( 1f,0f,0f ); //purple color
      gl.glVertex3f( -0.115f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( -0.185f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( -0.47f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( -0.40f, 0.3f, 0.05f ); // Virsus desine 
      //Dešiniausias vidurys stačiakampis
      gl.glColor3f( 0f,1f,0f ); //purple color
      gl.glVertex3f( -0.115f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( -0.185f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( 0.10f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( 0.17f, 0.3f, 0.05f ); // Virsus desine
      //Dešiniausias stačiakampis
      gl.glColor3f( 1f,1f,0f ); //purple color
      gl.glVertex3f( 0.17f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( 0.10f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( 0.10f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( 0.17f, 0.3f, 0.05f ); // Virsus desine
      //----------------M RAIDĖ PRIEKIS-----------------
      //----------------K RAIDĖ PRIEKIS-----------------
      //Kairiausias stačiakampis
      gl.glColor3f( 1f,0.5f,0f ); //purple color
      gl.glVertex3f( 0.37f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( 0.30f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( 0.30f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( 0.37f, 0.3f, 0.05f ); // Virsus desine
      //Virsutinis stačiakampis
      gl.glColor3f( 1f,0f,1f ); //purple color
      gl.glVertex3f( 0.37f, 0f, 0.05f ); // Apacia desine
      gl.glVertex3f( 0.30f, 0f, 0.05f ); // Apacia kaire
      gl.glVertex3f( 0.50f, 0.3f, 0.05f ); // Virsus kairė
      gl.glVertex3f( 0.57f, 0.3f, 0.05f ); // Virsus desine
      //Apatinis stačiakampis
      gl.glColor3f( 0f,1f,1f ); //purple color
      gl.glVertex3f( 0.57f, -0.3f, 0.05f ); // Apacia desine
      gl.glVertex3f( 0.50f, -0.3f, 0.05f ); // Apacia kaire
      gl.glVertex3f( 0.30f, 0f, 0.05f ); // Virsus kairė
      gl.glVertex3f( 0.37f, 0f, 0.05f ); // Virsus desine
      //----------------K RAIDĖ PRIEKIS-----------------
      
      gl.glEnd(); // Done Drawing The Quad
      gl.glFlush();
      angle += 0.2f; //assigning the angle

 }

 @Override
 public void dispose(GLAutoDrawable arg0) {
 //method body
 }

 @Override
 public void init(GLAutoDrawable arg0) {
 // method body
 }

 @Override
 public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
 // method body
 }
 public static void main(String[] args) {
 //getting the capabilities object of GL2 profile
 final GLProfile profile = GLProfile.get(GLProfile.GL2);
 GLCapabilities capabilities = new GLCapabilities(profile);
 // The canvas
 final GLCanvas glcanvas = new GLCanvas(capabilities);
 Lab1 l = new Lab1();
 glcanvas.addGLEventListener(l);
 glcanvas.setSize(600, 600);
 //creating frame
 final JFrame frame = new JFrame ("Inicialai");
 //adding canvas to frame
 frame.getContentPane().add(glcanvas);
 frame.setSize(frame.getContentPane().getPreferredSize());
 frame.setVisible(true);
 //Instantiating and Initiating Animator
 final FPSAnimator animator = new FPSAnimator(glcanvas, 300,true);
 animator.start();
 }//end of main
}//end of class

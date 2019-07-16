/*
 * Kelompok 2PV - Pertumbuhan Bunga
 * Oppi Anda Resta    (161111006)
 * Ulfia Nur Ramadany (161111061)
 * Callista I.A Diaz  (161111066)
 */
package org.yourorghere;

import com.sun.java.swing.plaf.motif.MotifBorders.BevelBorder;
import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLJPanel;
import javax.media.opengl.glu.GLU;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GrafisTA  extends JFrame implements GLEventListener, MouseListener, MouseMotionListener {
GLRenderer glr;

//public void keyPressed(KeyEvent e) {
//System.out.println("pressed "+e.getKeyCode());
// Key_Pressed(e.getKeyCode());
 
    public static void main(String[] args) {
        Frame frame = new Frame("Pertumbuhan Bunga - Objek 3 Dimensi");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new GrafisTA());
        frame.add(canvas);
        frame.setSize(640, 480);
           
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    private float view_rotx = 20.0f;
    private float view_roty = 30.0f;
    private int oldMouseX;
    private int oldMouseY;
    float geserx;
   
 public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_FLAT);
        float ambient[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float difusse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float specular[] = {0.2f, 1.0f, 0.2f, 1.0f};
        float position[] = {20.0f, 30.0f, 20.0f, 0.0f};
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, difusse, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular, 0);
        float[] mambient = {0.1745f, 0.01175f, 0.01175f, 0.55f
        };
        float[] mdiffuse = {0.61424f, 0.04136f, 0.04136f, 0.55f};
        float[] mspecular = {0.727811f, 0.626959f, 0.626959f, 0.55f};
        float mshine = 76.8f;
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, mambient, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, mdiffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, mspecular, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, mshine);
        
//        gl.glEnable(GL.GL_LIGHTING);
//        gl.glEnable(GL.GL_LIGHT0);
//        gl.glEnable(GL.GL_DEPTH_TEST);
//        gl.glEnable(GL.GL_NORMALIZE);
        drawable.addMouseListener(this);
        drawable.addMouseMotionListener(this);
    }
    
       public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    static double bunga=0;
    static double bunga1=0;
    public void display(GLAutoDrawable drawable) {
         
        GL gl = drawable.getGL();
        gl.glEnable(GL.GL_DEPTH_TEST);
        GLU glu = new GLU();
// Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
// Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        glu.gluLookAt(4, 4, 4, // eye pos
                0, 0, 0, // look at
                0, 0, 1); // up
        gl.glTranslatef(-1.5f, -1.5f, -2.5f);
        gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(-0.5f, -0.5f, 1.5f);
     gl.glRotated(50, 0, -1, 0);
     gl.glTranslated(0, 0, -3);
     
 gl.glTranslated( 0, 0, 1);
 
 gl.glPushMatrix();
 Objek.Lingkar(gl);
 
 gl.glTranslatef(0.5f,1.0f,-1.0f);
 gl.glPushMatrix();
 gl.glTranslated(-0.75, -1.5, 1);
 
 gl.glRotated(45, 1, 0.5, 0);

 gl.glPopMatrix();
 
 gl.glLoadIdentity(); 

if(bunga<=1.5){
    bunga+=0.001;
}if(bunga1<=0.5){
    bunga1+=0.001;
}   
    }
    
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        oldMouseX = e.getX();
        oldMouseY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Dimension size = e.getComponent().getSize();
        float thetaY = 360.0f * ((float) (x - oldMouseX) / (float) size.width);
        float thetaX = 360.0f * ((float) (oldMouseY - y) / (float) size.height);
        oldMouseX = x;
        oldMouseY = y;
        view_rotx += thetaX;
        view_roty += thetaY;
    }

    public void mouseMoved(MouseEvent e) {
    }
 }
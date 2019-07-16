package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import static org.yourorghere.GrafisTA.bunga;
import static org.yourorghere.GrafisTA.bunga1;
/**
 *
 * @author ABC
 */
public class Objek {
   static void biji(GL gl){
       gl.glColor3d(0.566, 0.324, 0);
    
 float BODY_RADIUS=0.5f;
 double SLICES=12.34;
 int STACKS=13;
 GLU glu=new GLU();
 GLUquadric q=glu.gluNewQuadric();
 
 glu.gluSphere(q, BODY_RADIUS, (int) SLICES, STACKS);
    }


public static void Lingkar (GL gl ){
    //gl.glTranslated(1,0.25,2);
    //gl.glTranslated(-1, -2, -1);
    // gl.glRotated(45,0 , 0, 1);
    gl.glColor3d(1, 1, 0);
       double BODY_RADIUS=0.025;  
    int SLICES=15;
    int STACKS=5;
 GLU glu=new GLU();
 GLUquadric q=glu.gluNewQuadric();
 glu.gluDisk(q, bunga, BODY_RADIUS, SLICES, 12);
 
 gl.glColor3d(0.125, 0.324, 0);
  
 glu.gluSphere(q, bunga1, (int) 6, STACKS);
    }
}
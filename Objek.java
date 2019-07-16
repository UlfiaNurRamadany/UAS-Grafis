package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import static org.yourorghere.GrafisTA.lebar;
import static org.yourorghere.GrafisTA.tinggi;
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

static void batang(GL gl){
    gl.glTranslated(0, 0, 0.05);
    gl.glColor3d(0.12, 1, 0);
    float BODY_LENGTH=0.5f;
 float BODY_RADIUS=0.025f;

 int SLICES=15;
 int STACKS=13;
 GLU glu=new GLU();
 GLUquadric q=glu.gluNewQuadric();

 glu.gluCylinder(q, lebar, lebar,
         GrafisTA.tinggi, SLICES, STACKS);
 glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
 gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
 glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);   
}

public static void akar (GL gl ){
     gl.glColor3d(0.566, 0.324, 0);
    float BODY_LENGTH=0.005f;
 float BODY_RADIUS=0.025f;

 int SLICES=15;
 int STACKS=13;
 GLU glu=new GLU();
 gl.glRotated(180, 0, 1, 1);
 GLUquadric q=glu.gluNewQuadric();

 glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,
         GrafisTA.akar, SLICES, STACKS);
 glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
 gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
 glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
}

}
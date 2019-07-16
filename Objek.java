package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
/**
 *
 * @author ABC
 */
public class Objek{
   static void biji(GL gl){
   gl.glColor3d(0.566, 0.324, 0);
    
 float BODY_RADIUS=0.5f;
 double SLICES=12.34;
 int STACKS=13;
 GLU glu=new GLU();
 GLUquadric q=glu.gluNewQuadric();
 
 glu.gluSphere(q, BODY_RADIUS, (int) SLICES, STACKS);
 }

public static void pot1(GL gl){
     gl.glRotated(180, 1, 0, 0);
     float BODY_LENGTH=0.005f;
     gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
     gl.glBegin(GL.GL_QUADS);
     gl.glColor3d(0.6750, 0.22311, 0);
     for(int sudut=180;sudut<=360;sudut+=5){
       double radian =sudut *Math.PI/180;
       double nextRadian = (sudut+5)*Math.PI/180;
       double z=1*Math.cos(radian);
       double y=1*Math.sin(radian);
       double nexty=1*Math.sin(nextRadian);
        double nextz=1*Math.cos(nextRadian);
       gl.glVertex3d(0, y, z);
       gl.glVertex3d(2, y, z);
       gl.glVertex3d(2, nexty, nextz);
       gl.glVertex3d(0, nexty, nextz);
   }
   gl.glEnd();
}

public static void pot(GL gl){
     gl.glRotated(180, 1, 0, 0);
     float BODY_LENGTH=0.005f;
     gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
     gl.glBegin(GL.GL_QUADS);
     gl.glColor3d(0.6750, 0.22311, 0);
     for(int sudut=180;sudut<=360;sudut+=5){
       double radian =sudut *Math.PI/180;
       double nextRadian = (sudut+5)*Math.PI/180;
       double z=1*Math.cos(radian);
       double y=1*Math.sin(radian);
       double nexty=1*Math.sin(nextRadian);
       double nextz=1*Math.cos(nextRadian);
       gl.glVertex3d(0, y, z);
       gl.glVertex3d(2, y, z);
       gl.glVertex3d(2, nexty, nextz);
       gl.glVertex3d(0, nexty, nextz);
   }
   gl.glEnd();
}
}
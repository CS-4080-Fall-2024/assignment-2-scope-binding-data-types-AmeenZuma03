



class Cube{
  PVector pos;
  float len;
  
   Cube(float x, float y, float z, float len_) {
     pos = new PVector( x, y, z);
     len = len_;
   }
   void show(){
     fill(255); 
     pushMatrix();
     translate(pos.x, pos.y, pos.z);
     beginShape(QUADS);
     float r = len/2;
     
     fill(top);
     vertex(-r,-r,-r);
     vertex(r, -r,-r);
     vertex(r,r,-r);
     vertex(-r,r,-r);
     
     fill(btm);
     vertex(-r,-r,r);
     vertex(r,-r,r);
     vertex(r,r,r);
     vertex(-r,r,r);
     
     fill(rgt);
     vertex(-r,-r,-r);
     vertex(r, -r,-r);
     vertex(r,-r,r);
     vertex(-r,-r,r);
     
     fill(lft);
     vertex(-r,r,-r);
     vertex(r, r,-r);
     vertex(r,r,r);
     vertex(-r,r,r);
     
     fill(frt);
     vertex(-r,-r,-r);
     vertex(-r, r,-r);
     vertex(-r,r, r);
     vertex(-r,-r,-r);
     
     fill(bck);
     vertex(r,-r,-r);
     vertex(r, r,-r);
     vertex(r,r,-r);
     vertex(r,-r,-r);
     
     endShape();

     popMatrix();
   }
  
}

import peasy.*;
PeasyCam cam;

final int top = 0;
final int btm = 1;
final int rgt = 2;
final int lft = 3;
final int frt = 4;
final int bck = 5; 

color[] colors =  {
  #FFFFFF, #FFFF00,
  #FF0000, #FFA500,
  #00FF00, #0000FF
};
int dim = 3;
Cube[][][] rubix = new Cube[dim][dim][dim];
void setup(){
  size(600,600, P3D);
  cam = new PeasyCam(this, 400);
  for (int i = 0; i < dim; i++){
    for (int j = 0; j < dim; j++){
      for (int k = 0; k < dim; k++){
        float len = 50;
        float offset = ((dim - 1) * len) *  0.5;
        float x = len * i - offset ;
        float y = len * j - offset ;
        float z = len * k - offset ;
        rubix[i][j][k] = new Cube(x, y, z, len);
      }
    }
  }
}

void draw(){
  background(200);
  for (int i = 0; i < dim; i++){
    for (int j = 0; j < dim; j++){
      for (int k = 0; k < dim; k++){
        rubix[i][j][k].show();
      }
    }
  }
  
 
  
}

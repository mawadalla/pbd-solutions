int cloudX;
int cloudY;

void setup() {
  size(700, 700);
  cloudX = 700;
  cloudY = 200;
}


void draw() {
  cloudX += 1;
  
  if (cloudX - 75 > width) {
    cloudX = -75;
    cloudY = (int)random(50, 400);
  }
  
  background(#FFFDD0);
  
  // ground
  noStroke();
  fill(#008000);
  rect(100, height-100, width, 100);
  
  // sun
  noStroke();
  fill(#FF6347);
  ellipse(width-200, 200, 150, 150);
  
  // clouds
  noStroke();
  fill(#87CEFA);
  ellipse(cloudX, cloudY, 70, 50);
  ellipse(cloudX+20, cloudY+15, 70, 50);
  ellipse(cloudX-20, cloudY+15, 70, 50);
 

  rect(0, height, 700, -300);
  
    
}

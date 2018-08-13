void setup() {
  size(700, 700); 
  background(#050400);
}


void draw() { 
  fill(#7E07F7); 
  if (mousePressed) {
    fill(#C307F7);
  }
  ellipse(350, 350, 300, 300);

  fill(#07F7B1); 
  if (mousePressed) fill(#F7C807);
    ellipse(350, 350, 200, 200); 
    if (mousePressed) fill (#ED18CA);
    
}
class Main {
  public static void draw(){
    for(int i = 0;i<10;i++){
      for(int j = 0;j<10;j++){
        System.out.print((i+1)*(j+1));
        System.out.print("\t");
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    draw();
  }
}
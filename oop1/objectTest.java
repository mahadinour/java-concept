package oop1;
 class ObjectIncrementor{
      private int height ;
      private int width ;

      public void setHeight(int height){
          this.height = height;
      }
      public int getHeight(){
          return height;
      }
     public void setWidth(int width){
         this.width = width;
     }
     public int getWidth(){
         return width;
     }

     ObjectIncrementor(int h ,int w){
         height = h;
         width = w;

     }
     public int area (int h ,int w){
        height = h;
        width = w;
        int area;
        area= height*width;
        return area;
     }
}
public class objectTest {
    public static void main(String[] args) {
        ObjectIncrementor obj1 = new ObjectIncrementor(10,20);
        obj1.area(10,20);

        ObjectIncrementor obj2 = new ObjectIncrementor(20 ,20);
        obj2.area(20 , 20);
        System.out.println(obj1.getHeight());
        System.out.println(obj1.getWidth());
    }
}

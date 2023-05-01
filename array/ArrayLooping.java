package array;
class ArrayLooping{
public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayLooping learning = new ArrayLooping();
    learning.declare_array();
    int[] marks = { 77, 83, 92, 93, 95 };
    System.out.println("Before Adding 2 ");
    learning.print_array(marks);
    marks = learning.add2_array(marks);
    System.out.println("After adding 2 ");
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }
    
  }

  private int[] add2_array(int[] marks) {
    // TODO Auto-generated method stub
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 2;
    }
    return marks;

  }

  private void print_array(int[] marks) {
    // TODO Auto-generated method stub
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }

  }

  private void declare_array() {
    // TODO Auto-generated method stub
    int[] marks = { 77, 83, 92, 93, 99 };
    String[] names = new String[3];
    names[0] = "zia";
    names[1] = "karuppasami";
    names[2] = "arunkumar";

    int[] values = new int[0];
    System.out.println(marks.length);
    System.out.println(names.length);
    System.out.println(values.length);
    // values[0] = 123;
    // System.out.println(values[0]);

  }

}
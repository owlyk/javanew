// Implement function that takes two arguments: an array of integers, and a single integer n,
// and determines whether there is a pair of integers in the given array, sum of which is equal to n.

public class Equal {

  public static void main(String[] args) {
    int[] score = {5,3,7,9,7,3,5,8,1,4,6};
}
    
  public static int Equalfun(int[] score, int n) {
    int result = 0;
    int sum = 0;
    for(int i = 0; i< score.length; i += 1) {
      result = score[i] + score[i];
    }

    return result;
    System.out.println(result);
  
}
}


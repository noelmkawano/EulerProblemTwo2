/**
 * Created by NOEL on 2/4/2015.
 */
public class EulerProblemTwo2 {
  public static void main(String[] args) {
    int[] array;
    array = new int[10000];
    array[0]=1;
    array[1]=2;
    int z=0;
    for(int i=2; i<10000; i++){
      array[i]=array[i-1]+array[i-2];
      if(array[i]>=4000000) {
        for (int x = 0; x <= i; x++) {
          if (array[x] % 2 == 0) {
            z = z + array[x];
          }
        }
        System.out.print(z);
        return;
      }
    }

  }
}

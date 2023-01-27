package coreJava.loops;

public class NestedLoop {

    public static void main(String[] args) {

        //nested loop inside another loop, used for repeating a loop.
        //outer and inner loop, each time outer loop is iterated the inner loop is reentered, this means
        // for each outer loop iteration the inner loop will iterate fully.
        // if we want to repeat a loop for N number of times, we create an outer loop with N number of iteration
        // to repeat our inner loop.


        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 7; j++){
                System.out.print(j+" ");
            }
        }

        System.out.println();

        System.out.println("---------------------------------------------------------------------");

        for (int i = 6; i > 1; i--){
            for (int j = 1; j < 7; j++){
                System.out.print(j+" ");
            }
        }




    }
}

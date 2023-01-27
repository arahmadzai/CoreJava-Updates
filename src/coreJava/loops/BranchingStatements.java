package coreJava.loops;

public class BranchingStatements {

    public static void main(String[] args) {

        //break statement inside the switch block is used to exit the case, inside the loop it will exit the loop.

        for (char i = 'A'; i <= 'E'; i++){
            System.out.println(i);

            if (i == 'B'){
                break;
            }
        }

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 1; i <= 5; i++){
            System.out.println(i);

            if (i == 3){
                break;
            }
        }

        System.out.println("--------------------------------------------------------------------------");

        //continue statement: is used to skip the iteration within the loop will jump to the next iteration.

        for (char i = 'A'; i <= 'E'; i++){
            if (i == 'C'){
                continue;
            }
            System.out.println(i);

        }





    }
}

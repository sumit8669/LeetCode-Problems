package data_structure_II;


public class TestMethods {

    public static void main(String[] args) {
        int [] ar = {4,1,2,1,2};
        SingleNumber sn = new SingleNumber();


        System.out.println(sn.singleNumberXOR(ar));
        System.out.println(sn.singleNumber2ForLoop(ar));
    }
}



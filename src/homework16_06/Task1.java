package homework16_06;
//Create a method that will accept an array as parameters and will return a sum of
// all elements from that array. Method should be visibly only within same package and
// accessible by the creating an instance of the class.

public class Task1 {
    protected int sumElem(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}

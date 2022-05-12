package Activity2;

public class Activity2 {

    public static void main(String[] args) {

        int arr[] = {10, 77, 10, 54, -11, 10};
        System.out.println("orginalarray" + arr.toString());
        int a = 10;
        int equal = 30;
        int total = 0;

//        System.out.println("actual number need:" + a);
//        System.out.println("want string : "+ equal);
        int arraySize = arr.length;

        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == 10) {
                total = total +arr[i];
            }
        }
        System.out.println(total);
        if (total == 30) {
            System.out.println("The total is 30");
        } else {
            System.out.println("The total is not 30");
        }
    }

}

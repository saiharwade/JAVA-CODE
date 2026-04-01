public class Array {
    public static void main(String[]args){
         int[] myArr = new int[10]; //this array is initialize when we want to input the values.
         myArr[0] = 90;
         myArr[1] = 75;

         int[] Arr = {1,2,3,55,2,21212}; // this array is use when we already have values

        System.out.println(myArr[0]);
        System.out.println(Arr[5]);

        int i  = 0;
        while(i < Arr.length){
            System.out.println(Arr[i]);
            i++;
        }

        //String Array
        String[] str = new String[5];
        str[1] = "Sai";
        str[2] = "Komal";
        str[3] = "Sid";
        str[4] = "Ash";
        str[0] = "Dogi";

        System.out.print(str[0]);
    }
}

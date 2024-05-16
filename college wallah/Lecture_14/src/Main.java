class ArrayExample{

    void searchInArray(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int num =5;
        int ans = -1;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == num){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("Element is not Present in the Array");
        }
        else {
            System.out.println("the element is found at " + ans + " index");
        }
    }

    void maxOfArray(){
        int[] arr = {1,2,3,4,5,5,9,4,2,3};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    void sumOfArray(){
        int[] arr = {1,2,3,4,5,6,6};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }

    void multiArrays(){
        int [] []arr2 = new int [2] [2];
        int [][] arr = {{2,3},{4,5},{5,7}};

//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]);
    }
    System.out.println();
}



    }

    void demoArray(){
        int[] ages = new int[3];
        float[] number = new float[3];
        String[] name = {"Shobhit","Rohit","Abhishek"};

        ages[0]=10;
        ages[1]=20;
        ages[2]=30;

        number[0]=100.10f;
        number[1]=15.23f;
        number[2]=45.50f;
//
//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
//
//        System.out.println();
//
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[2]);
//
//        System.out.println();
//
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        for(int i=0;i<3;i++){
//            System.out.println(ages[i]);
//        }
//        for(float num : number){
//            System.out.println(num);
//        }
//        for(String s : name){
//            System.out.println(s);
//        }

        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args){
        ArrayExample obj = new ArrayExample();
//        obj.demoArray();
//        obj.multiArrays();
//        obj.sumOfArray();
//        obj.maxOfArray();
        obj.searchInArray();
    }
}

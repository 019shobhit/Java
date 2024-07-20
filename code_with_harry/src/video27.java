public class video27 {
    public static void main(String[] args) {
        int []marks1 = {80,60,85,90,95,95,82};
        float []marks2 = {95.5f , 80.45f, 63.95f, 88.55f, 99.5f};
        String []stu = {"Shobhit", "Abhishek", "Akash", "Rohit", "Deepak" };
//        System.out.println(stu[0]);
//        System.out.println(stu[1]);
//        System.out.println(stu[2]);
//        System.out.println(stu[3]);
//        System.out.println(stu[4]);
        for(int i=0; i<stu.length; i++){
            System.out.println(stu[i]);
        }
        for (int j=stu.length-1; j>=0; j--){
            System.out.println(stu[j]);
        }
        for(int element:marks1){
            System.out.println(element);
        }
    }
}
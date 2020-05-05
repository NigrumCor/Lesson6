public class MyArrayList {
    public static void main(String[] args) {

    int [] arr = {0, 1, 4, 5, 6, 8};
    MyArrayListOpt myArr = new MyArrayListOpt(arr);
        System.out.println(myArr.contains(7));
        myArr.add(9);
        System.out.println(myArr);
        myArr.remove(3);
        System.out.println(myArr);
    }



}

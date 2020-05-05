public class MyArrayListOpt {
    int [] arr;
    int last;

    public MyArrayListOpt(int[] arr) {
        this.arr = arr;
        this.last = arr.length;

    }

    public boolean contains(int a) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == a)
                return true;
        return false;

    }

    public void add(int a) {
        if (last == arr.length) {
            int[] temp_arr = arr.clone();
            arr = new int[((last * 3) / 2) + 1];
            for (int i = 0; i < last; i++)
                this.arr[i] = temp_arr[i];
        }
        arr[last++] = a;
    }

    public void remove(int index) {
        for (int i = ++index; i < last; i++)
            arr[i - 1] = arr[i];
        last--;


    }
}

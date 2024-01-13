import java.util.Arrays;

public class ArrayApi {
    public void solution(){
        int[] arr = new int[4]; //이미 0으로 초기
        //arr = {2,3,5,6}; error
        System.out.println(Arrays.toString(arr)); //[0,0,0,0]

        int[] arr1 = null;  //null 입력 후
        arr1 = new int[]{4,3,5,6};  //나중에 초기화 가능

        int[] arr2 = new int[]{4,3,2};  //선언시 초기화

        String[] str = new String[3];
        System.out.println(Arrays.toString(str));  //[null,null,null]

        String[] str1 = null;
        str1 = new String[]{"a","b","c"};

        String[] str2 = new String[]{"d","e","f"};

        Arrays.fill(str1,"fill");
        System.out.println(Arrays.toString(str1));  //[fill, fill, fill]
    }
}


public class task3 {
    public static void main(String [] args){
        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        for(int i = 0; i < arr.length ; i++){
            if(i == arr.length - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    arr[j] = 0;
                }
            }
        }
        System.out.println("After replacing duplicates with 0:");
        for(int i = 0; i < arr.length ; i++){
            if(i == arr.length - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}

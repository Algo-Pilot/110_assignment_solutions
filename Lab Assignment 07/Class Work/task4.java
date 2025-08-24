public class task4 {
    public static void main(String [] args){
        int arr [] = {23,100,23,56,100};
        int count = 0;
        int [] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arr2[i] = arr[i];
                count++;
            }
            else{
                boolean flag = true;
                for(int j = 0; j < count; j++){
                    if(arr2[j] == arr[i]){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    arr2[count] = arr[i];
                    count++;
                }
            }
        }
        System.out.println("Input array: ");
        for(int i = 0; i < arr.length ; i++){
            if(i == arr.length - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println("New array: ");
        for(int i = 0; i < count ; i++){
            if(i == count - 1){
                System.out.println(arr2[i]);
            }
            else{
                System.out.printf("%d ", arr2[i]);
            }
        }
    }
}

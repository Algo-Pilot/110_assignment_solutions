public class task5 {
    public static void main(String [] args){
        int [] marks = {85, 90, 75, 44, 99};
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks.length - 1; j++){
                if(marks[j] > marks[j + 1]){
                    int temp = marks[j];
                    String tmp = names[j];
                    marks[j ] = marks[j+ 1];
                    names[j] = names[j+1];
                    marks[j+1] = temp;
                    names[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i = 0; i < marks.length ; i++){
            if(i == marks.length - 1){
                System.out.println(marks[i]);
            }
            else{
                System.out.printf("%d ", marks[i]);
            }
        }
        for(int i = 0; i < names.length ; i++){
            if(i == names.length - 1){
                System.out.println(names[i]);
            }
            else{
                System.out.printf("%s ", names[i]);
            }
        }
    }
}

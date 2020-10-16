public class AddTen {
    public static void add(int[] array){
        int c=0;
        for (int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]+array[j]==10){
                    System.out.println(array[i]+" "+array[j]);
                    c=1;
                    break;
                }
            }
            if (c==1){
                break;
            }

        }


    }
    public static void main(String[] args){
        int[] array={4,5,12,-2,8,9};
        add(array);
    }
}

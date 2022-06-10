public class KBP_6_b {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index=arr.length-1;
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*100);
        }
        int min=arr[index];
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        System.out.println("The max element :"+maxEle(index, arr, min));
    }
    public static int maxEle(int index,int[] arr,int min){
        if(index<0){
            return min;
        }else if(arr[index]<min){
            return maxEle(index-1, arr, arr[index]);
        }else{
            return maxEle(index-1, arr, min);
        }
    }
}

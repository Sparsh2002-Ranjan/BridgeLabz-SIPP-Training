public class DividePens{
    public static void main(String[] args) {
        int pens=14;
        int n=pens;
        int students=3;
        int sum=0;
        for(int i=0;i<n;i++){
            if(pens%students>=students){
                sum++;
                pens=pens-students;
            }
            else{
                break;
            }
        }
        System.out.print("The Pen Per Student is "+ sum +" and the remaining pen not distributed is "+pens)
    }
}
public class Main {

    public static void main(String[] args) {
	int[] sayılar = new int[]{1,2,5,7,9};
	int aranacak= 5;
	boolean var =false;
	for(int a: sayılar){
	    if(aranacak==a){
	        var=true;
	        break;
        }
    }
     if(var){
         System.out.println("Sayı kümenin içinde!");
     }else{
         System.out.println("Sayı kümenin içinde değil!");
     }
    }
}

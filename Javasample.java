public class  Javasample{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(Sysem.in);
		int N=scanner.nextInt();
		if(N%2==0){
	            if(N<=20){
	                 if(N>=2 && N<5){
	                System.out.println("Not Weird");
	            }else{
	                System.out.println("Weird");
	            }
	                
	            }else{
	                
	               System.out.println("Not Weird");
	            }
	        }else{
	            System.out.println("Weird");
	        }
}
}

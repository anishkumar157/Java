public class CommandLineArguments{
	public static void main(String[] args) {
		
		for(int index=0; index<args.length; index++){
			System.out.println(args[index]);
		}

		for(int index=args.length-1; index>=0; index--){
			System.out.println(args[index]);

		}
	}
}
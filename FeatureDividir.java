public class FeatureDividir{

    public static void main(String []args){

	int result=-1000;
         
        if(args.length == 0)
            System.exit(0);
           
        for(int counter = 0; counter < args.length; counter++){
            System.out.println("argument index " + counter + ": " + args[counter]);
        }
		if (Integer.parseInt(args[1]) != 0)
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
		else 
			System.out.println("Err: div by zero");

        System.out.println("Result=" + result);

     }
}

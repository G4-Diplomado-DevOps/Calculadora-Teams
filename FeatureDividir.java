public class FeatureDividir{

    public static void main(String []args){

	Double result=-1000.0;
         
        if(args.length == 0)
            System.exit(0);
           
        for(int counter = 0; counter < args.length; counter++){
            System.out.println("argument index " + counter + ": " + args[counter]);
        }
		if (Double.parseDouble(args[1]) != 0) {
            result = Double.parseDouble(args[0]) / Double.parseDouble(args[1]);
            System.out.println("Result=" + result);
        }
		else { 
			System.out.println("Err: div by zero");
        }
        

     }
}

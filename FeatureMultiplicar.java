public class FeatureMultiplicar{

    public static void main(String []args){

	int result;
         
        if(args.length == 0)
            System.exit(0);
           
        for(int counter = 0; counter < args.length; counter++){
            System.out.println("argument index " + counter + ": " + args[counter]);
        }

		result = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);

        System.out.println("Result=" + result);

     }
}

package hackerrank.days30ofCode;

public class Varargs_SimpleAddition {
    class Add {
        public void add(int...args){
            int sum =0;
            for (int i= 0; i< args.length; i++) {
                sum += args[i];
                System.out.print(args[i]);
                if (i == args.length-1){
                    System.out.println("=" + sum);
                }else{
                    System.out.print("+");
                }
            }

        }
    }
}

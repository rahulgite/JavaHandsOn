package concepts;

@FunctionalInterface
    interface Operation
    {
        void operate(int n);
    }

    public class Closure
    {
        public static void main(String args[])
        {
            int x=20;
            int y=90;
            //the method parses two parameters i.e. x and the operate() method of the concepts.Operation interface
            //implementation of closure in lambda expression
            //overrides the operate() method
            doSum(x, n -> {
                //prints the result
                System.out.println("Sum is: "+(n+y));
            });
        }
        private static void doSum(int i, Operation op)
        {
            op.operate(i);
        }
    }

/*
Sum is: 110

 */
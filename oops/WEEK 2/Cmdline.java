//7. Write a Java program to give an example for command line arguments.
class Cmdline 
{ 
    public static void main(String[] args) 
    { 
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
        } 
    } 
}
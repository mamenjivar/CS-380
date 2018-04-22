public class cml{
  public static void main(String[] args){
    int count = 0;

    // System.out.println("Hello from world");
    // System.out.println("Hello " + args[0]);
    System.out.println();

    boolean loop = true;
    while(loop){

      switch(args[count]){
        case "--help":
          System.out.println(args[count]);
          help();
          System.out.println("This is the help section of the program");
          count++;
          break;
        case "-why":
          System.out.println(args[count]);
          System.out.println("this is a why section");
          count++;
          break;
        case ".eot":
          System.out.println("This is the end of the program");
          loop = false;
          count++;
          break;
      }
    }
  }

  public void help(){
    System.out.println("myRepositories\n");

    System.out.println("\'myReposities\' returns a list of repositories based on username\n");

    System.out.println("Version\t: 1.0.0");
    System.out.println("Author\t: Miguel Menjivar");

  }

  public void
}

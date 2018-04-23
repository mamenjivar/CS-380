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
          helpMe();
          count++;
          break;
        case "-why":
          System.out.println(args[count]);
          System.out.println("this is a why section");
          count++;
          break;
        // end of program
        case ".eot":
          loop = false;
          count++;
          break;
      }
    }
  }

  /**
  * 
  */
  public static void helpMe(){
    System.out.println("myRepositories\n");

    System.out.println("\'myReposities\' returns a list of repositories based on username\n");

    System.out.println("Version\t: 1.0.0");
    System.out.println("Author\t: Miguel Menjivar");

  }
}

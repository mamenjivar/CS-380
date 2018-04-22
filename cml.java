public class cml{
  public static void main(String[] args){
    int count = 0;

    // System.out.println("Hello from world");
    System.out.println("Hello " + args[0]);

    boolean loop = true;

    while(loop){

      switch(args[count]){
        case "--help":
          System.out.println("This is the help section of the program");
          break;
        case ".eot":
          System.out.println("This is the end of the program");
          loop = false;
          break;
        case "-why":
          System.out.println("this is a why section");
          break;
      }

    }

    // if(args[0].equals("--help")){
    //   System.out.println("You will be pulling up your own github repository for people to see");
    // }
    // else{
    //   System.out.println("You don't need help homie");
    // }
  }
}

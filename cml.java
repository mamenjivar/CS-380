public class cml{
  public static void main(String[] args){
    // System.out.println("Hello from world");
    System.out.println("Hello " + args[0]);
    if(args[0].equals("--help")){
      System.out.println("You will be pulling up your own github repository for people to see");
    } else{
      System.out.println("You don't need help homie");
    }
  }
}

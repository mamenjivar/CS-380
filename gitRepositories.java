/*
 * Name: Miguel Menjivar
 * Course: CS 380 Computer Networks
 * gitRepositories.java
 *
 * Assignment: Poject #1
 * Date: 4/22/18
 *
 * Description: Github repositories
 */
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.serviceRepositoryService;

public class gitRepositories{
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

  /*
   * Will print out the instructions for this particular
   * project and how the user will be able to utilize this program
   */
  public static void help(){
    System.out.println("myRepositories USERNAME | --help\n");

    System.out.println("\'myReposities\' returns a list of repositories based on username\n");

    System.out.println("Version\t: 1.0.0");
    System.out.println("Author\t: Miguel Menjivar");
    System.out.println("Contact\t: mamenjivar@cpp.edu");

  }
}

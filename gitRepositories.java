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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class gitRepositories{
  public static void main(String[] args) throws Exception{
    Scanner keyboard = new Scanner(System.in);
    // ArrayList<String> al = new ArrayList<>();
    int count = 0;
    String argOne;
    String argTwo;

    argOne = keyboard.nextLine();
    argTwo = keyboard.nextLine();

    String[] split = argOne.split(" ");



    // System.out.println("Hello from world");
    // System.out.println("Hello " + args[0]);
    System.out.println();

    boolean loop = true;
    count = split.length;
    while(loop){
      for(int i = 0; i < count; i++){
        if(split[i].equals("--help")){
          help();
        }
        else if(split[i].equals("--synopsis")){
          synopsis();
        }
        else {
          repository(split[i]);
        }
      }

      if(argTwo.equals(".eot")){
        loop = false;
      }
    }
  }

  /*
   * Will print out the instructions for this particular
   * project and how the user will be able to utilize this program
   */
  public static void help(){
    System.out.println("-----------HELP-----------------------");
    System.out.println("myRepositories [--function] USERNAME | --help\n");

    System.out.println("\'myReposities\' returns a list of all the public repositories in Github");
    System.out.println("The user will just input the username of the github account of any user, and");
    System.out.println("the program will show all the public repositories of that specified account\n");

    System.out.println("USERNAME will be replaced with the specified username associated with the Github account");
    System.out.println("Then the program will print out only the public repositories of that account");

    System.out.println("Version\t: 1.0.0");
    System.out.println("Author\t: Miguel Menjivar");
    System.out.println("Contact\t: mamenjivar@cpp.edu");

  }

  /*
  */
  public static void synopsis(){
    System.out.println("Lists all the public Github repositories with a valid username. (V1.0.0)");
  }

  /*
  */
  public static void repository(String username) throws Exception{
    ArrayList<String> al = new ArrayList<>();
    System.out.println("This repository belongs to " + username);

      HttpURLConnection web = (HttpURLConnection) new URL("https://api.github.com/users/" + username + "/repos").openConnection();
      web.addRequestProperty("User-Agent", "Mozilla/5.0");
      BufferedReader in = new BufferedReader(new InputStreamReader(web.getInputStream()));

      String line;

      while((line = in.readLine()) != null){
        al.add(line);
      }

      String[] split = al.get(0).split(",");
      int num = 1;
      for(int i = 0; i < split.length; i++){
        if(split[i].contains("\"name\"")){
          System.out.println(num + ") " + split[i].substring(split[i].lastIndexOf(":") + 1).replaceAll("\"", ""));
          num++;
        }
      }
  }
}

/*
 * Name: Miguel Menjivar
 * Course: CS 380 Computer Networks
 * test.java
 *
 * Assignment: Poject #1
 * Date: 4/22/18
 *
 * Description: Github repositories
 * for testing purposes
 */
// import org.eclipse.egit.github.core.Repository;
// import org.eclipse.egit.github.core;
// import org.eclipse.egit.github.core.serviceRepositoryService;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
// import java.io.File;

import java.util.Scanner;
import java.util.ArrayList;

public class test{
  public static void main(String[] args) throws Exception{
    ArrayList<String> al = new ArrayList<>();
    int count = 0;

    // al.add("number");

    // HttpURLConnection httpcon = (HttpURLConnection) new URL("https://api.github.com/repos/goxr3plus/XR3Player/releases").openConnection();
    HttpURLConnection httpcon = (HttpURLConnection) new URL("https://api.github.com/users/mamenjivar/repos").openConnection();
    httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
    BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
    // File file = new File(new InputStreamReader(httpcon.getInputStream()));
    // Scanner in = new Scanner(file);

    StringBuilder responseSB = new StringBuilder();
    String line;
    while((line = in.readLine()) != null){
      // if(line.contains("name")){
      //   System.out.println(line);
      // }
      // System.out.println(line.replaceAll(",", "\n"));
      // al.add(line.split(","));
      // al.add(line.replaceAll(",", "\n"));
      al.add(line);


    }

    String[] split = al.get(0).split(",");
    // System.out.println(split.length);

    for(int i = 0; i < split.length; i++){
      if(split[i].contains("\"name\"")){
        System.out.println(split[i].substring(split[i].lastIndexOf(":") + 1).replaceAll("\"", ""));
      }
    }

    // System.out.println(line);
    in.close();
  //   System.out.println(al.get(0));
  //   bool loopTwo = true;
  //   String n;
  // while (loopTwo){
  //
  //   if(n = al.get(0).contains("name")){
  //     System.out.println
  //   }
  // }

    // System.out.println(al.get(0));
    // System.out.println(al.get(0).matches("name"));
    // System.out.println(line);
    // if(al.get(0).contains("name"))
    //   System.out.println("");
    // }
    //
    // for(int i = 0; i < count; i++){
    //   System.out.println(al;
    // }\
    // System.out.println(al);

    // //Get Git Hub Downloads of XR3Player
		// Arrays.stream(responseSB.toString().split("\"download_count\":")).skip(1).map(l -> l.split(",")[0]).forEach(l -> System.out.println(l));
    //
		// //Sum up all download counts
		// int total = Arrays.stream(responseSB.toString().split("\"download_count\":")).skip(1).mapToInt(l -> Integer.parseInt(l.split(",")[0])).sum();
		// System.out.println("\nTotal Downloads: " + total);
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

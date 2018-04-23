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

import java.util.Scanner;
import java.util.ArrayList;

public class test{
  public static void main(String[] args) throws Exception{
    ArrayList<String> al = new ArrayList<>();
    int count = 0;

    al.add("number");

    // HttpURLConnection httpcon = (HttpURLConnection) new URL("https://api.github.com/repos/goxr3plus/XR3Player/releases").openConnection();
    HttpURLConnection httpcon = (HttpURLConnection) new URL("https://api.github.com/users/mamenjivar/repos").openConnection();
    httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
    BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));

    StringBuilder responseSB = new StringBuilder();
    String line;
    while((line = in.readLine()) != null){
      // responseSB.append("\n" + line);
      if(line.equals("name")){
        al.add(line);
        count++;
      }
      // System.out.println(line);
    }
    in.close();
    //
    // for(int i = 0; i < count; i++){
    //   System.out.println(al;
    // }\
    System.out.println(al);

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

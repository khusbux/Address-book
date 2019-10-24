import java.io.*;
import java.util.*;
public class Address 
{
  
  int house_no,post_code; 
  String street_name,town,country;
 
 public void getinput(int house_no, int  post_code, String street_name,String town, String country)
 {
    this.house_no = house_no;
	this.post_code = post_code;
	this.street_name = street_name;
	this.town = town;
	this.country = country;
 } 
    public void show()
   {
     System.out.println("Address: " + house_no +", "+  street_name +", "+ town +", "+ country +", "+  post_code );
   }
}

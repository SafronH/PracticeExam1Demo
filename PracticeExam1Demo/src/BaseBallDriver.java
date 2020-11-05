
import java.util.Scanner;
import java.util.ArrayList;

public class BaseBallDriver {

public static void main(String[] args) {
	
// arrayLists to hold the players for each league
ArrayList<TeeBallPlayer> TBPlayers = new ArrayList<TeeBallPlayer>();
ArrayList<LittleLeaguePlayer> LLPlayers = new ArrayList<LittleLeaguePlayer>();
ArrayList<JuniorVarsityPlayer> JVPlayers = new ArrayList<JuniorVarsityPlayer>();

String name, age, jerseyNumber = null, position = null,  repeat = " ";
  
@SuppressWarnings("resource")
Scanner keyboard = new Scanner(System.in);               
do
{
System.out.print("\nName: ");
name = keyboard.nextLine();

try {
System.out.print("Age: ");
age = keyboard.nextLine();
if(validAge(age) == true)
{
if(Integer.parseInt(age) < 8)
{
System.out.println("Player is old enough to play Tee-Ball");
}
else if(Integer.parseInt(age)< 13)
{
System.out.println("Player is old enough to play Little League");
}
else
{
System.out.println("Player is old enough to play Junior Varsity");
}
}

//prompt for the jersey number
try
{
System.out.print("Desired Jersey Number: ");
jerseyNumber = keyboard.nextLine();
if (validJersey(jerseyNumber) == true) 
{
System.out.println("Jersey Number is valid");
}

}
catch(JerseyNumberException e )
{
System.out.println(e.getMessage());
}

try
{
System.out.println("Choose from the following positions for Man Manners:");
System.out.println("1B - First Base");
System.out.println("2B - Second Base");
System.out.println("3B - Third Base");
System.out.println("C - Catcher");
System.out.println("P - Pitcher");
System.out.println("SS - Short Stop");
System.out.println("LF - Left Field");
System.out.println("CF - Center Field");
System.out.println("RF - Right Field");

System.out.print("Desired Position: ");
position = keyboard.nextLine();
if(validPosition(position, age) == true)
{
System.out.println("Position is valid");
}
}
catch(PositionException e) 
{
System.out.println(e.getMessage());
}

if(Integer.parseInt(age)<8)
{
TBPlayers.add(new TeeBallPlayer(name, age, jerseyNumber, position));
}
else if(Integer.parseInt(age) < 13)
{
LLPlayers.add(new LittleLeaguePlayer(name, age, jerseyNumber, position));
}
else 
{
JVPlayers.add(new JuniorVarsityPlayer(name, age, jerseyNumber, position));
}
}
//catch the Age Exception
catch(AgeException e ) 
{
System.out.println(e.getMessage());
}

System.out.print("Would you like to enter another player(Y/N): ");
repeat = keyboard.nextLine();

}while(repeat.equalsIgnoreCase("y"));


System.out.println("\nTee-Ball Players");
for (TeeBallPlayer p : TBPlayers)
{
System.out.println(p.display());
}
System.out.println("\nLettle League Players");

for (LittleLeaguePlayer p : LLPlayers)
{
System.out.println(p.display());
}
System.out.println("\nJunior Varsity Players");

for (JuniorVarsityPlayer p : JVPlayers) 
{
System.out.println(p.display());
}

}

public static boolean validAge(String age) throws AgeException {

// check for the conditions and throw an exception
if(Integer.parseInt(age) <5 || Integer.parseInt(age) >15)
{
throw new AgeException("Age must be between 5 and 15 years old");
}
return true;

}

public static boolean validJersey(String jerseyNumber) throws JerseyNumberException {
 
if(Integer.parseInt(jerseyNumber) <0 || Integer.parseInt(jerseyNumber)  >99) 
{ 
throw new JerseyNumberException("Jersey Number is invalid");
}
 
// if an exception is NOT thrown, return true
return true;
 
}
 
public static boolean validPosition(String position,String age) throws PositionException { 
  
if(position.length() < 1 || position.length() > 2)
{
throw new PositionException("Invalid Position");
}
  
// check the age parameter
if(Integer.parseInt(age) <8)
{
// Player in Tee Ball League (age between 5 and 7) cannot play position P - Pitcher
if(!position.equalsIgnoreCase("1B") &&!position.equalsIgnoreCase("2B")&&
   !position.equalsIgnoreCase("3B") &&!position.equalsIgnoreCase("C")&&
   !position.equalsIgnoreCase("LF") &&!position.equalsIgnoreCase("CF")&&
   !position.equalsIgnoreCase("RF") &&!position.equalsIgnoreCase("SS"))
{
throw new PositionException("Not a valid position for Tee-Ball");
}
else
{
if(!position.equalsIgnoreCase("1B") &&!position.equalsIgnoreCase("2B")&&
   !position.equalsIgnoreCase("3B") &&!position.equalsIgnoreCase("C")&&
   !position.equalsIgnoreCase("LF") &&!position.equalsIgnoreCase("CF")&&
   !position.equalsIgnoreCase("RF") && !position.equalsIgnoreCase("SS")&&
   !position.equalsIgnoreCase("P"))
{
throw new PositionException("Not a valid positon for this league");
}
  
}
}
return true;
}
}
  
  
  
  
 
  
 
 
 
 


import java.util.Scanner;

public class MCCSchedule
{
public static void main(String[] args)
{
//Course mySchedule[] = new Course[5];
//populateSchedule(mySchedule);
//mySchedule[0] = new Course("Adv Java", "CTIM168", 3, 4);
//mySchedule[1] = new Course("App Design", "CTIM139", 3, 4);
//mySchedule[2] = new Course("Intro C++", "CTIM371", 3, 4);
//mySchedule[3] = new Course("Security", "CTIM180", 3, 3);
//mySchedule[4] = new Course("Python", "CTIM285", 3, 4);

Scanner keyboard = new Scanner(System.in);

Course mySchedule[] = { new Course("Adv Java", "CTIM168", 13, 444), 
                        new Course("App Design", "CTIM139", 333, 41),
                        new Course("Intro C++", "CTIM371", 23, 478),
                        new Course("Security", "CTIM180", 31, 3),
                        new Course("Python", "CTIM285", 3, 14)};                       
                        
int selection, position, keyInt; 
String keyString;
                        
printMySchedule(mySchedule);

do
{
System.out.println("Enter your selection:");
System.out.println("Enter 1 to list your schedule:");
System.out.println("Enter 2 to sort my name:");
System.out.println("Enter 3 to sort by ID:");
System.out.println("Enter 4 to sort by credits:");
System.out.println("Enter 5 to sort by contact hours:");
System.out.println("Enter 6 to search my name:");
System.out.println("Enter 7 to search by ID:");
System.out.println("Enter 8 to search by credits:");
System.out.println("Enter 9 to search by contact hours:");
System.out.println("Enter 0 to exit:");
selection = keyboard.nextInt();

switch(selection)
{
case 0:
   System.out.println("Thank you for using Schedule Finder.");
   break;
case 1:
   printMySchedule(mySchedule);
   break;
case 2:
   sortByCourseName(mySchedule);
   break;
case 3:
   sortByDeptID(mySchedule);
   break;   
case 4:
   sortByCreditHours(mySchedule);
   break;
case 5:
   sortByContactHours(mySchedule);
   break;
case 6:
   sortByCourseName(mySchedule);   
   System.out.println("Please enter the name to search for: ");
   keyString = keyboard.nextLine();
   position = binarySearchCourseName(mySchedule, 0, mySchedule.length, keyString);
   if(position < 0)
   {
   System.out.println("Course with that name was not found.");
   break;
   }
   else
   {
   System.out.println(mySchedule[position].toString());
   break;
   } 
case 7:
   sortByDeptID(mySchedule);   
   System.out.println("Please enter the Dept ID to search for: ");
   keyString = keyboard.nextLine();
   position = binarySearchDeptID(mySchedule, 0, mySchedule.length, keyString);
   if(position < 0)
   {
   System.out.println("Course with that Dept ID was not found.");
   break;
   }
   else
   {
   System.out.println(mySchedule[position].toString());
   break;
   }
case 8:
   sortByCreditHours(mySchedule);   
   //int key;
   System.out.println("Please enter the credit hours to search for: ");
   keyInt = keyboard.nextInt();
   position = binarySearchCreditHours(mySchedule, 0, mySchedule.length, keyInt);
   if(position < 0)
   {
   System.out.println("Course with that number of credit hours was not found.");
   break;
   }
   else
   {
   System.out.println(mySchedule[position].toString());
   break;
   } 
case 9:
   sortByContactHours(mySchedule);   
   System.out.println("Please enter the contact hours to searh for: ");
   keyInt = keyboard.nextInt();
   position = binarySearchContactHours(mySchedule, 0, mySchedule.length, keyInt);
   if(position < 0)
   {
   System.out.println("Course with that number of contact hours was not found.");
   break;
   }
   else
   {
   System.out.println(mySchedule[position].toString());
   break;
   }
default:
   System.out.println("Entered invalid number, must be 0 - 9.");
   break;         
}//end switch

}while(selection != 0);//end loop





}//end main


//////SEARCHING METHODS

public static int binarySearchDeptID
   (Course[] sortedArrayPassed, int first, int upto, String key)
{
while(first < upto)
{
int mid = (first + upto)/2;
if(key.compareTo(sortedArrayPassed[mid].getDeptID()) < 0)
{
upto = mid;
}//end if 
else if(key.compareTo(sortedArrayPassed[mid].getDeptID()) > 0)
{
first = mid + 1;
}//end if
else //found it
{
return mid;
}//end else
}//end while
return -1;
}//end method 


public static int binarySearchCourseName
   (Course[] sortedArrayPassed, int first, int upto, String key)
{
while(first < upto)
{
int mid = (first + upto)/2;
if(key.compareTo(sortedArrayPassed[mid].getCourseName()) < 0)
{
upto = mid;
}//end if 
else if(key.compareTo(sortedArrayPassed[mid].getCourseName()) > 0)
{
first = mid + 1;
}//end if
else //found it
{
return mid;
}//end else
}//end while
return -1;
}//end method binarySearchContactHours










/**
Method binarySearchContactHours assumes that array passed has
been sorted by contactHours before passing to method
*/

public static int binarySearchCreditHours
   (Course[] sortedArrayPassed, int first, int upto, int key)
{
while(first < upto)
{
int mid = (first + upto)/2;
if(key < sortedArrayPassed[mid].getNumCredits())
{
upto = mid;
}//end if 
else if(key > sortedArrayPassed[mid].getNumCredits())
{
first = mid + 1;
}//end if
else //found it
{
return mid;
}//end else
}//end while
return -1;
}//end method binarySearchContactHours




/**
Method binarySearchContactHours assumes that array passed has
been sorted by contactHours before passing to method
*/

public static int binarySearchContactHours
   (Course[] sortedArrayPassed, int first, int upto, int key)
{
while(first < upto)
{
int mid = (first + upto)/2;
if(key < sortedArrayPassed[mid].getNumContactHoursPerWeek())
{
upto = mid;
}//end if 
else if(key > sortedArrayPassed[mid].getNumContactHoursPerWeek())
{
first = mid + 1;
}//end if
else //found it
{
return mid;
}//end else
}//end while
return -1;
}//end method binarySearchContactHours


/////SORTING METHODS

public static void sortByCourseName(Course[] arrayPassed)
{
int n = arrayPassed.length;
Course temp;

for(int i = 1; i < n; ++i)
{
for(int j = 0; j < n - i; ++j)
{
if(arrayPassed[j].getCourseName().compareTo 
      (arrayPassed[j + 1].getCourseName()) > 0)
{
temp = arrayPassed[j];
arrayPassed[j] = arrayPassed[j + 1];
arrayPassed[j + 1] = temp;
}//end if
}//end inner loop
}//end outer loop
}//end method




public static void sortByDeptID(Course[] arrayPassed)
{
int n = arrayPassed.length;
Course temp;

for(int i = 1; i < n; ++i)
{
for(int j = 0; j < n - i; ++j)
{
if(arrayPassed[j].getDeptID().compareTo 
      (arrayPassed[j + 1].getDeptID()) > 0)
{
temp = arrayPassed[j];
arrayPassed[j] = arrayPassed[j + 1];
arrayPassed[j + 1] = temp;
}//end if
}//end inner loop
}//end outer loop
}//end method


public static void sortByContactHours(Course[] arrayPassed)
{
int n = arrayPassed.length;
Course temp;

for(int i = 1; i < n; ++i)
{
for(int j = 0; j < n - i; ++j)
{
if(arrayPassed[j].getNumContactHoursPerWeek() > 
      arrayPassed[j + 1].getNumContactHoursPerWeek())
{
temp = arrayPassed[j];
arrayPassed[j] = arrayPassed[j + 1];
arrayPassed[j + 1] = temp;
}//end if
}//end inner loop
}//end outer loop
}//end method




public static void sortByCreditHours(Course[] arrayPassed)
{
int n = arrayPassed.length;
Course temp;

for(int i = 1; i < n; ++i)
{
for(int j = 0; j < n - i; ++j)
{
if(arrayPassed[j].getNumCredits() > arrayPassed[j + 1].getNumCredits())
{
temp = arrayPassed[j];
arrayPassed[j] = arrayPassed[j + 1];
arrayPassed[j + 1] = temp;
}//end if
}//end inner loop
}//end outer loop
}//end method


public static void printMySchedule(Course[] mySchedulePassed)
{
for(int i = 0; i < mySchedulePassed.length; ++i)
{
System.out.println(mySchedulePassed[i].toString());
}
}//end method


public static void populateSchedule(Course[] mySchedulePassed)
{
for(int i = 0; i < mySchedulePassed.length; ++i)
{
mySchedulePassed[i] = new Course();
}
}//
}//end class

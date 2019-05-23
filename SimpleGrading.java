public class SimpleGrading implements Grading, InputGrades
{
/**
Accept an arrray of ints and return the simple average
*/
@Override
public int mean(int[] arrayPassed)
{
return 0;
}//end method

/**
Accept an arrray of ints and return the median
Median is defined as the number that has as many numbers 
grader than and less than (average inner two numbers if 
array is of even length
for example the median of an array 1,2,3,4,5 is 3
for example the median of an array 1,2,3,4, is 2.5
for example the median of an array 13, 13, 13, 13, 14, 14, 16, 18, 21 is 14
for example the median of an array 8, 9, 10, 10, 10, 11, 11, 11, 12, 13 is 10.5

*/
@Override
public int median(int[] arrayPassed)
{
return 0;
}//end method

/**
mode is defined as the most frequently occuring number
method will return an array of the most frequent numbers
if the original array is retutn no duplicates
*/
@Override
public int[] mode(int[] arrayPassed)
{
int[] x = {1,2,3};
return x;
}//end method

/**
Ask user for number of grades to process save to n
Create array of size n
Ask user for values and save to and array
*/
@Override
public int[] strictGrades()
{
int[] x = {1,2,3};
return x;
}//end method

/*
mode is defined as the most frequently occuring number
method will return an array of the most frequent numbers
if the original array is retutn no duplicates
*/
@Override
public int[] lessStrictGrades()
{

int[] x = {1,2,3};
return x;
}//end method

}//end class

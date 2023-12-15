import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.HashSet;


public class EmployeesHashSet
{
    public static void main(String[] args)
    {
        String data;
        // I create a HashSet object
        HashSet<String> set = new HashSet();

        try(BufferedReader br = new BufferedReader(new FileReader("listOfEmployees"))) {
            while ((data = br.readLine()) != null) //reads lines from file
            {
                set.add(data);
            }
        }
        catch (IOException e)
        {
            System.out.println("Data loading error");
        }
        //print out how many items the list consists of
        System.out.println("The list consists of " + set.size() + " elements.");

        //...
        Iterator<String> iter = set.iterator();
        while (iter.hasNext())
        {
            String element = iter.next();
            System.out.println(element);
        }
        System.out.println(set.contains("Chupryna    Valentyn\t5"));
    }
}

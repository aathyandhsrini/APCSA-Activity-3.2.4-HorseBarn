/*
 * Activity 3.2.4
 */
import java.util.ArrayList;

public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = barn.getSpaces();
    for (Horse h : barnSpaces)
    {
      System.out.println(h);
      // This code caused a ConcurrentModificationException
      // because it removes a horse while using an enhanced for loop.
      // if (h.getName().equals("Patches"))
      // {
      //     barnSpaces.remove(h);
      // }
    }
      int numSpaces = barnSpaces.size();

      // for (int i = 0; i < barnSpaces.size(); i++)
      // {
      //   Horse h = barnSpaces.get(i);

      //   if (h.getName().equals("Lady"))
      //   {
      //     System.out.println("Bye bye " + barnSpaces.remove(i));
      //   }
        
      //   if (h.getName().equals("Patches"))
      //   {
      //     System.out.println("Bye bye " + barnSpaces.remove(i));
      //   }

      // }

      int i = 0;

      while (i < barnSpaces.size())
      {
        Horse h = barnSpaces.get(i);

        if (h.getName().equals("Patches"))
        {
          System.out.println("Bye bye " + barnSpaces.remove(i));
        }
        else if (h.getName().equals("Lady"))
        {
          System.out.println("Bye bye " + barnSpaces.remove(i));
        }
        else
        {
          i++;
        }
      }

      System.out.println("Horses remaining:");

      for (Horse h : barnSpaces)
      {
        System.out.println(h);
      }
  }
} 

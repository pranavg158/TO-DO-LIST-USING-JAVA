//delete function
package tries ;
import java.io.*; 
  
public class delete 
{ 
    public void delet()
    { 
        File file = new File("C:\\Users\\abc\\Desktop\\java_project\\todolist\\classes\\com\\ncu\\validators\\ToDo.txt"); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
    } 
} 
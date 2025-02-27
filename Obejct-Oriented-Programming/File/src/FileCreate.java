import java.io.File;

public class FileCreate {
    public static void main(String[] args) {
        File file= new File("FileCraetion");
         file.mkdir();
         String location = file.getAbsolutePath();
        //System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println("Location: "+location);
        //Name
        System.out.println(file.getName()+".");
        //delete
      //  System.out.println(file.delete());
        if (file.delete()){
            System.out.println(file.getName()+" Folder has been deleted.");
        }
        String path = file.getAbsolutePath();
        File f=new File("I://3rd Trimester//a.txt");
        f.mkdir();
        File file1=new File(path+"/file.html");
        try{
            file1.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }

    }

}

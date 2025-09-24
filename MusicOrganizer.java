import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    public ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(ValidIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        } else {
            System.out.println("Invalid index :" + index);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(ValidIndex(index)) {
            files.remove(index);
        } else {
            System.out.println("Invalid index :" + index);
        }
    }
    
    public boolean ValidIndex(int index){
        int size = files.size();
        if (files.size() > 0 || files.size() < files.size()-1) {
            return true;
            
        } else {
            return false;
        }
    }
    
    
}

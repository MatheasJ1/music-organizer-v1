This was done with David Shlaifer 2387790 sect.00002.

2. There is no error there is just simply nothing that gets removed from the MusicOrg object. We would've expected an error but it also makes sense that the method gets called without anything happening.

3. When number 0 got removed from the files the other file took its place and is now the file number 0 which explains why it still gives an answer after the file is removed.
4. private ArrayList<Book> library;

5. cs101 = new ArrayList<Student>();
6. private MusicTrack tracks;
7.  cs101 = new ArrayList<Student>(); 
library = new ArrayList<Book>();
tracks = new ArrayList<MusicTrack>();
8.10
9. public ArrayList getNumFive(){
      ArrayList<> items = new ArrayList<>();
      items.add("First object");
      items.add("SecondObject");
      items.add("Third Object");
      items.add("Fourth Object");
      items.add("Fifth Object");

if (myList.size() >= 5) {
  String FifthObject = myList.get(4);
  }
}
10. 14
11. files.add(favoriteTrack);
12.dates.remove(2);
13. it will stay the same since when 0 is removed it adapts to the size and 9 is greater than 6 so its removal doesn't affect index 6. 
14. public int checkIndex(int index){
        int size = files.size();
        if (files.size > 0 || files.size < files.size-1) {
            System.out.println("Your file exists.");
            
        } else {
            System.out.println("the valid range is" + files.size());
        }
    }

16. public void listFile(int index)
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
        if(ValidIndex(index) {
            files.remove(index);
        } else {
            System.out.println("Invalid index :" + index);
        }
    }

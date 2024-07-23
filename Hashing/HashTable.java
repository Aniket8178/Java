public class HashTable{
    private static final int TABLE_SIZE = 10;
    private Integer[] hashtable;

    public HashTable(){
        hashtable = new Integer[TABLE_SIZE];
    }

    private int hashFunction(int key){
        return key % TABLE_SIZE;
    }

    // public void insert(int key){
    //     int haskey = hashFunction(key);
    //     hashtable[haskey] = key;
    // }
    public void insert(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int haskey = hashFunction(arr[i]);
            hashtable[haskey] = arr[i];
        }
    }
    public boolean search(int key){
        int hashkey = hashFunction(key);
        return hashtable[hashkey] != null && hashtable[hashkey] == key;
    }
    public void delete(int key){
        int hashkey = hashFunction(key);
        if(hashtable[hashkey] != null && hashtable[hashkey] == key){
            hashtable[hashkey] = null;
        }
    }
    public void displayHashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (hashtable[i] != null) {
                System.out.println("Index " + i + ": " + hashtable[i]);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }
    public static void main(String[] args){
        int[] inputArray = {15, 11, 27, 8, 12};
        HashTable hash = new HashTable();
        hash.insert(inputArray);
        hash.displayHashTable();
        System.out.println("Search for 27: " + hash.search(27));
        hash.delete(27);
        System.out.println("Hash table after deleting key 27:");
        hash.displayHashTable();

    }

}
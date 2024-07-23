class Node{
    int key;
    int value;
    Node next;
    public Node(int key , int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
public class Collision{
    private static final int SIZE = 10;
    private Node[] HashTable;

    public Collision(){
        HashTable = new Node[SIZE];
    }

    private int getHash(int key){
        int hash = key % SIZE;
        return hash;
    }
    public void insert(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int hash = getHash(arr[i]);
            Node newnode = new Node(arr[i] , 1);
            if(HashTable[hash] == null){
                HashTable[hash] = newnode;
            }
            else{
                Node curr = HashTable[hash];
                while(curr.next != null){
                    curr = curr.next;
                }
                curr.next = newnode;
            }
        }
    }
    public boolean Search(int key){
        int hash = getHash(key);
        Node curr = HashTable[hash];

        while(curr != null){
            if(curr.key == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public void delete(int key){
        int hash = getHash(key);
        Node curr = HashTable[hash];
        Node prev = null;

        while(curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        if(curr != null){
            if(prev == null){
                HashTable[hash] = curr.next;
            }
            else{
                prev.next = curr.next;
            }
            System.out.println("Key " + key + " deleted from the hash table.");
        }
        else{
            System.out.println("Key " + key + " not found in the hash table.");
        }
    }
    public void displayHashTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + ": ");
            Node current = HashTable[i];
            while (current != null) {
                System.out.print("(" + current.key + ", " + current.value + ") -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 15, 25, 35, 45}; // Sample input array
        Collision ht = new Collision();
            // Insert array elements into the hash table
        ht.insert(arr);

        // Display the hash table
        System.out.println("Hash Table:");
        ht.displayHashTable();

        // Search for keys
        int keyToSearch = 20;
        System.out.println("Is key " + keyToSearch + " present? " + ht.Search(keyToSearch));

        // Delete a key
        int keyToDelete = 25;
        ht.delete(keyToDelete);
        System.out.println("Is key " + keyToDelete + " present after deletion? " + ht.Search(keyToDelete));


         System.out.println("Hash Table:");
        ht.displayHashTable();
    }
}
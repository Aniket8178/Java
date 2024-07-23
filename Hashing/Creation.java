// Node class to store key-value pairs in linked list
class Node {
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// Creation class using separate chaining
public class Creation {
    int max = 11;
    Node[] hashTable = new Node[max + 1];

    // Insert method with separate chaining
    public void insert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int hash = getHash(key);

            if (hashTable[hash] == null) {
                hashTable[hash] = new Node(key, 1);
            } else {
                Node newNode = new Node(key, 1);
                newNode.next = hashTable[hash];
                hashTable[hash] = newNode;
            }
        }
    }

    // Display method to print the hash table with separate chaining
    public void displayHashTable() {
        System.out.println("Hash Table with Separate Chaining:");
        System.out.println("Index\tEntries");
        for (int i = 0; i <= max; i++) {
            System.out.print(i + "\t");
            Node current = hashTable[i];
            while (current != null) {
                System.out.print("(" + current.key + ", " + current.value + ") ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Search method using separate chaining
    public boolean search(int num) {
        int hash = getHash(num);
        Node current = hashTable[hash];
        while (current != null) {
            if (current.key == num) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Delete method using separate chaining
    public void delete(int num) {
        int hash = getHash(num);
        Node current = hashTable[hash];
        Node prev = null;

        while (current != null && current.key != num) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            if (prev == null) {
                // If the node to be deleted is the head of the list
                hashTable[hash] = current.next;
            } else {
                prev.next = current.next;
            }
            System.out.println("Number " + num + " deleted from the hash table.");
        } else {
            System.out.println("Number " + num + " not found in the hash table.");
        }
    }

    // Helper method to calculate hash
    private int getHash(int key) {
        return key % (max + 1);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 1};
        Creation creation = new Creation();
        creation.insert(arr);

        // Display the hash table with separate chaining
        creation.displayHashTable();

        int numberToCheck = 3;
        boolean isPresent = creation.search(numberToCheck);
        System.out.println("Is the number " + numberToCheck + " present in the array? " + isPresent);

        // Delete a number from the hash table
        creation.delete(numberToCheck);
        creation.displayHashTable();
    }
}

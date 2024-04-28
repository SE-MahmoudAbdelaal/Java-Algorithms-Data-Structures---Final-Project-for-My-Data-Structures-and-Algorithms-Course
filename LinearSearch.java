package my.project;

public class LinearSearch {
    private final double[] array;
    private int numElements = 0;
    
    public LinearSearch(int capacity) {
        array = new double[capacity];
    }

    public void insert(double newValue) {
        if (numElements < array.length) {
            array[numElements] = newValue;
            numElements++;
        } else {
            System.out.println("Array is full. Cannot insert more elements.");
        }
    }

    public void linearSearchFunction(double searchKey) {
        boolean found = false;
        for (int i = 0; i < numElements; i++) {
            if (array[i] == searchKey) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchKey + " found.");
        } else {
            System.out.println(searchKey + " not found.");
        }
    }

    public void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < numElements; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch(100);
        linearSearch.insert(77);
        linearSearch.insert(99);
        linearSearch.insert(44);
        linearSearch.insert(55);
        linearSearch.insert(22);
        linearSearch.insert(88);
        linearSearch.insert(11);
        linearSearch.insert(0); 
        linearSearch.insert(66);
        linearSearch.insert(33);
        
        linearSearch.display();
        System.out.println("////////////////////");
        linearSearch.linearSearchFunction(22);
        linearSearch.linearSearchFunction(52);
    }
}

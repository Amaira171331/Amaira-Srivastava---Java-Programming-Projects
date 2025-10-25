import java.util.ArrayList;
public class ArrayListForJavaLanguage {
    ArrayList<Integer> data = new ArrayList<>();
    public int size = 0;

    // 1. append()
    public void append(int value) {
        data.add(value);
        size = size + 1;
    }

    // 2. clear()
    public void clear() {
        data.clear();
        size = 0;
    }

    // 3. copy()
    public ArrayListForJavaLanguage copy() {
        ArrayListForJavaLanguage newList = new ArrayListForJavaLanguage();
        for (int i = 0; i < size; i++) {
            newList.append(data.get(i));
        }
        return newList;
    }

    // 4. count()
    public int count(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (data.get(i) == value) {
                count = count + 1;
            }
        }
        return count;
    }

    // 5. extend()
    public void extend(ArrayListForJavaLanguage addedList) {
        for (int i = 0; i < addedList.size; i++) {
            this.append(addedList.data.get(i));
        }
    }

    // 6. index()
    public int index(int value) {
        for (int i = 0; i < size; i++) {
            if (data.get(i) == value) {
                return i;
            }
        }
        return -1; // not found
    }

    // 7. insert()
    public void insert(int index, int value) {
        if (index < 0 || index > size) return;
        data.add(index, value);
        size = size + 1;
    }

    // 8. pop()
    public int pop() {
        if (size == 0) return -1;
        size = size - 1;
        return data.remove(size);
    }

    public int pop(int index) {
        if (index < 0 || index >= size) return -1;
        int value = data.remove(index);
        size = size - 1;
        return value;
    }

    // 9. remove()
    public void remove(int value) {
        int index = index(value);
        if (index != -1) {
            pop(index);
        }
    }

    // 10. reverse()
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = data.get(i);
            data.set(i, data.get(size - 1 - i));
            data.set(size - 1 - i, temp);
        }
    }

    // 11. sort()
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data.get(j) > data.get(j + 1)) {
                    int temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
    }

    // Built-in methods

    public static int min(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    public static int len(ArrayList<Integer> arr) {
        return arr.size();
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data.get(i));
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayListForJavaLanguage myList = new ArrayListForJavaLanguage();
        myList.append(10);
        myList.append(20);
        myList.append(10);
        myList.append(40);
        myList.printList();

        System.out.println("Copy:");
        myList.copy().printList();

        System.out.println("Count 10: " + myList.count(10));

        ArrayListForJavaLanguage newItems = new ArrayListForJavaLanguage();
        newItems.append(5);
        newItems.append(6);
        myList.extend(newItems);
        myList.printList();

        System.out.println("Index of 40: " + myList.index(40));
        myList.insert(2, 99);
        myList.printList();

        System.out.println("Pop last: " + myList.pop());
        myList.printList();

        System.out.println("Pop index 1: " + myList.pop(1));
        myList.printList();

        myList.remove(10);
        myList.printList();

        myList.reverse();
        System.out.println("Reversed: ");
        myList.printList();

        myList.sort();
        System.out.println("Sorted: ");
        myList.printList();

        myList.clear();
        System.out.println("Cleared: ");
        myList.printList();

        // Test built in static methods
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(6);
        System.out.println("min: " + min(arr));
        System.out.println("max: " + max(arr));
        System.out.println("sum: " + sum(arr));
        System.out.println("len: " + len(arr));
    }
}


public class PythonListsForJavaLanguage {
	public int[] data = new int[10];;
    public int size = 0;

    // fix the length of the array to match the size
    private void fixLength() {
        if (size >= data.length) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    // 1. append()
    public void append(int value) {
        fixLength();
        size = size + 1;
        data[size] = value;
    }

    // 2. clear()
    public void clear() {
        size = 0;
    }

    // 3. copy()
    public PythonListsForJavaLanguage copy() {
        PythonListsForJavaLanguage newList = new PythonListsForJavaLanguage();
        for (int i = 0; i < size; i++) {
            newList.append(data[i]);
        }
        return newList;
    }

    // 4. count()
    public int count(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
            	count = count + 1;
            }
        }
        return count;
    }

    // 5. extend()
    public void extend(PythonListsForJavaLanguage addedList) {
        for (int i = 0; i < addedList.size; i++) {
            this.append(addedList.data[i]);
        }
    }

    // 6. index()
    public int index(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
            	return i;
            }
        }
        return -1; //not found
    }

    // 7. insert()
    public void insert(int index, int value) {
        if (index < 0 || index > size) return;
        fixLength();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size = size +1;
    }

    // 8. pop()
    public int pop() {
        if (size == 0) return -1;
        size = size-1;
        return data[size];
    }

    public int pop(int index) {
        if (index < 0 || index >= size) return -1;
        int value = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
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
            int temp = data[i];
            data[i] = data[size - 1 - i];
            data[size - 1 - i] = temp;
        }
    }

    // 11. sort()
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Built in methods

    public static int min(int[] arr) {
    	int min = 0;
		for (int i=0 ; i<arr.length ; i++)
		{
			if (arr[i] > min)
			{
				min = arr[i];
			}
		}
        return min;
    }

    public static int max(int[] arr) {
    	int max = 0;
		for (int i=0 ; i<arr.length ; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
        return max;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    public static int len(int[] arr) {
        return arr.length;
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        PythonListsForJavaLanguage myList = new PythonListsForJavaLanguage();
        myList.append(10);
        myList.append(20);
        myList.append(10);
        myList.append(40);
        myList.printList();

        System.out.println("Copy:");
        myList.copy().printList();

        System.out.println("Count 10: " + myList.count(10));

        PythonListsForJavaLanguage newItems = new PythonListsForJavaLanguage();
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
        int[] arr = {5, 3, 8, 1, 6};
        System.out.println("min: " + min(arr));
        System.out.println("max: " + max(arr));
        System.out.println("sum: " + sum(arr));
        System.out.println("len: " + len(arr));
    }
}

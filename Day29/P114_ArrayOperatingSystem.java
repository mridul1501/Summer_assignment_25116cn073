
import java.util.Scanner;


class ArrayData {
    int value;
}


public class P114_ArrayOperatingSystem {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayData[] arr = new ArrayData[100];

        int count = 0, choice;

        do {
            System.out.println("\n-----Array Operations System-----");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Rotate Array Left");
            System.out.println("6. Rotate Array Right");
            System.out.println("7. Move Zeroes To End");
            System.out.println("8. Find Maximum & Second Maximum");
            System.out.println("9. Find Minimum & Second Minimum");
            System.out.println("10. Maximum Frequency Element");
            System.out.println("11. Pair With Given Sum");
            System.out.println("12. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    arr[count] = new ArrayData();

                    System.out.print("Enter Element: ");
                    arr[count].value = sc.nextInt();

                    count++;
                    System.out.println("Element Inserted Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Array Empty");
                    } else {
                        System.out.print("Array Elements: ");

                        for (int i = 0; i < count; i++) {
                            System.out.print(arr[i].value + " ");
                        }

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter Element to Search: ");
                    int key = sc.nextInt();

                    int pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (arr[i].value == key) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1)
                        System.out.println("Element Not Found");
                    else
                        System.out.println("Element Found at Position "
                                + (pos + 1));

                    break;

                case 4:
                    System.out.print("Enter Element to Search: ");
                    key = sc.nextInt();

                    int low = 0;
                    int high = count - 1;

                    pos = -1;

                    while (low <= high) {

                        int mid = (low + high) / 2;

                        if (arr[mid].value == key) {
                            pos = mid;
                            break;
                        } else if (arr[mid].value < key)
                            low = mid + 1;
                        else
                            high = mid - 1;
                    }

                    if (pos == -1)
                        System.out.println("Element Not Found");
                    else
                        System.out.println("Element Found at Position "
                                + (pos + 1));

                    break;

                case 5:
                    if (count > 0) {

                        int first = arr[0].value;

                        for (int i = 0; i < count - 1; i++) {
                            arr[i].value = arr[i + 1].value;
                        }

                        arr[count - 1].value = first;

                        System.out.println("Left Rotation Done");
                    }
                    break;

                case 6:
                    if (count > 0) {

                        int last = arr[count - 1].value;

                        for (int i = count - 1; i > 0; i--) {
                            arr[i].value = arr[i - 1].value;
                        }

                        arr[0].value = last;

                        System.out.println("Right Rotation Done");
                    }
                    break;

                case 7:
                    int index = 0;

                    for (int i = 0; i < count; i++) {

                        if (arr[i].value != 0) {

                            int temp = arr[index].value;
                            arr[index].value = arr[i].value;
                            arr[i].value = temp;

                            index++;
                        }
                    }

                    System.out.println("Zeroes Moved To End");
                    break;

                case 8:
                    int max = Integer.MIN_VALUE;
                    int secondMax = Integer.MIN_VALUE;

                    for (int i = 0; i < count; i++) {

                        if (arr[i].value > max) {
                            secondMax = max;
                            max = arr[i].value;
                        } else if (arr[i].value > secondMax &&
                                arr[i].value != max) {

                            secondMax = arr[i].value;
                        }
                    }

                    System.out.println("Maximum = " + max);
                    System.out.println("Second Maximum = "
                            + secondMax);

                    break;

                case 9:
                    int min = Integer.MAX_VALUE;
                    int secondMin = Integer.MAX_VALUE;

                    for (int i = 0; i < count; i++) {

                        if (arr[i].value < min) {
                            secondMin = min;
                            min = arr[i].value;
                        } else if (arr[i].value < secondMin &&
                                arr[i].value != min) {

                            secondMin = arr[i].value;
                        }
                    }

                    System.out.println("Minimum = " + min);
                    System.out.println("Second Minimum = "
                            + secondMin);

                    break;

                case 10:
                    int maxFreq = 0;
                    int element = 0;

                    for (int i = 0; i < count; i++) {

                        int freq = 0;

                        for (int j = 0; j < count; j++) {

                            if (arr[i].value == arr[j].value)
                                freq++;
                        }

                        if (freq > maxFreq) {
                            maxFreq = freq;
                            element = arr[i].value;
                        }
                    }

                    System.out.println("Element = " + element);
                    System.out.println("Frequency = " + maxFreq);

                    break;

                case 11:
                    System.out.print("Enter Target Sum: ");
                    int sum = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        for (int j = i + 1; j < count; j++) {

                            if (arr[i].value +
                                    arr[j].value == sum) {

                                System.out.println(
                                        arr[i].value + " + " +
                                                arr[j].value + " = " +
                                                sum);

                                found = true;
                            }
                        }
                    }

                    if (!found)
                        System.out.println("No Pair Found");

                    break;

                case 12:
                    System.out.println("Thank You! Hope you are satisfied .");
                    break;

                default:
                    System.out.println("Error : Invalid Choice");
            }

        } while (choice != 12);

        sc.close();
    }

}
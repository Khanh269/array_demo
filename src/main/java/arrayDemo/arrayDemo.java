package arrayDemo;

import java.util.Arrays;


public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Samsung", "Apple", "Xiaomi", "Nokia" };
		arr[0] = "Huawei";
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		String temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		String[] arr1 = new String[3];
		arr1[0] = arr[1];
		arr1[1] = arr[2];
		arr1[2] = arr[3];
		for (String s : arr1) {
			System.out.print(s + " ");
		}
		System.out.println();

		int[][] arr2 = { { 5, 3, 8, 7 }, { 9, 3, 6, 6 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] arr3 = new int[2][4];
		arr3[0][0] = 5;
		arr3[0][1] = 3;
		arr3[0][2] = 8;
		arr3[0][3] = 7;
		arr3[1][0] = 9;
		arr3[1][1] = 3;
		arr3[1][2] = 6;
		arr3[1][3] = 6;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepEquals(arr3, arr2));
		System.out.println(arr2 == arr3);
		
		String[] namesArray = new String[5];
		 
        long startTime = System.currentTimeMillis();
 
        for (int i = 0; i < namesArray.length; i++)
        {
            namesArray[i] = "Name"+i;
            System.out.println(namesArray[i]);
        }
        class Node {

        	int data;
        	Node next;

        	Node(int data) {
        		this.data = data;
        		this.next = null;

        	}
        	
        	Node insertInEnd(int data, Node head) {
        		Node temp = new Node(data);
        		Node temp1 = head;

        		if (temp1 == null)
        			head = temp;
        		else {
        			while (temp1.next != null)
        				temp1 = temp1.next;
        			temp1.next = temp;

        		}

        		return head;

        	}
        }
        Node newNode = new Node(7);
		while (newNode != null) {
			System.out.print(newNode.data + " ");
			newNode = newNode.next;
		}

	}

}

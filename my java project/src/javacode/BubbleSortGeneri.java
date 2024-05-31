package javacode;

import java.util.Arrays;
class BubbleSortGeneric<T extends Comparable<? super T>> {
 T[] array;
 BubbleSortGeneric(T[] array){
 this.array = array;
 }
 
 private T[] bubbleSort(){

 for(int i = 0; i <array.length; i++){
 for(int j = i+1 ; j < array.length; j++){
 //if greater swap elements
 if(array[i].compareTo(array[j]) > 0){
 swapElements(j, array , i);
 }
 } 
 }
 return array;
 }
 private void swapElements(int j, T[] arr ,  int i) {
 T temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp; 
 }
 public static void main(String[] args) {
 Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
 BubbleSortGeneric<Integer> bsg1 = new BubbleSortGeneric<Integer>(intArr);
 Integer[] sa1 = bsg1.bubbleSort();
 System.out.println("Sorted array- " + Arrays.toString(sa1));
 
 String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
 BubbleSortGeneric<String> bsg2 = new BubbleSortGeneric<>(strArr);
 String[] sa2 = bsg2.bubbleSort();
 System.out.println("Sorted array- " + Arrays.toString(sa2));
 }
}

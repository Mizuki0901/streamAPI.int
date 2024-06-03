package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(numberList.stream()
        .filter(n -> n % 2 == 1)
        .collect(Collectors.averagingInt(n -> n)));
  }
}
package com.impte.algorithms.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class In {
    private int[] numbers;
    private int index = 0;

    public In(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null){
            sb.append(line);
            sb.append(" ");
            line = br.readLine();
        }
        String text = sb.toString();
        String[] strNums = text.split(" ");
        numbers = new int[strNums.length];
        for (int i=0; i<strNums.length; i++){
            numbers[i] = Integer.valueOf(strNums[i]);
        }
    }

    public Integer readInt(){
        if (index < numbers.length){
            Integer num = numbers[index];
            index++;
            return num;
        }else {
            return null;
        }
    }
}

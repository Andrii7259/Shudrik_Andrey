package com.company;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        while (true){
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()){
                break;
            }
            else {
                text.append(sentence);
                text.append("\n");
            }
        }
        String [] textSplitSentences;
        textSplitSentences = text.toString().split("\n");
        System.out.println(Arrays.toString(textSplitSentences));
        ArrayList<String> textSplitWords = new ArrayList<>();
        for (String s : textSplitSentences) {
            String[] sentence;
            sentence = s.split(" ");
            String temp;
            temp = sentence[0];
            String lastWord = sentence[sentence.length-1];
            sentence[0] = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);
            sentence[sentence.length-1] = temp.substring(0, 1).toLowerCase() + temp.substring(1);
            String c = lastWord.substring(lastWord.length() - 1);
            String strSentence = "";
            int count = 0;
            for (String value : sentence) {
                int len = value.length();
                count += 1;
                if (count==1) {
                    strSentence = strSentence.concat(value.substring(0, len-1) + " ");
                } else if (1 <count && count <= sentence.length-1) {
                    strSentence = strSentence.concat(value + " ");
                }
                else {
                    strSentence = strSentence.concat(value + c);
                }
            }
            textSplitWords.add(strSentence);
        }
        System.out.println(textSplitWords);
        StringBuffer editedText = new StringBuffer();
        for (String textSplitWord : textSplitWords) {
            textSplitWord += "\n";
            editedText.append(textSplitWord);
        }
        System.out.println(editedText);
    }
}


package FirstQuarter.Java2.Lesson3;

import java.util.*;

public class HWJava2Lesson3 {
    public static void main(String[] args) {
        Map<Integer, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put(89111649, "Petrov");
        phoneDirectory.put(89111650, "Ivanov");
        phoneDirectory.put(89111651, "Sidorov");
        phoneDirectory.put(89111652, "Toptalov");
        phoneDirectory.put(89111653, "Petrov");
        phoneDirectory.put(89111654, "Adamov");

        searchNumber(phoneDirectory, "Petrov");
        System.out.println();
        countWordsInArray();

    }

    public static void countWordsInArray() {
        List<String> wordList = new ArrayList<>();
        wordList.add("one");
        wordList.add("two");
        wordList.add("three");
        wordList.add("four");
        wordList.add("five");
        wordList.add("six");
        wordList.add("seven");
        wordList.add("eight");
        wordList.add("nine");
        wordList.add("ten");
        wordList.add("six");
        wordList.add("two");
        wordList.add("two");

        Set<String> wordHashSet = new HashSet<>();
        for (String setWord : wordList) {
            wordHashSet.add(setWord);
        }

        Iterator<String> iterWordHashSet = wordHashSet.iterator();

        while (iterWordHashSet.hasNext()) {
            String word = iterWordHashSet.next();
            int count = 0;
            for (int i = 0; i < wordList.size(); i++) {
                String wordListCompare = wordList.get(i);
                if (wordListCompare == word) {
                    count++;
                }
            }
            System.out.println(word + " повторяется " + count + " раз");
        }
    }

    public static void searchNumber(Map<Integer, String> hm, String surName) {
        for (Map.Entry<Integer, String> keyValue : hm.entrySet()) {
            String value = keyValue.getValue();
            if (value == surName) {
                System.out.println(surName + " номер телефона " + keyValue.getKey());
            }
        }
    }
    //к сожалению не смог сделать так чтоб поиск по фамилии был константным по времени
    //только через цикл получилось
}

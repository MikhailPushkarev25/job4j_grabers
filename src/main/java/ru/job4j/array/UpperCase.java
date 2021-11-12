package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] ch = new char[string.length];
        int size = 0;
        for (char chars : string) {
            if (Character.isLetter(chars)) {
                ch[size++] = Character.toUpperCase(chars);
            } else {
                ch[size++] = chars;
            }
        }
        return ch;
        }
    }

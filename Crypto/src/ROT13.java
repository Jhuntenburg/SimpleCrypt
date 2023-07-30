import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {
//    public static void main(String[] args) {
//
//    }

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public static String crypt(String text) throws UnsupportedOperationException {
        StringBuilder cryptedString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                cryptedString.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                if (c > 'm') c -= 13;
                else c += 13;
                cryptedString.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                if (c > 'M') c -= 13;
                else c += 13;
                cryptedString.append(c);
            } else {
                cryptedString.append(c);
            }
        }

        return cryptedString.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {

        return "";
    }

    public static String readFile() throws IOException {
//        String txt = Files.readString(Path.of("/Users/joe/Desktop/local projects/SimpleCrypt/sonnet18.txt"));
//        PrintWriter out = new PrintWriter("sonnet18.enc");
//
//        out.println(crypt(txt));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("/Users/joe/Desktop/local projects/SimpleCrypt/sonnet18.txt"));
        String string;
        while ((string = reader.readLine()) != null) {
            stringBuilder.append(string).append("\n");
        }
        reader.close();

        return stringBuilder.toString();


    }
    public static void writeEncryptionFile() throws IOException {
        String string = crypt(readFile());
        FileWriter wr = new FileWriter("/Users/joe/Desktop/local projects/SimpleCrypt/sonnet18.enc");
        wr.write(string);
        wr.flush();
        wr.close();

    }

    public static void main(String[] args) throws IOException {
        writeEncryptionFile();

//        String string = null;
//        try {
//            string = readFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(string);
//
    }



}

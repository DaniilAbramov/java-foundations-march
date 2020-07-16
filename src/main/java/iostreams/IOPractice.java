package iostreams;


import interfaces.lecture.Man;
import iostreams.HW.User;

import java.io.*;

public class IOPractice {

    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//
//        try {
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in))) {
//
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//
//        File file = new File("src/main/resources/file.txt");
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Privet");
//            printWriter.println("Privet2");
//            printWriter.println("Privet3");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
////            System.out.println(fileReader.readLine());
//
//            while (fileReader.ready()){
//                System.out.println(fileReader.readLine());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File inputFile = new File("src/main/resources/fileNotebook.out");
            File file2 = new File("src/main/resources/file2.out");
//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//        String end = "Конец";
//        try {
//            String input;
//            while (!(input = reader1.readLine()).equalsIgnoreCase(end)) {
//                System.out.println("Input: " + input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Man man = new Man();
        man.setName("Vitya");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/man.out"))) {
            objectOutputStream.writeObject(man);
            objectOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/man.out"))) {
            Man manFromFile = (Man) objectInputStream.readObject();
            System.out.println(manFromFile.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

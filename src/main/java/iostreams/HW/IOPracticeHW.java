package iostreams.HW;

import interfaces.lecture.Man;

import java.io.*;
import java.util.ArrayList;

public class IOPracticeHW {
    public static void main(String[] args) {

        User user = new User("User", 123456789);
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/user.out"))) {
//            objectOutputStream.writeObject(user);
//            objectOutputStream.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/user.out"))) {
//            User userFromFile = (User) objectInputStream.readObject();
//            System.out.println(userFromFile.getLogin() + " " + userFromFile.getPassword());
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        String str1 = "Привет,привет,привет!!!!";
//        String str2 = "Пока, пока, пока!!!!";
//
//        File fileWithStr1 = new File("src/main/resources/fileWithStr1.txt");
//        try (PrintWriter printWriter = new PrintWriter(fileWithStr1)) {
//            printWriter.println("Привет,привет,привет!!!!");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        File fileWithStr2 = new File("src/main/resources/fileWithStr2.txt");
//        try (PrintWriter printWriter = new PrintWriter(fileWithStr2)) {
//            printWriter.println("Пока, пока, пока!!!!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        chekStr(fileWithStr1);
//        chekStr(fileWithStr2);
//
//        try (PrintWriter printWriter = new PrintWriter(fileWithStr1)) {
//            printWriter.println("Пока, пока, пока!!!!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try (PrintWriter printWriter = new PrintWriter(fileWithStr2)) {
//            printWriter.println("Привет,привет,привет!!!!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        chekStr(fileWithStr1);
//        chekStr(fileWithStr2);

//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/fileWithStr1.txt"))){
//            objectOutputStream.writeObject(str1);
//            objectOutputStream.flush();
//        }catch (IOException e) {
//            e.printStackTrace();
//
//            try(ObjectInputStream objectInputStream = new ObjectInputStream(
//                    new FileInputStream("src/main/resources/fileWithStr1.txt"))) {
//                String str1FromFile = (String) objectInputStream.readObject();
//                System.out.println(str1FromFile.toString());
//            }  catch (IOException | ClassNotFoundException ex) {
//                ex.printStackTrace();
//            }
//
//        }try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/fileWithStr2.out"))){
//            objectOutputStream.writeObject(str2);
//            objectOutputStream.flush();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        String end = "Выход";
        int count = 0;
        ArrayList<String> list = new ArrayList<String>(10);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите путь файла и его имя(пример - src/main/resources/fileNotebook.txt) : ");
            String input = reader.readLine();
            System.out.println("Ваша запись - " + input);
//            try (ObjectInputStream objectInputStream = new ObjectInputStream(
//                    new FileInputStream(input))) {
////                while (objectInputStream.ready()) {
//                    System.out.println(objectInputStream.readObject());
////                }
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
            try (BufferedReader fileReader = new BufferedReader(new FileReader(input))) {
                System.out.println(fileReader.readLine());
                while (fileReader.ready()) {
                    System.out.println(fileReader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            String input2 = reader.readLine();
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(input2))) {
                System.out.println("Введите ваш текст(для выхода напишите выход) - ");
                while ((!(input2 = reader.readLine()).equalsIgnoreCase(end)) || count == 10) {
                    count++;
                    list.add(input2);
                    System.out.println("Ваша запись - " + input2);
                    objectOutputStream.writeObject(input2);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : list) {
            System.out.print(s + " ");
        }

    }

    private static void chekStr(File fileWithStr1) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileWithStr1))) {
            System.out.println(fileReader.readLine());
            while (fileReader.ready()) {
                System.out.println(fileReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

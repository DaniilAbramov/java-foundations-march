package iostreams.HW;

import java.io.*;

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

        String str1 = "Привет,привет,привет!!!!";
        String str2 = "Пока, пока, пока!!!!";

        File fileWithStr1 = new File("src/main/resources/fileWithStr1.txt");
        try (PrintWriter printWriter = new PrintWriter(fileWithStr1)){
            printWriter.println("Привет,привет,привет!!!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File fileWithStr2 = new File("src/main/resources/fileWithStr2.txt");
        try (PrintWriter printWriter = new PrintWriter(fileWithStr2)){
            printWriter.println("Пока, пока, пока!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileWithStr1))) {
            System.out.println(fileReader.readLine());
        }  catch (IOException e) {
            e.printStackTrace();
        }

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



    }
}

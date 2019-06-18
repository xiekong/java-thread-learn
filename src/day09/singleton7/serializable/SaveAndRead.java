package day09.singleton7.serializable;

import java.io.*;

/**
 * @author XieKong
 * @date 2019/6/18 11:48
 */
public class SaveAndRead {
    public static void main(String[] args) {
        MyObject myObject = MyObject.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream(new File("myobject.text"));
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(myObject);

            fos.close();
            os.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("myobject.text"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyObject object = (MyObject)ois.readObject();

            fis.close();
            ois.close();
            System.out.println(object.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

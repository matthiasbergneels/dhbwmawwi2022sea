package lecture.chapter11;

import java.io.File;
import java.util.Properties;
import java.util.Set;

public class FileSystemAccess {

    public static void main(String[] args) {
        System.out.println("Liste von Laufwerken");
        System.out.println("====================");

        File[] rootList = File.listRoots();

        for(File root : rootList){
            System.out.println("Pfad: " + root.getPath());
            System.out.println("- existiert: " + root.exists());
            System.out.println("- Lesezugriff: " + root.canRead());
            System.out.println("- Schreibzugriff: " + root.canWrite());
            System.out.println("- Datei: " + root.isFile());
            System.out.println("- Verzeichnis: " + root.isDirectory());
            File[] content = root.listFiles();
        }

        System.out.println("Java System Properties");
        System.out.println("======================");

        Properties systemProperties = System.getProperties();

        Set systemPropertiesKeys = systemProperties.keySet();
        for(Object key : systemPropertiesKeys){
            System.out.println(key + " : " + systemProperties.get(key));
        }

        System.out.println("Inhalt user.dir");
        System.out.println("===============");

        File userDir = new File(System.getProperty("user.dir"));

        System.out.println("Name: " + userDir.getName());
        System.out.println("- Pfad: " + userDir.getPath());
        System.out.println("- Existiert: " + userDir.exists());
        System.out.println("- Schreibzugriff: " + userDir.canWrite());
        System.out.println("- Lesezugriff: " + userDir.canRead());
        System.out.println("- Verzeichnis: " + userDir.isDirectory());

        File[] userDirContent = userDir.listFiles();
        for(File currentFile : userDirContent){
            System.out.println(currentFile);
        }

    }
}

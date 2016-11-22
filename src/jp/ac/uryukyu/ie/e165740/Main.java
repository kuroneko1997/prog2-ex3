package jp.ac.uryukyu.ie.e165740;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {

    public static void main(String[] args){
        String filename = "./src/jp/ac/uryukyu/ie/e165740/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("リストをそのまま出力");
        System.out.println(strings);

        System.out.println("\\n\\n要素毎に出力してみる");
        for(String str: strings){
            System.out.println(str);
        }

        // 行番号付けてみる
        System.out.println("\n\n行番号付けてみる");
        for(int i=0; i<strings.size(); i++){
            System.out.printf("%d行目: %s\n", i, strings.get(i));
        }
    }

}

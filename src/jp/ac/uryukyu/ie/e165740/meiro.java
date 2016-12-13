package jp.ac.uryukyu.ie.e165740;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class meiro {
    public static void main(String[] args){
        int x,y;
        [x,y];
        int start,size,goal;
        private start[];
        private size[];
        private goal[];

        String filename = "./src/jp/ac/uryukyu/ie/e165740/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1); //終了ステータス。ここでは取り敢えず0(=正常)以外にした。
        }
        // リストをそのまま出力してみる
        System.out.println("リストをそのまま出力してみる");
        System.out.println(strings);

        // 要素毎に出力してみる
        System.out.println("\n\n要素毎に出力してみる");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

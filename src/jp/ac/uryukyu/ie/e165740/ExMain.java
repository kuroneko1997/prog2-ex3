package jp.ac.uryukyu.ie.e165740;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス
import java.util.StringJoiner;

/**
 * Scannerクラスを用いたファイル読み込みの例。
 * ・1行ずつ読み込み、String型のリストとして保存する。
 * ・ファイルオープン時に例外が発生する可能性があるため、例外に対応するコード例も含む。
 */
public class ExMain {
    public static void main(String[] args) {
        /* ファイルのパスは、プロジェクトのトップディレクトリを基準とした相対パスで記述。
            .javaファイルを置いてるディレクトリ基準ではないことに注意。 */
        String filename = "./src/jp/ac/uryukyu/ie/e165740/map.txt";
        List<String> strings = new ArrayList<>(); // ファイルから読み込んだ文字列を保存するためのリスト。
        Scanner scanner;
        /* 想定している例外が起きる箇所では、予め例外に対応した処理を記述する。
            try{ 例外が起きる箇所 }
            catch(想定してる例外){例外処理}
            finally{例外の有無にかかわらず、最終的に実行させたい処理}
         */
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

    public static void move(String[] args) {
        //今から動きます//
        while (1) {
            if () {
                break;//もしゴールしたらブレイク
            } else {
                System.out.println("数字を入力したら動く\n");
                System.out.println("1,上： 2,右ぃ: 3,下ぁ: 4,ひだ〜り\n");
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                if (a == 1) {
                    if(上が#以外なら動く)
                    Player.upmove;
                } else if (a == 2) {
                    if(右が#以外なら動く)
                    Player.rightmove;
                } else if (a == 3) {
                    if(下が#以外なら動く)
                    Player.downmove;
                } else if (a == 4) {
                    if(左が#以外ならうごk)
                    Player.leftmove;
                } else {
                    System.out.println("1~4以外は入れんな");
                }
            }
        }
    }

    public static void check(String[] args){
        List<String> strings=
    }
}
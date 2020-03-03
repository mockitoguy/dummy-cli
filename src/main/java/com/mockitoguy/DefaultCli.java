package com.mockitoguy;

import java.util.Scanner;

public class DefaultCli implements Cli {
    @Override
    public void println(String text) {
        System.out.println(text);
    }

    @Override
    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

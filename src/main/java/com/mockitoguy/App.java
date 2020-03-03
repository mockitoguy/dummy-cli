package com.mockitoguy;

class App {

    static final String HELLO = """
1 - View all albums
2 - Search for album
3 - Exit program""";

    static final String ALBUMS = "Albums!\n";
    static final String SEARCH = "Searching not implemented!\n";
    static final String BYE = "Bye!\n";
    static final String INCORRECT_CHOICE = "Incorrect choice!\n";

    public String start(Cli cli) {
        while (true) {
            cli.println(HELLO);
            String line = cli.readLine();

            switch (line) {
                case "1" -> cli.println(ALBUMS);
                case "2" -> cli.println(SEARCH);
                case "3" -> { cli.println(BYE); return null; }
                default -> cli.println(INCORRECT_CHOICE);
            }
        }
    }
}

package br.univille.log;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger loggerConsole = LoggerFactory.onConsole();
        loggerConsole.log(Level.DEBUG, "Debug");
        loggerConsole.log(Level.WARNING, "Aviso");
        loggerConsole.log(Level.ERROR, "Erro");

        Logger loggerFile = LoggerFactory.onFile("log.txt");
        loggerFile.log(Level.DEBUG, "Debug");
        loggerFile.log(Level.WARNING, "Aviso");
        loggerFile.log(Level.ERROR, "Erro");
        
    }
}

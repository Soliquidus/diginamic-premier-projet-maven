package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String asciiArt = FigletFont.convertOneLine( "Hello World!" );
        System.out.println(asciiArt);
    }
}

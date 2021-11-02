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
        String asciiArt = FigletFont.convertOneLine( "App" );
        System.out.println(asciiArt);
    }
}

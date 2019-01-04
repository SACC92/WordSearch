/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class WordFind {
    public String[] findWords(String[] grid, String[] wordList){
        int colN = grid[0].length();
        char[][] newGrid = new char[grid.length][colN];
        for (int i=0; i<grid.length; i++){
            char[] lineChars = grid[i].toCharArray();
            for (int j=0; j<colN; j++){
                newGrid[i][j]=lineChars[j];
            }
        }
        int size = wordList.length;
        String[] found = new String[size];
        for(String word: wordList){
            int coincidences = 0;
            char[] wordChars = word.toCharArray();
            for (char c: wordChars){
                for (int i=0; i<grid.length; i++){
                    for (int j=0; j<colN; j++){
                        if(c==newGrid[i][j]){
                            coincidences += 1;
                        }
                    }
                }
            }
        }
        return found;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String w = "bghbgh";
        System.out.println(w.length());
    }
}

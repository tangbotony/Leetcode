package com.tangbo.exercise.validsudoku;
/*
 * 36. Valid Sudoku My Submissions Question
	Total Accepted: 66433 Total Submissions: 222218 Difficulty: Easy
	Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
	
	The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
	
	
	A partially filled sudoku which is valid.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rl = new ArrayList<Set<Character>>();  
        List<Set<Character>> cl = new ArrayList<Set<Character>>();  
        List<Set<Character>> sl = new ArrayList<Set<Character>>();  
          
        for(int i=0; i<9; i++) {  
            rl.add(new HashSet<Character>());  
            cl.add(new HashSet<Character>());  
            sl.add(new HashSet<Character>());  
        }  
        int n = board.length;  
        for(int i=0; i<n; i++) {  
            for(int j=0; j<n; j++) {  
                char c = board[i][j];  
                if(c=='.') continue;  
                else if(rl.get(i).contains(c) || cl.get(j).contains(c) || sl.get(i/3*3 + j/3).contains(c)) return false;  
                else {  
                    rl.get(i).add(c);  
                    cl.get(j).add(c);  
                    sl.get(i/3*3+j/3).add(c);  
                }  
            }  
        }
        return true;
    }
}
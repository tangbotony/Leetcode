package com.tangbo.exercise.rectanglearea;
/*
 * 223. Rectangle Area My Submissions Question
	Total Accepted: 31705 Total Submissions: 108326 Difficulty: Easy
	Find the total area covered by two rectilinear rectangles in a 2D plane.
	
	Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
	
	Rectangle Area
	Assume that the total area is never beyond the maximum possible value of int.
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {  
        int blx = Math.max(A, E);  
        int bly = Math.max(B, F);  
        int rtx = Math.min(C, G);  
        int rty = Math.min(D, H);  
        int res = (C-A) * (D-B) + (G-E) * (H-F);  
        if(blx >= rtx || bly >= rty) return res;  
        return res - (rtx - blx) * (rty - bly);  
    }  
}
package com.amazon.treasuretruck.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Solution {
	public int numberAmazonTreasureTrucks(int rows, int column, List<List<Integer>> grid) {
		int counter = 0;
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).size(); j++) {
				if(grid.get(i).get(j) == 1) {
					bfs(grid, i, j);
					counter++;
				}
			}
		}
		return counter;
	}
	private static void bfs( List<List<Integer>> grid, int i, int j){
		if(grid.get(i).get(j) == 1)
			grid.get(i).set(j,0);
		if(i + 1 < grid.size() && grid.get(i + 1).get(j) == 1)
			bfs(grid,i+1,j);
		if(i - 1 >= 0 && grid.get(i - 1).get(j) == 1)
			bfs(grid,i-1,j);
		if(j + 1 < grid.get(i).size() && grid.get(i).get(j + 1) == 1){
			bfs(grid,i,j+1);
		}
		if(j-1 >= 0 && grid.get(i).get(j - 1) == 1){
			bfs(grid,i,j-1);
		}
	}

}

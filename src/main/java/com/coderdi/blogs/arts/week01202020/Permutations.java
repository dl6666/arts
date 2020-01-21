package com.coderdi.blogs.arts.week01202020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a list of distinct integers, returns all possible permutations.
 * https://leetcode.com/problems/permutations/submissions/
 */
public class Permutations {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    dfs(nums, new boolean[nums.length], new ArrayList<>(), res);
    return res;
  }

  private void dfs(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> res) {
    if (path.size() == nums.length)  {
      res. add(new ArrayList<>(path));
    }
    for (int i = 0; i < visited.length; i++) {
      if (!visited[i]) {
        path.add(nums[i]);
        visited[i] = true;
        dfs(nums, visited, path, res);
        path.remove(path.size() - 1);
        visited[i] = false;
      }
    }
  }
}

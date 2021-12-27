# Algoexpert.io

# Arrays

## Two Number Sum

<div class="html">
<p>
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.
</p>
<p>
  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.
</p>
<p>
  You can assume that there will be at most one pair of numbers summing up to
  the target sum.
</p>
<h3>Sample Input</h3>
<pre><span>array</span> = [3, 5, -4, 8, 11, 1, -1, 6]
<span>targetSum</span> = 10
</pre>
<h3>Sample Output</h3>
<pre>[-1, 11] <span>// the numbers could be in reverse order</span>
</pre>
</div>

<hr />

# Valid Subsequence
<div class="html">
<p>
  Given two non-empty arrays of integers, write a function that determines
  whether the second array is a subsequence of the first one.
</p>
<p>
  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For
  instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
  <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>. Note
  that a single number in an array and the array itself are both valid
  subsequences of the array.
</p>
<h3>Sample Input</h3>
<pre><span>array</span> = [5, 1, 22, 25, 6, -1, 8, 10]
<span>sequence</span> = [1, 6, -1, 10]
</pre>
<h3>Sample Output</h3>
<pre>true
</pre>
</div>
# DSA Study Plan — 70 Questions in 5 Weeks

A beginner-friendly, topic-wise plan to learn and practice Data Structures & Algorithms using LeetCode. Track your progress by checking off boxes as you go.

## How to Use This Plan

- **Each week = 2 topics, 7 questions per topic = 14 questions/week.**
- **Daily rhythm:** ~2 questions/day, 5 days/week, with 2 days for revision/catch-up.
- **Before solving:** Spend 15–20 min understanding the pattern/technique for that topic (see notes below).
- **When stuck:** Try for 25–30 min first. If stuck, read the editorial/hints, understand it, then re-solve it yourself from scratch the next day.
- **After solving:** Write a 2–3 line note on the approach/pattern used — this becomes your personal cheat sheet.
- **Revise:** Before starting a new week, re-attempt 2–3 questions from the previous week (don't look at old code).

---

## Week 1: Arrays + Strings

### Topic 1 — Arrays
**Core patterns:** Hashing/hash maps, prefix products, sliding window, sorting + two pointers, in-place matrix manipulation.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Two Sum | Hash map for complement lookup | ☐ |
| 2 | Best Time to Buy and Sell Stock | Single pass, track min price | ☐ |
| 3 | Product of Array Except Self | Prefix & suffix products | ☐ |
| 4 | Maximum Subarray | Kadane's Algorithm | ☐ |
| 5 | Merge Intervals | Sort + merge overlapping ranges | ☐ |
| 6 | Rotate Array | Reversal trick / cyclic replacement | ☐ |
| 7 | Set Matrix Zeroes | In-place marking with first row/col | ☐ |

### Topic 2 — Strings
**Core patterns:** Hashing, two pointers, sliding window, frequency counting.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Valid Anagram | Frequency count / hash map | ☐ |
| 2 | Longest Common Prefix | Vertical/horizontal scanning | ☐ |
| 3 | Valid Palindrome | Two pointers | ☐ |
| 4 | Group Anagrams | Hash map with sorted string as key | ☐ |
| 5 | Longest Substring Without Repeating Characters | Sliding window + hash set | ☐ |
| 6 | String to Integer (atoi) | Careful edge-case parsing | ☐ |
| 7 | Minimum Window Substring | Sliding window + frequency map | ☐ |

**Milestone:** By end of Week 1, you should be comfortable with hash maps, two pointers, and sliding windows — these show up everywhere in DSA.

---

## Week 2: Linked List + Stack/Queue

### Topic 3 — Linked List
**Core patterns:** Fast/slow pointers, dummy nodes, in-place reversal, hash map for LRU.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Reverse Linked List | Iterative pointer reversal | ☐ |
| 2 | Middle of the Linked List | Fast & slow pointers | ☐ |
| 3 | Merge Two Sorted Lists | Dummy node + merge | ☐ |
| 4 | Linked List Cycle | Floyd's cycle detection | ☐ |
| 5 | Remove Nth Node From End of List | Two pointers with gap | ☐ |
| 6 | Reorder List | Find middle + reverse + merge | ☐ |
| 7 | LRU Cache | Hash map + doubly linked list | ☐ |

### Topic 4 — Stack & Queue
**Core patterns:** Monotonic stack, stack simulation, deque for sliding window.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Valid Parentheses | Stack matching | ☐ |
| 2 | Implement Queue using Stacks | Two-stack simulation | ☐ |
| 3 | Min Stack | Auxiliary stack for min tracking | ☐ |
| 4 | Daily Temperatures | Monotonic decreasing stack | ☐ |
| 5 | Next Greater Element I | Monotonic stack + hash map | ☐ |
| 6 | Evaluate Reverse Polish Notation | Stack-based evaluation | ☐ |
| 7 | Sliding Window Maximum | Monotonic deque | ☐ |

**Milestone:** You should now recognize when a problem needs a stack (matching/nesting, "next greater" patterns) vs. a two-pointer/fast-slow approach.

---

## Week 3: Trees + Binary Search

### Topic 5 — Trees
**Core patterns:** DFS (recursive), BFS (level order), recursion with return values.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Maximum Depth of Binary Tree | Recursive DFS | ☐ |
| 2 | Same Tree | Recursive comparison | ☐ |
| 3 | Invert Binary Tree | Recursive swap | ☐ |
| 4 | Binary Tree Level Order Traversal | BFS with queue | ☐ |
| 5 | Lowest Common Ancestor of a Binary Tree | Recursive DFS with return propagation | ☐ |
| 6 | Validate Binary Search Tree | DFS with min/max bounds | ☐ |
| 7 | Serialize and Deserialize Binary Tree | Preorder DFS + queue reconstruction | ☐ |

### Topic 6 — Binary Search
**Core patterns:** Search space reduction, binary search on answer.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Binary Search | Classic binary search | ☐ |
| 2 | Search Insert Position | Binary search (lower bound) | ☐ |
| 3 | First Bad Version | Binary search on answer | ☐ |
| 4 | Search in Rotated Sorted Array | Modified binary search | ☐ |
| 5 | Find Peak Element | Binary search on slope | ☐ |
| 6 | Koko Eating Bananas | Binary search on answer space | ☐ |
| 7 | Median of Two Sorted Arrays | Binary search on partitions | ☐ |

**Milestone:** Recursion should feel natural by now. "Binary search on the answer" is a big unlock — notice how it applies beyond sorted arrays.

---

## Week 4: Heap + Graphs

### Topic 7 — Heap / Priority Queue
**Core patterns:** Min/max heap, top-K problems, greedy scheduling.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Kth Largest Element in an Array | Min-heap of size K | ☐ |
| 2 | Top K Frequent Elements | Heap or bucket sort | ☐ |
| 3 | Merge K Sorted Lists | Min-heap across list heads | ☐ |
| 4 | Find Median from Data Stream | Two heaps (max + min) | ☐ |
| 5 | Task Scheduler | Max-heap + greedy | ☐ |
| 6 | Reorganize String | Max-heap greedy placement | ☐ |
| 7 | IPO | Two heaps (capital + profit) | ☐ |

### Topic 8 — Graphs
**Core patterns:** DFS/BFS on grids/graphs, topological sort, Dijkstra's.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Number of Islands | DFS/BFS grid traversal | ☐ |
| 2 | Clone Graph | DFS/BFS + hash map for visited copies | ☐ |
| 3 | Flood Fill | DFS/BFS grid traversal | ☐ |
| 4 | Course Schedule | Topological sort / cycle detection | ☐ |
| 5 | Pacific Atlantic Water Flow | Multi-source DFS/BFS | ☐ |
| 6 | Word Ladder | BFS shortest path | ☐ |
| 7 | Network Delay Time | Dijkstra's algorithm | ☐ |

**Milestone:** Heaps for "top-K"/"streaming" problems, and graph BFS/DFS for connectivity/shortest-path — two of the most interview-common patterns.

---

## Week 5: DP + Backtracking

### Topic 9 — Dynamic Programming
**Core patterns:** Memoization, tabulation, 1D/2D DP, subsequence/subset DP.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Climbing Stairs | 1D DP (Fibonacci pattern) | ☐ |
| 2 | House Robber | 1D DP with choice (take/skip) | ☐ |
| 3 | Coin Change | Unbounded knapsack DP | ☐ |
| 4 | Longest Increasing Subsequence | 1D DP / binary search optimization | ☐ |
| 5 | Partition Equal Subset Sum | 0/1 knapsack (subset sum) | ☐ |
| 6 | Longest Common Subsequence | 2D DP on two strings | ☐ |
| 7 | Edit Distance | 2D DP with insert/delete/replace | ☐ |

### Topic 10 — Backtracking
**Core patterns:** Recursive exploration + pruning, decision trees.

| # | Problem | Key Technique | Done |
|---|---------|---------------|------|
| 1 | Subsets | Backtracking (include/exclude) | ☐ |
| 2 | Permutations | Backtracking with swapping/used array | ☐ |
| 3 | Combination Sum | Backtracking with reuse allowed | ☐ |
| 4 | Generate Parentheses | Backtracking with validity pruning | ☐ |
| 5 | Word Search | DFS backtracking on grid | ☐ |
| 6 | Palindrome Partitioning | Backtracking + palindrome check | ☐ |
| 7 | N-Queens | Backtracking with constraint checking | ☐ |

**Milestone:** DP and backtracking are the hardest for beginners — expect to revisit these topics more than once. That's normal.

---

## General Tips

- **Don't memorize solutions** — memorize *patterns* (sliding window, two pointers, monotonic stack, DFS/BFS, DP on subsequences, backtracking template).
- **Re-solve, don't just re-read.** Passive reading of solutions doesn't build muscle memory.
- **Keep a "mistakes log"** — note what tripped you up (off-by-one errors, edge cases, wrong data structure) and review it weekly.
- **After Week 5**, do a full revision pass: pick 2 random questions per topic (20 total) and solve them cold, timed, to simulate interview conditions.
- **Optional extension:** Once comfortable, explore Tries, Union-Find, Segment Trees, and Greedy algorithms as a natural next step.

---

*Total: 70 questions · 10 topics · 5 weeks · ~2 problems/day*

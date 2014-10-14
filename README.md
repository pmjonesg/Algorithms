Algorithms
==========

Collection of Algorithms written in Java.
The purpose of this repository is to serve as a library for future projects, and as a reference manual. In this description general algorithms will be analyzed, specific algorithms will have their respective description in the code.

=========
### Index
* Analysis of divide-and-conquer algorithms

=============================================
####Analysis of divide-and-conquer algorithms
=============================================
Divide-and-conquer algorithms are characterized by 3 steps at each level of recursion:
* **Divide** the problem into subproblems that resemble the original.
* **Conquer** the subproblems recursively, or straightforwardly if possible.
* **Combine** the solutions of the subproblems into the solution of the original problem.
 
Because of its recursive nature, these algorithms describe its running time in terms of smaller inputs after each recursion.
If small enough, *n <= c* for a constant time c, meaning it takes a constant time represented as O(1).

Otherwise, a list of size *n* will have *a* sublists, each *1/b* the size of the original. As it takes time *T(n/b)* to solve a
subproblem of size *n/b*, it will take *aT(n/b)* to solve all of them. Assuming it takes *D(n)* time to divide the problem into 
subproblems and *C(n)* time to combine them into the final solution we get:

    T(n) = O(1)                      if n <= c,
         = aT(n/b) + D(n) + C(n)     otherwise.

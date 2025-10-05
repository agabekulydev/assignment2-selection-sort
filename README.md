# Assignment 2 – Algorithmic Analysis and Peer Code Review
### Pair 1: Basic Quadratic Sorts
**Student B:** Selection Sort (with early termination optimization)  
**Partner:** [Имя твоего партнёра] – Insertion Sort

---

## 📘 Project Overview
This repository implements the **Selection Sort algorithm** with optimizations:
- Bidirectional selection (min & max per pass)
- Early termination when no swaps occur
- Pre-check for already sorted arrays (O(n) best case)
- Performance tracking for comparisons, swaps, reads, writes, and time.

---

## 🧠 Algorithm Complexity
| Case | Time Complexity | Space Complexity | Description |
|------|-----------------|------------------|--------------|
| Best | Θ(n) | O(1) | Already sorted (detected early) |
| Average | Θ(n²) | O(1) | Typical unsorted input |
| Worst | Θ(n²) | O(1) | Reverse-sorted array |

---

## ⚙️ Project Structure
```
assignment2-selection-sort/
├── src/main/java/com/assignment2/algorithms/SelectionSort.java
├── src/main/java/com/assignment2/metrics/PerformanceTracker.java
├── src/main/java/com/assignment2/cli/BenchmarkRunner.java
├── src/test/java/com/assignment2/algorithms/SelectionSortTest.java
├── docs/analysis-report.docx
├── docs/performance-plots/selection-sort.png
└── pom.xml

```


## 🧪 How to Run

### Run benchmark:
```bash
mvn compile exec:java -Dexec.mainClass="com.assignment2.cli.BenchmarkRunner"

mvn test
 Benchmark Results
n=100, time=0,840 ms, comparisons=5101, swaps=92
n=1000, time=20,919 ms, comparisons=501001, swaps=993
n=10000, time=126,702 ms, comparisons=50009997, swaps=9986
n=100000, time=7417,909 ms, comparisons=5000099890, swaps=99944
```
Observation:
Execution time and comparisons grow quadratically with input size (O(n²)),
while swaps increase linearly (O(n)).

📈 Performance Plot

Below is the performance chart showing execution time (ms) vs input size (n):

👨‍💻 Author

Name: Agabekuly Asylbek
Group: SE-2438
Role: Student B – Selection Sort
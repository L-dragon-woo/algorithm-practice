# algorithm-practice

---

## 에라토스테네스의 체(Sieve of Eratosthenes)
> 특정 범위 내에서 쉽게 소수 판정

소수(prime number): 1과 자기 자신의 반수로 밖에 나누어 떨어지지 않는 1 이외의 정수, **즉 양의 약수가 2개인 자연수 혹은 정수**
-막무가내로 정수 N에서 소수인지 판별하려고 하면 N개의 수에서 2의 배수 빼고 3의 배수 빼고 ...이런 방식을 반복할 것이다.
하지만 **에라토스테네스의 체**를 활용하면 이런 방식을 사용하지 않는다.

만약 n보다 작은 어떤 수 m이 m=ab라면 a와 b중 적어도 하나는 √n이하이다. **즉 n보다 작은 합 성수 m은 √n보다 작은 수의 배수만 체크해도 전부 지워진다는 의미!!**

### 하지만 이것은 특정 범위 내의 소수를 만정하는 데에만 효율적임!! 

---

## 유클리드 호제법(Euclidean algorithm)
>두 양의 정수 혹은 두 다항식의 최대공약수 구하기

두 양의 정수 a,b(a>b)에 대하여 a=bq+r(0<=r<b)이라 하면 a,b의 최대공약수는 b,r의 최대공약수와 같다.
**즉, gcd(a,b)=gcd(b,r)** 여기서 만약 r=0이면 a,b의 최대공약수는 b가 된다.

*참고로 두 정수 a,b의 최소공배수는  a * b / 최대공약수*

보통은 나머지가 0이 될때까지 연속해서 사용한다.

ex) 2484와 4212의 최대 공약수 구하기
```
4212=2484 * 1 + 1728
2484=1728 * 1 + 756
1728=756 * 2 + 216
756=216 * 3 + 108
216=108 * 2
따라서 두 수의 최대공약수는 108
```

---

## HashMap
> HashMap의 한계

HashMap은 일단 자바에서 키(key)와 값(Value)쌍을 저장하는 자료 구조를 뜻하고 이 키(key)는 고유하고 키를 사용하여 해당하는 값을 빠르게 검색 가능하다

**hashMap의 특징**
1. 키를 기반한 빠른 액세스(시간 복잡도가 O(1)이다)
2. 순서를 보장하지 않는다.(**왜냐면 내부적으로 키의 순서를 보장하지 않는다**)
3. 키의 중복이 불가능하다.(HashMap의 특성상 이미 존재하는 키에 대해 값을 저장하면 기존 값이 덮어씌워진다. 또한 key로 값을 찾는것이므로 같은 키를 갖는 여러 value가 존재할 수 없다.)
4. 키 기반의 유연성 : 어떤 객체든 키로 사용할 수 있다.

<img width="1326" height="784" alt="Image" src="https://github.com/user-attachments/assets/3f11afa9-a033-47d4-a53f-03416308ac20" />

**hashMap의 한계**

1. HashMap은 **버킷 배열**을 기반으로 데이터를 저장, 데이터가 많아지면 같은 인덱스에 여러 값이 연결되어 해시 충돌이 생긴다.

2. HashMap은 **멀티스레드환경**에서 동기화되지 않기 때문에, 동시에 접근하면 내부 구조가 쉽게 망가지므로 **thread-safe하지 않다.**


->이러한 멀티스레드 환경을 효율적으로 지원하기 위해서 **ConcurrentHashMap**을 사용하면 버킷/구역 단위로 lock을 걸어서 서로 다른 키에 대한 작업은 최대한 병렬로 돌게 한다.

---

## Array
>Array vs List

1. Array는 **고정길이**를 갖지만 List는 **동적길이**를 갖는다.
2. 속도는 Array와 ArrayList 둘다 빠르지만 **추가는 List가 월등히 빠르다**

>Array: char[] vs String[]

- char는 **primitive(원시타입)**이지만, String은 **객체(Object)**이기 때문에 메모리 구조와 생성 비용, 비교 방식, 변경 방식 등 **모든 면에서 차이가 난다**

---

## Floyd-Warshall Algorithm

>Floyd-Warshall Algorithm이란?

1. 다익스타의 경우 한 지점에서 다른 특정 지점까지의 최단 경로를 구하는 알고르짐이다. 그러나 **모든 지점에서 다른 모든 지점까지의 최단 경로를 구하는 경우 사용되는 알고리즘**

2. 다익스트라의 경우 단계마다 최단 거리를 가지는 노드를 하나씩 반복적으로 선택하고 이후 해당 노드를 거쳐가는 경로를 확인하며 최단 거리 테이블을 갱신시키는 방식이지만, 플로이드 워셜 알고리즘 또한 단계마다 '거쳐 가는 노드'를 기준으로 알고리즘을 수행한다. 하지만, **매 단계마다 방문하지 않은 노드 중에서 최단 거리를 갖는 노드를 찾을 필요가 없다.**

3. 다익스트라는 한 지점에서 다른 지점까지의 최단 거리이기 때문에 1차원 리스트에 저장한다. 하지만, 플로이드 워셜은 2차원 테이블에 최단 거리 정보를 저장한다.**(모든 지점에서 다른 모든 지점까지의 최단 거리를 저장해야 하기 때문이다.)**

>점화식
<img width="523" height="70" alt="image" src="https://github.com/user-attachments/assets/9148b2bb-ad7d-4cd7-841c-e293a4929956" />

<img width="1200" height="485" alt="image" src="https://github.com/user-attachments/assets/bb15721a-a97f-4ff5-877e-e5f06a0760f6" />




---

  
## 다익스트라 알고리즘(Dijkstra Algorithm)

> 하나의 시작 정점에서 다른 모든 정점까지의 최단 경로를 구하는 알고리즘

### 개요
다익스트라 알고리즘은 가중치가 있는 그래프에서 특정 시작 노드로부터 다른 모든 노드까지의 최단 거리를 구하는 알고리즘이다.  
단, 간선의 가중치는 음수가 없어야 한다.

### 특징
1. 단일 출발점(Single Source) 최단 경로 알고리즘이다.
2. 가중치가 있는 그래프에서 사용 가능하지만, 음수 가중치는 허용하지 않는다.
3. 탐욕적(Greedy) 방식으로 동작한다.
4. 보통 우선순위 큐(PriorityQueue)를 사용해 효율을 높인다.

### 동작 원리
1. 시작 정점을 선택하고, 시작 정점의 거리를 0으로 설정한다.
2. 나머지 모든 정점의 거리는 무한(INF)으로 초기화한다.
3. 아직 방문하지 않은 정점 중에서 현재 최단 거리가 가장 짧은 정점을 선택한다.
4. 해당 정점을 거쳐 다른 정점으로 가는 거리와 기존 거리를 비교하여 더 짧으면 갱신한다.
5. 모든 정점을 방문할 때까지 3~4 과정을 반복한다.

### 핵심 아이디어
- 한 번 최단 거리로 선택된 정점의 거리 값은 이후에 절대 바뀌지 않는다.
- 이미 확정된 최단 경로를 기반으로 주변 노드들의 거리를 점진적으로 줄여나간다.

### 시간 복잡도
- 인접 리스트 + 우선순위 큐 사용 시  
  O(E log V)
- 인접 행렬 사용 시  
  O(V²)

### 다익스트라 vs 플로이드 워셜
| 구분 | 다익스트라 | 플로이드 워셜 |
|----|----|----|
| 출발점 | 한 정점 | 모든 정점 |
| 거리 저장 | 1차원 배열 | 2차원 배열 |
| 음수 가중치 | 불가능 | 가능(음수 사이클 불가) |
| 시간 복잡도 | O(E log V) | O(V³) |

### 사용 예시
- 네비게이션 최단 경로 탐색
- 네트워크 라우팅
- 게임 맵 이동 거리 계산
- 특정 시작점에서의 최소 비용 문제

### 주의사항
- 음수 가중치가 존재하는 경우 다익스트라 알고리즘을 사용하면 잘못된 결과가 나온다.
- 이 경우 벨만 포드(Bellman-Ford) 알고리즘을 사용해야 한다.

---

## LinkedHashMap
### LinkedHashMap이란?

### HashMap의 기능에 순서 유지 기능이 추가된 Map 구현체

**LinkedHashMap은 HashMap을 상속받아 구현된 자료구조로,
데이터의 삽입 순서 또는 접근 순서를 유지하는 것이 가장 큰 특징이다.**

*HashMap은 저장된 요소의 **순서를 보장하지 않지만**,
LinkedHashMap은 내부적으로 Hash Table + Doubly Linked List(이중 연결 리스트) 구조를 사용해 **순서를 유지한다.***

### HashMap vs LinkedHashMap 차이

| 구분     | HashMap    | LinkedHashMap                   |
| ------ | ---------- | ------------------------------- |
| 순서 보장  | ❌ 보장하지 않음  | ✅ 삽입 순서 또는 접근 순서 유지             |
| 내부 구조  | Hash Table | Hash Table + Doubly Linked List |
| 검색 속도  | O(1)       | O(1)                            |
| 메모리 사용 | 상대적으로 적음   | 약간 더 사용                         |
| 사용 목적  | 일반적인 Map   | 순서가 중요한 Map                     |


- 키 기반 빠른 검색 → 평균 시간복잡도 O(1)

- 삽입 순서를 유지할 수 있음

- 접근 순서 기준으로 정렬하도록 설정 가능

- HashMap과 거의 동일한 사용법

- 순서를 유지하기 위해 추가적인 메모리를 사용

## LinkedHashMap 생성자 파라미터
`new LinkedHashMap<>(initialCapacity, loadFactor, accessOrder);`

1. initialCapacity

- 초기 해시 버킷 배열 크기

- 기본값: 16

- 내부 배열의 크기를 의미

- 예상 데이터 수가 많으면 크게 설정 가능

2. loadFactor (예: 0.75f)

- 해시 테이블이 몇 % 찼을 때 내부 배열을 확장할지 결정하는 값

예시:

`16 × 0.75 = 12`

→ 요소가 12개가 되면 내부 배열을 2배로 확장

- 기본값: 0.75f

- 성능과 메모리의 균형값

- f는 float 타입을 의미

3. accessOrder (true / false)

- 순서 유지 기준 설정

- false (기본값) → 삽입 순서 유지

- true → 접근 순서 유지

예시:

`new LinkedHashMap<>(16, 0.75f, false); // 삽입 순서 유지`


<!---LeetCode Topics Start-->
# LeetCode Topics
## Hash Table
|  |
| ------- |
| [0013-roman-to-integer](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0013-roman-to-integer) |
| [0383-ransom-note](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0383-ransom-note) |
## Math
|  |
| ------- |
| [0013-roman-to-integer](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0013-roman-to-integer) |
## String
|  |
| ------- |
| [0006-zigzag-conversion](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0006-zigzag-conversion) |
| [0013-roman-to-integer](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0013-roman-to-integer) |
| [0058-length-of-last-word](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0058-length-of-last-word) |
| [0125-valid-palindrome](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0151-reverse-words-in-a-string) |
| [0383-ransom-note](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0383-ransom-note) |
| [0392-is-subsequence](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0392-is-subsequence) |
## Two Pointers
|  |
| ------- |
| [0125-valid-palindrome](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0151-reverse-words-in-a-string) |
| [0392-is-subsequence](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0392-is-subsequence) |
## Counting
|  |
| ------- |
| [0383-ransom-note](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0383-ransom-note) |
## Dynamic Programming
|  |
| ------- |
| [0392-is-subsequence](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0392-is-subsequence) |
## Tree
|  |
| ------- |
| [0637-average-of-levels-in-binary-tree](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0637-average-of-levels-in-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0637-average-of-levels-in-binary-tree](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0637-average-of-levels-in-binary-tree) |
## Breadth-First Search
|  |
| ------- |
| [0637-average-of-levels-in-binary-tree](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0637-average-of-levels-in-binary-tree) |
## Binary Tree
|  |
| ------- |
| [0637-average-of-levels-in-binary-tree](https://github.com/L-dragon-woo/algorithm-practice/tree/master/0637-average-of-levels-in-binary-tree) |
<!---LeetCode Topics End-->
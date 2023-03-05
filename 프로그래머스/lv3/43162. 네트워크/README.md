# [level 3] 네트워크 - 43162 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/43162) 

### 성능 요약

메모리: 77.2 MB, 시간: 0.10 ms

### 구분

코딩테스트 연습 > 깊이／너비 우선 탐색（DFS／BFS）

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.</p>

<p>컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.</p>

<h5>제한사항</h5>

<ul>
<li>컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.</li>
<li>각 컴퓨터는 0부터 <code>n-1</code>인 정수로 표현합니다.</li>
<li>i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.</li>
<li>computer[i][i]는 항상 1입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>computers</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>3</td>
<td>[[1, 1, 0], [1, 1, 0], [0, 0, 1]]</td>
<td>2</td>
</tr>
<tr>
<td>3</td>
<td>[[1, 1, 0], [1, 1, 1], [0, 1, 1]]</td>
<td>1</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>예제 #1<br>
아래와 같이 2개의 네트워크가 있습니다.<br>
  <img src="https://grepp-programmers.s3.amazonaws.com/files/ybm/5b61d6ca97/cc1e7816-b6d7-4649-98e0-e95ea2007fd7.png" title="" alt="image0.png"></p>

<p>예제 #2<br>
아래와 같이 1개의 네트워크가 있습니다.<br>
  <img src="https://grepp-programmers.s3.amazonaws.com/files/ybm/7554746da2/edb61632-59f4-4799-9154-de9ca98c9e55.png" title="" alt="image1.png"></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
---
### 후기
        이 문제는 DFS를 이용하여 해결했다. 재귀함수를 이용해서 컴퓨터 갯수만큼 for문을 돌면서 비교중인 인덱스가 자기자신이 아니고(i!=j) 아직 방문한적이 없으며(false) 다른 컴퓨터와 연결된 경우(computer[i][j]==1) answer의 값을 증가시켰다. 처음에 자기자신이 아닌조건을 걸지 않아 틀린 답이 나왔었다. 
        DFS와 BFS의 개념을 이해했다고 생각했지만 문제에 적용하는게 힘들었다. 더 많은 문제를 풀어봐야 할 듯

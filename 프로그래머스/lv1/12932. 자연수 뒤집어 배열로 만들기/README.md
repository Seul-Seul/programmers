# [level 1] 자연수 뒤집어 배열로 만들기 - 12932 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12932) 

### 성능 요약

메모리: 78.2 MB, 시간: 0.14 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.</p>

<h5>제한 조건</h5>

<ul>
<li>n은 10,000,000,000이하인 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>12345</td>
<td>[5,4,3,2,1]</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

---
### 후기
        처음 풀었던 방법은 long 타입 n을 문자열로 만들고 글자 하나씩 잘라 배열에 저장 후  answer배열에 거꾸로 저장했다.하고나니 코드의 가독성이 별로 였고
        그러던 중 Stringbuilder에 reverse()메서드가 생각나서 문자열로 만듬과 동시에 뒤집어버리니 코드가 간결해졌다. 
        제출하고 다른 사람 코드를 보니 StringBuilder에 toArray()메서드도 달 수 있는 걸 발견했다. 이 시간 이후 Stringbuilder관련 자료 더 찾아 볼 것

a = int(input())
b = list(map(int, input().split()))
d = 0
for i in range(a):
 d += b[i] / max(b) * 100
d = d / a
print(d)
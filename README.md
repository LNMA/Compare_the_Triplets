# problem-Compare_the_Triplets

1-Review:

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale 0 from 100 to

for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet a=(a[0],a[1],a[2]), and the rating for Bob's challenge to be the triplet
b=(b[0],b[1],b[2]).

Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], a[2] and with b[2].

If a[i]>b[i] then Alice is awarded 1 point.
If a[i]<b[i] then Bob is awarded 1 point.
If a[i]=b[i] then neither person receives a point.

Comparison points is the total points a person earned.

Given a and b determine their respective comparison points.

2-Input Format

The first line contains 3 space-separated integers a[0], a[1], a[2] and , describing the respective values in triplet a.
The second line contains 3 space-separated integers b[0], b[1], b[2] and , describing the respective values in triplet b.

3-Output Format

Return an array of two integers denoting the respective comparison points earned by Alice and Bob.

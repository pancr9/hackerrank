### Cost Balancing

Anita and her friends, go on a trip. Now, they are back home and need to balance their expenses. 
During the trip, they perform many transactions but don't divide the expenses equally all the time. 
The total expenses should be balanced in such a way that everyone pays an equal amount. 
Given the information about the transactions, Anita needs to find who owes others and who should get money.

#### Input Format

The first line contains two space-separated integers n and m, denoting total number of transactions and total number of friends in the group.

Each of the next n lines contains two space-separated integers, first one is the ID of the friend and second one denotes the amount paid.

#### Constraints
* 1 <= m <= n <= 50
* 0 <= amountofmoney <= 1000
* ID numbers will be all the numbers from 1 to m.

#### Output Format

For each ID from 1 to m print a line with two space separated integers, first one is the ID of the friend and second one is the amount that the person owes or gets.

Note that, a positive amount next to an ID indicates that the person should receive that amount, while a negative amount indicates that he/she owes that amount to the rest of the group.

##### Sample Input 0
7   5

1   200

2   200

3   100

4   10

5   54

5   54

3   100


##### Sample Output 0
1   54

2   57

3   57

4   -133

5   -35

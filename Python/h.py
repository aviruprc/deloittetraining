lista = []
for var in 'sankranti':
    lista.append(var)
lista
listb = [var for var in 'sankranti']
#this is a comprehension

listb
#list comprehension
num_list = [x for x in range(17) if x%2 == 0]
num_list
list_a = [1, 2, 3, 4]
list_b = [3, 4, 5, 6]

num = []

for x in list_a:
    for y in list_b:
        if x==y:
            num.append(x)

list_a = [1, 2, 3, 4]
list_b = [3, 4, 5, 6]
num = [x for x in list_a for y in list_b if x == y ]
num
num = [ (x , y) for x in list_a for y in list_b if x == y ]
num

num = [ (x , y) for x in range(3) for y in range(x) ]
numa = []
for x in range(3):
    for y in range(x):
        numa.append( (x, y) )
num
numa
%logstart -o
%history -f h.py
